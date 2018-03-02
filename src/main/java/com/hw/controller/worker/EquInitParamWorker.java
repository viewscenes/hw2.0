package com.hw.controller.worker;

import com.hw.common.constant.SystemConstants;
import com.hw.domain.po.RadioEquInitParamTab;
import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.po.query.ResHeadendTabQuery;
import com.hw.domain.vo.FtpServerVo;
import com.hw.service.RadioEquInitParamService;
import com.hw.service.ResHeadendService;
import com.hw.service.SysConfigurationService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class EquInitParamWorker {

    private static Log log = LogFactory.getLog(EquInitParamWorker.class);

    @Resource
    private RadioEquInitParamService equInitParamService;
    @Resource
    private ResHeadendService headendService;
    /**
     * 设备ftp上报地址是否可用检查一小时执行一次
     */
    //@Scheduled(cron = "0 0 0/1 * * ? ")
    //@Scheduled(initialDelay = 60000,  fixedDelay = 60*60*1000)
    public void execute() {
        try{

            List<RadioEquInitParamTab> equInitParamList = equInitParamService.selectInvalidFtpList(SystemConstants.validFtpServerList);

            if(equInitParamList!=null&&equInitParamList.size()>0){
                List<Integer> headIdList =new ArrayList<>();
                for(RadioEquInitParamTab equInitParamTab:equInitParamList){
                    headIdList.add(equInitParamTab.getHeadId());
                }
                ResHeadendTabQuery query =new ResHeadendTabQuery();
                query.setHeadIdList(headIdList);
                List<ResHeadendTab> headendTabs = headendService.selectHeadendList(query);
                Map<Integer,Integer> headendMaps = new HashMap<>();
                for(ResHeadendTab headendTab:headendTabs){
                    headendMaps.put(headendTab.getHeadId(),headendTab.getState());
                }
                for(RadioEquInitParamTab equInitParamTab:equInitParamList){
                    FtpServerVo ftpServerVo = getFtpServerState(headendMaps.get(equInitParamTab.getHeadId()));
                    if(ftpServerVo!=null){
                        equInitParamTab.setFtp(ftpServerVo.getIp());
                        equInitParamTab.setFtpport(ftpServerVo.getPort()+"");
                        equInitParamTab.setFtpuser(ftpServerVo.getFtpUser());
                        equInitParamTab.setFtppassword(ftpServerVo.getFtpPassword());
                    }
                }
                equInitParamService.batcheUpdateFtpServer(equInitParamList);
            }
        }catch (Exception e)
        {
            log.info("检查设备初始化参数Ftp有效性失败！",e);
        }
}

    private FtpServerVo getFtpServerState(Integer state) {
        FtpServerVo ftpServer =null;
            for(FtpServerVo ftpServerVo:SystemConstants.validFtpServerList){
                if(ftpServerVo.getStates().indexOf(state.toString())!=-1)
                {
                    ftpServer = ftpServerVo ;
                }
            }
            if(ftpServer == null&&SystemConstants.validFtpServerList.size()>0){
                ftpServer =  SystemConstants.validFtpServerList.get(0);
            }
        return  ftpServer;
    }


}
