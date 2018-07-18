package com.hw.controller.worker;

import com.hw.common.constant.SystemConstants;
import com.hw.service.SysConfigurationService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class DBCheckWorker {

    private static Log log = LogFactory.getLog(DBCheckWorker.class);

    @Resource
    private SysConfigurationService configurationService;
    /**
     * 每1分钟执行一次数据库检查
     */
    //@Scheduled(initialDelay = 2000,  fixedDelay = 60*1000)
    public void execute() {
        try{
            configurationService.checkDB();
            SystemConstants.DB_CONNECT_FLAG = true;
        }catch (Exception e)
        {
            log.info("数据库未连接上！");
            SystemConstants.DB_CONNECT_FLAG = false;
        }
   }


}
