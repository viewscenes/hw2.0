package com.hw.controller.worker;

import com.hw.common.constant.SystemConstants;
import com.hw.domain.po.HeadendStateCount;
import com.hw.service.ResHeadendService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class HeadStateCountQueryWorker {

    @Resource
    private ResHeadendService headendService;
    @Value("${worker.switch}")
    private String workerSwith= "off";
    /**
     * 每1小时执行一次站点总数检查
     */
    @Scheduled(initialDelay = 500,fixedDelay = 60*60*1000)
    public void execute() {
        if("on".equals(workerSwith)) {
            SystemConstants.headendStateCountList = headendService.queryHeadCountByState();
            int numberCount = 0;
            for (HeadendStateCount stateCount : SystemConstants.headendStateCountList) {
                numberCount += stateCount.getCount();
            }
            SystemConstants.headendCount = numberCount;
        }
    }

}
