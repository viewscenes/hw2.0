package com.hw.controller.worker;

import cn.com.pattek.pesb.client.PESBClient;
import com.hw.common.utils.DateUtil;
import com.hw.common.utils.StringTool;
import com.hw.domain.po.RadioMarkRelTab;
import com.hw.domain.po.RadioMarkZstViewTab;
import com.hw.domain.po.RadioStreamResultTab;
import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.po.ZresRunplanTab;
import com.hw.domain.po.asr.ASRCmdBean;
import com.hw.domain.po.asr.ASRResBean;
import com.hw.service.RadioMarkRelService;
import com.hw.service.RadioMarkZstViewService;
import com.hw.service.RadioStreamResultService;
import com.hw.service.ResHeadendService;
import com.hw.service.SequenceService;
import com.hw.service.SysConfigurationService;
import com.hw.service.ZresRunplanService;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.transaction.annotation.Transactional;

@Component
public class RadioMarkWorker {

    private static Log log = LogFactory.getLog(RadioMarkWorker.class);
    @Resource
    private RadioMarkRelService radioMarkRelService;

    @Resource
    private RadioStreamResultService radioStreamResultService;

    @Resource
    private RadioMarkZstViewService markZstViewService;


    @Resource
    private ZresRunplanService runplanService;


    @Resource
    private ResHeadendService resHeadendService;

    @Resource
    private SequenceService sequenceService;

    @Resource
    private SysConfigurationService sysConfigurationService;

    ExecutorService threadPool=	Executors.newFixedThreadPool(10);


    /**
     * 每5分钟执行一次打分
     */
    @Scheduled(initialDelay = 10000,  fixedDelay = 1*60*1000)
    public void execute() {
            log.info("任务检查！");
        List<RadioMarkRelTab>  radioRelList =  radioMarkRelService.getNotMark();
        if(radioRelList!=null&&radioRelList.size()>0){
            for(RadioMarkRelTab rel:radioRelList){
                threadPool.execute(new Runnable(){
                    @Override
                    public void run() {

                        Integer resultId = rel.getResultId();
                        RadioStreamResultTab radio = radioStreamResultService.selectById(resultId);
                        //文件存在才发送
                        if(radio!=null&&radio.getUrl()!=null&&radio.getReportType().intValue()==1){
                            log.info("判断录音文件是否存在："+radio.getUrl());
//                            if(existHttpPath(radio.getUrl())){
                                //是否已经打过分了
                                RadioMarkZstViewTab  mark = markZstViewService.selectByFileName(radio.getFilename());
                                //未打分
                                if(mark==null){
                                    try {
                                        ResHeadendTab headendTab = resHeadendService.selectById(radio.getHeadId());
                                        ZresRunplanTab runBean = runplanService.getRunplanByTaskId(radio.getTaskId());
                                        ASRResBean resBean = exucuteTask(getASRCmdBean(radio,headendTab,runBean));
                                        if(resBean.getTaskStatus().equals("203")) {
                                            readyAsrResult2DB(resBean, headendTab, runBean, radio);
                                            /**
                                             * 更新关系表
                                             */
                                            rel.setState(1);
                                            radioMarkRelService.update(rel);
                                        }else {
                                            log.info("打分失败");
                                            if(DateUtil.getTimeIntervalDaysByDate(radio.getStartDatetime(),new Date())>10){
                                                rel.setState(3);//文件不存在
                                                radioMarkRelService.update(rel);
                                            }
                                        }
                                    } catch (IOException e) {
                                        log.info("执行打分任务失败",e);
                                    }
                                }else {
                                    /**
                                     * 更新关系表
                                     */
                                    rel.setState(1);
                                    radioMarkRelService.update(rel);
                                }
//                            }else{
//                              /**
//                               * 更新关系表
//                               */
//                              rel.setState(3);//文件不存在
//                              radioMarkRelService.update(rel);
//                            }
                        }else{
                            /**
                             * 更新关系表
                             */
                            rel.setState(2);//数据不完整
                            radioMarkRelService.update(rel);
                        }
                    }

                });

            }
        }
    }

    private ASRCmdBean getASRCmdBean(RadioStreamResultTab radio,ResHeadendTab headendTab,ZresRunplanTab runplanTab) {
        ASRCmdBean bean = new ASRCmdBean();

        if (radio.getTaskId()!=null){
                if (runplanTab != null)
                    bean.setCollectChannel(runplanTab.getSatelliteChannel());
        }
        if(radio.getHeadId()!=null){
            bean.setCollectMethod(headendTab.getTypeId()==101?"4":"2");
        }
        bean.setReceiverType(radio.getReceiveType());
        bean.setFile(radio.getUrl());
        bean.setFileEndTime(DateUtil.getDateString(radio.getEndDatetime()));
        bean.setFileStartTime(DateUtil.getDateString(radio.getStartDatetime()));
        bean.setTaskEndTime(DateUtil.getDateString(radio.getEndDatetime()));
        bean.setTaskStartTime(DateUtil.getDateString(radio.getStartDatetime()));
        bean.setFreq(radio.getFrequency().toString());
        bean.setLanguage(radio.getLanguage());
        bean.setTaskId(radio.getResultId().toString());
        return  bean;
    }

    /**
     * 判断文件是否存在
     * @param httpPath
     * @return
     */
    private static Boolean existHttpPath(String httpPath){
        URL httpurl = null;
        try {
            httpurl = new URL(new URI(httpPath).toASCIIString());
            URLConnection urlConnection = httpurl.openConnection();
            Long TotalSize=Long.parseLong(urlConnection.getHeaderField("Content-Length"));
            if (TotalSize <= 0){
                return false;
            }
            return true;
        } catch (Exception e) {
            log.debug(httpurl + "文件不存在");
            return false;
        }
    }
    public static  void main(String args[]){
        String url="http://10.0.1.28/video/report/report.mp3";
        System.out.print(RadioMarkWorker.existHttpPath(url));
    }
    /**
     * 语音识别接口
     * @throws IOException
     */
    public ASRResBean exucuteTask(ASRCmdBean asrCmdBean) throws IOException {
        ASRResBean asrResBean = new ASRResBean();
        String xml = getCmdXml(asrCmdBean);
        PESBClient pesbClient = new PESBClient();
        try {

            log.info("发送给语音识别系统XML:\n"+xml);
            String taskXml = pesbClient.exucuteTask(xml);
            log.info("语音识别系统处理结果XML:\n"+taskXml);
            asrResBean = getResXml(taskXml);
        } catch (Exception e) {
            e.printStackTrace();
            asrResBean.setTaskStatus("0000");
            asrResBean.setErrorMessage("无法连接到语音识别系统,请检查网络...");
            return asrResBean;
        }

        return asrResBean;
    }
    /**
     *  语音识别接口发送参数方法
     * <p>class/function:com.viewscenes.axis
     * <p>explain:
     * <p>author-date:谭长伟 2012-7-16
     * @param:
     * @return:
     * @throws IOException
     */
    private   String getCmdXml(ASRCmdBean asrCmdBean) throws IOException {

        String result = "";

        ArrayList list = new ArrayList();

        Element tasks = new Element("tasks");

        tasks.setAttribute(new Attribute("type", asrCmdBean.getType()));

        tasks.setAttribute(new Attribute("wfType", asrCmdBean.getWfType()));

        Element task = new Element("task");

        task.setAttribute(new Attribute("id", asrCmdBean.getTaskId()));

        String filepath = asrCmdBean.getFile();
        if(filepath.indexOf("114.251.47.196")!=-1)
        {
            filepath = filepath.replace("http://114.251.47.196:80/video/",sysConfigurationService.getLocVideoLocation());

        }else
        {
            filepath = filepath.replace(sysConfigurationService.getLocVideoUrl(),sysConfigurationService.getLocVideoLocation());
        }
        Element e_file = new Element("file");
        e_file.addContent(filepath);

        Element e_fileStartTime = new Element("fileStartTime");
        e_fileStartTime.addContent(asrCmdBean.getFileStartTime());



        Element e_fileEndTime = new Element("fileEndTime");
        e_fileEndTime.addContent(asrCmdBean.getFileEndTime());

        Element e_taskStartTime = new Element("taskStartTime");
        e_taskStartTime.addContent(asrCmdBean.getTaskStartTime());

        Element e_taskEndTime = new Element("taskEndTime");
        e_taskEndTime.addContent(asrCmdBean.getTaskEndTime());

        Element e_freq = new Element("freq");
        e_freq.addContent(asrCmdBean.getFreq());

        Element e_language = new Element("language");
        e_language.addContent(asrCmdBean.getLanguage());

        Element e_collectMethod = new Element("collectMethod");
        e_collectMethod.addContent(asrCmdBean.getCollectMethod());

        Element e_collectChannel = new Element("collectChannel");
        if(asrCmdBean.getCollectChannel()!=null&&asrCmdBean.getCollectChannel().length()>0)

        {
            int channel=0;
            if(Integer.parseInt(asrCmdBean.getCollectChannel())>20)
            {
                channel =Integer.parseInt(asrCmdBean.getCollectChannel())-20;
            }else channel=Integer.parseInt(asrCmdBean.getCollectChannel());
            e_collectChannel.addContent(channel+"");
        }else
        {
            e_collectChannel.addContent(asrCmdBean.getCollectChannel());
        }
        Element receiverType = new Element("receiverType");
        //	asrCmdBean.setReceiverType("NI");
        if(asrCmdBean.getReceiverType()!=null)
        {
            if(asrCmdBean.getReceiverType().indexOf("NI")!=-1)
            {

                receiverType.addContent("NI-1000");
            }else if(asrCmdBean.getReceiverType().indexOf("252A")!=-1)
            {

                receiverType.addContent("BXM-252A");
            }else if(asrCmdBean.getReceiverType().indexOf("SDR")!=-1)
            {

                receiverType.addContent("SF-RM");

            }else if(asrCmdBean.getReceiverType().indexOf("VS201")!=-1)
            {

                receiverType.addContent("VS201");
            }
            else if(asrCmdBean.getReceiverType().indexOf("AMFT")!=-1)
            {

                receiverType.addContent("AMFT");
            }
            else if(asrCmdBean.getReceiverType().indexOf("TS")!=-1)
            {

                receiverType.addContent("ST-GBJC2C");
            }
            else
            {
                receiverType.addContent("NRD545");
            }
        }else {
            receiverType.addContent("");
        }
        task.addContent(e_file);

        task.addContent(e_fileStartTime);

        task.addContent(e_fileEndTime);

        task.addContent(e_taskStartTime);

        task.addContent(e_taskEndTime);

        task.addContent(e_freq);

        task.addContent(e_language);

        task.addContent(e_collectMethod);

        task.addContent(e_collectChannel);
        task.addContent(receiverType);

        list.add(task);

        Document doc = new Document(tasks);

        Element rootNode = doc.getRootElement();

        rootNode.setContent(list);
         Format format =  Format.getPrettyFormat();
         format.setEncoding("GB2312");
         format.setIndent(" ");
        XMLOutputter out = new XMLOutputter(format);
        StringWriter sw = new StringWriter();
        out.output(doc, sw);
        result = sw.toString();

        return result;
    }

    /**
     * 语音识别返回XML解析方法
     */
    private   ASRResBean getResXml(String xml){

        ASRResBean asrResBean = new ASRResBean();
        Element root = StringTool.getXMLRoot(xml);
        String type = root.getChild("Type").getText();
        String orderId = root.getChild("OrderID").getText();
        String TaskStatus = root.getChild("TaskStatus").getText();

        asrResBean.setType(type);
        asrResBean.setOrderID(orderId);
        if(!TaskStatus.equals("203"))
        {
            asrResBean.setTaskStatus("0000");//认为有错，不入库。

        }else
        {
            Element subEl = root.getChild("TimePeriod");

            String timePeriod_type =subEl.getAttributeValue("type") ;
            asrResBean.setTimePeriodType(timePeriod_type);
            asrResBean.setTaskStatus(TaskStatus);
            String status = subEl.getChild("Status").getText();
            asrResBean.setStatus(status);
            String file = subEl.getChild("File").getText();
            asrResBean.setFile(file);
            String StartTime = subEl.getChild("StartTime").getText();
            asrResBean.setStartTime(StartTime);
            String EndTime = subEl.getChild("EndTime").getText();
            asrResBean.setEndTime(EndTime);
            String AudibilityScore = subEl.getChild("AudibilityScore").getText();
            asrResBean.setAudibilityScore(AudibilityScore);

            String MusicRatio = subEl.getChild("MusicRatio").getText();
            asrResBean.setMusicratio(MusicRatio);
            String NoiseRatio = subEl.getChild("NoiseRatio").getText();
            asrResBean.setNoiseratio(NoiseRatio);
            String SpeechLen = subEl.getChild("SpeechLen").getText();
            asrResBean.setSpeechlen(SpeechLen);
            String TotalCM = subEl.getChild("TotalCM").getText();
            asrResBean.setTotalcm(TotalCM);


            String AudibilityConfidence = subEl.getChild("AudibilityConfidence").getText();
            asrResBean.setAudibilityConfidence(AudibilityConfidence);
            String ChannelName = subEl.getChild("ChannelName").getText();
            asrResBean.setChannelName(ChannelName);
            String ChannelNameConfidence = subEl.getChild("ChannelNameConfidence").getText();
            asrResBean.setChannelNameConfidence(ChannelNameConfidence);
            String ProgramName = subEl.getChild("ProgramName").getText();
            asrResBean.setProgramName(ProgramName);
            String ProgramNameConfidence = subEl.getChild("ProgramNameConfidence").getText();
            asrResBean.setProgramNameConfidence(ProgramNameConfidence);
            String LanguageName1 = subEl.getChild("LanguageName1").getText();
            asrResBean.setLanguageName1(LanguageName1);
            String LanguageName2 = subEl.getChild("LanguageName2").getText();
            asrResBean.setLanguageName2(LanguageName2);
            String LanguageName3 = subEl.getChild("LanguageName3").getText();
            asrResBean.setLanguageName3(LanguageName3);
            String LanguageName4 = subEl.getChild("LanguageName4").getText();
            asrResBean.setLanguageName4(LanguageName4);
            String LanguageName5 = subEl.getChild("LanguageName5").getText();
            asrResBean.setLanguageName5(LanguageName5);
            String LanguageConfidence1 = subEl.getChild("LanguageConfidence1").getText();
            asrResBean.setLanguageConfidence1(LanguageConfidence1);
            String LanguageConfidence2 = subEl.getChild("LanguageConfidence2").getText();
            asrResBean.setLanguageConfidence2(LanguageConfidence2);
            String LanguageConfidence3 = subEl.getChild("LanguageConfidence3").getText();
            asrResBean.setLanguageConfidence3(LanguageConfidence3);
            String LanguageConfidence4 = subEl.getChild("LanguageConfidence4").getText();
            asrResBean.setLanguageConfidence4(LanguageConfidence4);
            String LanguageConfidence5 = subEl.getChild("LanguageConfidence5").getText();
            asrResBean.setLanguageConfidence5(LanguageConfidence5);

        }

        return asrResBean;

    }
  /**
   * 语音识别打完分后，"准备"将录音文件的打分信息并将打分数据入库
   * <p>class/function:com.viewscenes.axis
   * <p>explain:
   * <p>author-date:谭长伟 2012-8-20
   * @param:
   * @return:
   */
  @Transactional
  public   void  readyAsrResult2DB(ASRResBean asrResBean,ResHeadendTab headendTab,ZresRunplanTab runplanTab,RadioStreamResultTab raido){

    RadioMarkZstViewTab rmzvb = new RadioMarkZstViewTab();

    rmzvb.setMarkUser("语音所");//用户为语音所
    rmzvb.setHeadCode(headendTab.getCode());
    rmzvb.setEquCode(raido.getEquCode());
    rmzvb.setFrequency(raido.getFrequency());

      //与运行图有关系的
      if (runplanTab != null){
        rmzvb.setRunplanId(runplanTab.getRunplanId());
        rmzvb.setStationId(runplanTab.getStationId());
        rmzvb.setStationName(runplanTab.getStationName());
        rmzvb.setPlayTime(runplanTab.getStartTime()+"-"+runplanTab.getEndTime());
      }

    if(asrResBean.getAudibilityScore().length()>0)
    {
      String[] sio = asrResBean.getAudibilityScore().split(",");
      if(sio.length==3)
      {
        rmzvb.setCounts(Integer.parseInt(sio[0]));
        rmzvb.setCounti(Integer.parseInt(sio[1]));
        rmzvb.setCounto(Integer.parseInt(sio[2]));

      }
    }

    rmzvb.setMarkType("2");//打分类型：录音打分


    Date sdate =  raido.getStartDatetime();
    String shour = sdate.getHours()>10?sdate.getHours()+"":"0"+sdate.getHours();
    String sUnit =shour +":00:00";
    Date edate = StringTool.stringToDate(StringTool.Date2String(StringTool.addHours(sdate,1)));
    String ehour = edate.getHours()>10?edate.getHours()+"":"0"+edate.getHours();
    String eUnit = ehour+":00:00";
    rmzvb.setUnit(sUnit + "-" + eUnit);
    rmzvb.setMarkFileUrl(raido.getUrl());
    rmzvb.setFileName(raido.getFilename());
    rmzvb.setRecordStartTime(StringTool.time2String(raido.getStartDatetime()));
    rmzvb.setRecordEndTime(StringTool.time2String(raido.getEndDatetime()));
    rmzvb.setTaskId(raido.getTaskId());
    //储存站点名称的时候不带ab，方便内网统计。
    String headname = headendTab.getShortname();
    if(headendTab.getTypeId().intValue()==101){
      rmzvb.setHeadname(headname);
    }else{
      if(headname.endsWith("A")||headname.endsWith("B")
          ||headname.endsWith("C")||headname.endsWith("D")
          ||headname.endsWith("E")||headname.endsWith("F")||headname.endsWith("G")
          ){
        rmzvb.setHeadname(headname.substring(0,headname.length()-1));
      }
    }

    rmzvb.setLevelValue(raido.getLevelValue());
    rmzvb.setFmValue(raido.getFmModulation());
    rmzvb.setAmValue(raido.getAmModulation());
    rmzvb.setOffsetValue(raido.getOffset());
    if(asrResBean.getType()!=null&&!"".equals(asrResBean.getType())){
        rmzvb.setAsrType(Integer.parseInt(asrResBean.getType()));
    }
    rmzvb.setResultType(asrResBean.getTimePeriodType());
    rmzvb.setStatus(asrResBean.getStatus());
      if(asrResBean.getWavelen()!=null&&!"".equals(asrResBean.getWavelen())){
          rmzvb.setWavelen(Integer.parseInt(asrResBean.getWavelen()));
      }
    rmzvb.setMusicratio(asrResBean.getMusicratio());
    rmzvb.setNoiseratio(asrResBean.getNoiseratio());
      if(asrResBean.getSpeechlen()!=null&&!"".equals(asrResBean.getSpeechlen())){
          rmzvb.setSpeechlen(Integer.parseInt(asrResBean.getSpeechlen()));
      }
      if(asrResBean.getTotalcm()!=null&&!"".equals(asrResBean.getTotalcm())){
          rmzvb.setTotalcm(Integer.parseInt(asrResBean.getTotalcm()));
      }
    rmzvb.setAudibilityscore(asrResBean.getAudibilityScore());
      if(asrResBean.getAudibilityConfidence()!=null&&!"".equals(asrResBean.getAudibilityConfidence())){
          rmzvb.setAudibilityconfidence(Integer.parseInt(asrResBean.getAudibilityConfidence()));
      }
    rmzvb.setChannelname(asrResBean.getChannelName());
      if(asrResBean.getChannelNameConfidence()!=null&&!"".equals(asrResBean.getChannelNameConfidence())){
          rmzvb.setChannelnameconfidence(Integer.parseInt(asrResBean.getChannelNameConfidence()));
      }
    rmzvb.setProgramname(asrResBean.getProgramName());
      if(asrResBean.getProgramNameConfidence()!=null&&!"".equals(asrResBean.getProgramNameConfidence())){
          rmzvb.setProgramnameconfidence(Integer.parseInt(asrResBean.getProgramNameConfidence()));
      }
    rmzvb.setLanguagename1(asrResBean.getLanguageName1());
    rmzvb.setLanguagename2(asrResBean.getLanguageName2());
    rmzvb.setLanguagename3(asrResBean.getLanguageName3());
    rmzvb.setLanguagename4(asrResBean.getLanguageName4());
    rmzvb.setLanguagename5(asrResBean.getLanguageName5());
      if(asrResBean.getLanguageConfidence1()!=null&&!"".equals(asrResBean.getLanguageConfidence1())){
          rmzvb.setLanguageconfidence1(Integer.parseInt(asrResBean.getLanguageConfidence1()));
      }
      if(asrResBean.getLanguageConfidence2()!=null&&!"".equals(asrResBean.getLanguageConfidence2())){
          rmzvb.setLanguageconfidence2(Integer.parseInt(asrResBean.getLanguageConfidence2()));
      }
      if(asrResBean.getLanguageConfidence3()!=null&&!"".equals(asrResBean.getLanguageConfidence3())){
          rmzvb.setLanguageconfidence3(Integer.parseInt(asrResBean.getLanguageConfidence3()));
      }
      if(asrResBean.getLanguageConfidence4()!=null&&!"".equals(asrResBean.getLanguageConfidence4())){
          rmzvb.setLanguageconfidence4(Integer.parseInt(asrResBean.getLanguageConfidence4()));
      }
      if(asrResBean.getLanguageConfidence5()!=null&&!"".equals(asrResBean.getLanguageConfidence5())){
          rmzvb.setLanguageconfidence5(Integer.parseInt(asrResBean.getLanguageConfidence5()));
      }
      /**
       * 打分入库
       */
      markZstViewService.insert(rmzvb);

  }


}
