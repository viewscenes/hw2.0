package com.hw.controller.worker;

import com.hw.domain.po.RadioMarkRelTab;
import com.hw.domain.po.RadioMarkZstViewTab;
import com.hw.domain.po.RadioStreamResultTab;
import com.hw.service.RadioMarkRelService;
import com.hw.service.RadioMarkZstViewService;
import com.hw.service.RadioStreamResultService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

@Component
public class RadioMarkWorker {

    private static Log log = LogFactory.getLog(RadioMarkWorker.class);
    @Resource
    private RadioMarkRelService radioMarkRelService;

    @Resource
    private RadioStreamResultService radioStreamResultService;

    @Resource
    private RadioMarkZstViewService markZstViewService;
    /**
     * 每5分钟执行一次打分
     */
    @Scheduled(initialDelay = 10000,  fixedDelay = 5*60*1000)
    public void execute() {
            log.info("任务检查！");
        List<RadioMarkRelTab>  radioRelList =  radioMarkRelService.getNotMark();
        if(radioRelList!=null&&radioRelList.size()>0){
            for(RadioMarkRelTab rel:radioRelList){
                Long resultId = rel.getResultId();
                RadioStreamResultTab radio = radioStreamResultService.selectById(resultId);
                //文件存在才发送
                if(radio.getUrl()!=null){
                   if(existHttpPath(radio.getUrl())){
                       //是否已经打过分了
                       RadioMarkZstViewTab  mark = markZstViewService.selectByFileName(radio.getFilename());
                       if(mark!=null){

                       }
                   }
                }
            }
        }
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


}
