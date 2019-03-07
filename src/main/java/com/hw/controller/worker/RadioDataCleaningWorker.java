package com.hw.controller.worker;

import com.hw.common.utils.DateUtil;
import com.hw.domain.po.RadioStreamResultTab;
import com.hw.service.RadioStreamResultService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
@Log4j2
public class RadioDataCleaningWorker {


    @Resource
    private RadioStreamResultService radioStreamResultService;
    @Value("${worker.switch}")
    private String workerSwith= "off";
    /**
     * 每30分钟执行一次数据清理
     */
   @Scheduled(initialDelay = 3000,  fixedDelay = 30*60*1000)
    public void execute() {
       if("on".equals(workerSwith)) {
           try {
               Date minDate = radioStreamResultService.findMinRadioDate();
               Date startDate = new Date();
               if (minDate != null) {
                   String deleteDate = DateUtil.getDateString(minDate);
                   String nowDate = DateUtil.getDateString(startDate);
                   int day = DateUtil.getTimeIntervalDaysByDate(deleteDate, nowDate);
                   if (day > 90) {
                       RadioStreamResultTab bean = new RadioStreamResultTab();
                       bean.setStartDatetime(DateUtil.getStartOfDay(minDate));
                       bean.setEndDatetime(DateUtil.getEndOfDay(minDate));
                       radioStreamResultService.deleteMinRadioDateData(bean);
                       Date endDate = new Date();
                       log.info("清理录音数据日期：" + DateUtil.getDateToDayStr(minDate) + " 花费时间为：" + DateUtil.getTimeIntervalSeconds(startDate, endDate) + "秒.");
                   }
               }
           } catch (Exception e) {
               log.error("录音数据清理失败！", e);
           }
       }
    }


}
