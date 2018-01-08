package com.hw.controller.ftpSelect;

import com.alibaba.fastjson.JSON;
import com.hw.common.constant.SystemConstants;
import com.hw.domain.po.DeviceReport;
import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.vo.FtpServerVo;
import com.hw.service.ResHeadendService;
import com.hw.service.deviceReport.DeviceReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by liubin11 on 2017/12/21.
 */
@Controller
@RequestMapping("/ftp")
public class FtpSelectController {

    private final Logger log = LoggerFactory.getLogger(FtpSelectController.class);
    @Value("${ftp.server}")
    private String ftpServers;
    @Resource
    private ResHeadendService headendService;
    /**
     * 设备id
     * @param headId
     * 按照大洲进行分
     * @return
     */
    @PostMapping(value="/select")
    @ResponseBody
    public FtpServerVo selectFtpServer(Integer headId )  {
        FtpServerVo returnServer =null;
        try{
           if(headId!=null)
           {
               if(SystemConstants.validFtpServerList.size()>0)
               {
                   ResHeadendTab headend =  headendService.selectById(headId);
                   if(headend!=null){
                       for(FtpServerVo ftpServerVo:SystemConstants.validFtpServerList){
                           if(ftpServerVo.getStates().indexOf(headend.getState().toString())!=-1)
                           {
                               returnServer = ftpServerVo ;
                           }
                       }
                       if(returnServer == null){
                           returnServer =  SystemConstants.validFtpServerList.get(0);
                       }
                   }
               }
           }
        } catch (Exception e) {
            log.error("获取ftp服务器失败：",e);
        }
        return  returnServer;
    }

}
