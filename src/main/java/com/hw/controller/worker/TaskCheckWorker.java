package com.hw.controller.worker;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskCheckWorker {

    private static Log log = LogFactory.getLog(TaskCheckWorker.class);


    @Scheduled(cron = "0 0 0/1 * * ? ")
    public void execute() {

            log.info("任务检查！");
    }


}
