package com.hw.controller.worker;

import com.hw.common.constant.SystemConstants;
import com.hw.common.utils.FTPUtil;
import com.hw.domain.po.HeadendStateCount;
import com.hw.domain.vo.FtpServerVo;
import com.hw.service.ResHeadendService;
import com.hw.service.SysConfigurationService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sun.net.ftp.FtpClient;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Component
public class FtpCheckWorker {

    private static Log log = LogFactory.getLog(FtpCheckWorker.class);

    @Value("${ftp.server}")
    private String ftpServers;

    @Resource
    private SysConfigurationService configurationService;

    @Resource
    private ResHeadendService headendService;
    /**
     * 每10分钟执行一次ftp检查
     */
    @Scheduled(initialDelay = 1000,  fixedDelay = 10*60*1000)
    public void execute() {
        if(SystemConstants.ftpServerList.size()==0) {
            SystemConstants.ftpServerList = getFtpServerList();
        }
        List<FtpServerVo> ftpServerList= SystemConstants.ftpServerList;
        List<FtpServerVo> validFtpServerList = new ArrayList<>();
        for(FtpServerVo ftpServer :ftpServerList)
        {
            if(FTPUtil.ftpCanConnect(
                    ftpServer.getIp(),
                    ftpServer.getPort(),
                    ftpServer.getFtpUser(),
                    ftpServer.getFtpPassword())){
                ftpServer.setCanUsed(true);
                validFtpServerList.add(ftpServer);
            }else{
                ftpServer.setCanUsed(false);
            }
        }


        if(SystemConstants.headendStateCountList.size()==0){
            SystemConstants.headendStateCountList =  headendService.queryHeadCountByState();
            int numberCount = 0;
            for(HeadendStateCount stateCount:SystemConstants.headendStateCountList){
                numberCount+=stateCount.getCount();
            }
            SystemConstants.headendCount = numberCount ;
        }
        List<HeadendStateCount> headendStateCountList =SystemConstants.headendStateCountList;
        int average = SystemConstants.headendCount/validFtpServerList.size();
        int flagCount =0;
        String flagState = "";
        List<String> states = new ArrayList<>();
        for(int i=0;i<headendStateCountList.size();i++){
            if(i==0){
                flagState+=","+headendStateCountList.get(i).getState();
                flagCount+=headendStateCountList.get(i).getCount();
            }else
            {
                flagCount+=headendStateCountList.get(i).getCount();
                if(flagCount>average){
                    states.add(flagState);
                    flagState = headendStateCountList.get(i).getState()+"";
                    flagCount = 0;
                }else
                {
                    flagState+=","+headendStateCountList.get(i).getState();
                }
            }
        }
        states.add(flagState);//别漏一个。
        if(validFtpServerList.size()<=states.size())
        {
            for(int i=0;i<validFtpServerList.size();i++){
                validFtpServerList.get(i).setStates(states.get(i));
            }
        }else{
            for(int i=0;i<states.size();i++){
                validFtpServerList.get(i).setStates(states.get(i));
            }
        }
        SystemConstants.validFtpServerList = validFtpServerList;
    }

    public List<FtpServerVo> getFtpServerList() {
        List<FtpServerVo> ftpServerList =new ArrayList<>();
        if(StringUtils.isNotBlank(ftpServers)){
            String[] ftpServerString = ftpServers.split(",");
            if(ftpServerString.length>0)
            {
                for(String server:ftpServerString){
                    if(server!=null){
                        String[]  ftp = server.split(":");
                        if(ftp.length==4)
                        {
                            try {
                                FtpServerVo ftpServerVo = new FtpServerVo();
                                ftpServerVo.setIp(ftp[0]);
                                ftpServerVo.setPort(Integer.parseInt(ftp[1]));
                                ftpServerVo.setFtpUser(ftp[2]);
                                ftpServerVo.setFtpPassword(ftp[3]);
                                ftpServerList.add(ftpServerVo);
                            }catch (Exception e){
                                continue;//15680006716
                            }
                        }
                    }
                }
            }
        }
        return ftpServerList;
    }
}
