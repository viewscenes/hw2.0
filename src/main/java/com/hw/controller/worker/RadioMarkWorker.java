package com.hw.controller.worker;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RadioMarkWorker {

    private static Log log = LogFactory.getLog(RadioMarkWorker.class);

  /**
   * 每5分钟执行一次打分
   */
    @Scheduled(initialDelay = 10000,  fixedDelay = 5*60*1000)
    public void execute() {
            log.info("任务检查！");
    }


}
