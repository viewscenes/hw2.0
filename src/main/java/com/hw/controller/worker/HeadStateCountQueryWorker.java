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

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


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
