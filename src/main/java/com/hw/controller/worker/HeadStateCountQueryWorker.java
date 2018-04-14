package com.hw.controller.worker;

import com.hw.common.constant.SystemConstants;
import com.hw.domain.po.HeadendStateCount;
import com.hw.service.ResHeadendService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class HeadStateCountQueryWorker {

    @Resource
    private ResHeadendService headendService;
    /**
     * 每1小时执行一次站点总数检查
     */
    //@Scheduled(initialDelay = 500,fixedDelay = 60*60*1000)
    public void execute() {
        SystemConstants.headendStateCountList = headendService.queryHeadCountByState();
        int numberCount = 0;
        for(HeadendStateCount stateCount:SystemConstants.headendStateCountList){
            numberCount+=stateCount.getCount();
        }
        SystemConstants.headendCount = numberCount ;
    }

}
