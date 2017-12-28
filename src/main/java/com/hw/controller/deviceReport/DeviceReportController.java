package com.hw.controller.deviceReport;

import com.alibaba.fastjson.JSON;
import com.hw.common.constant.SystemConstants;
import com.hw.common.enums.LogTypeEnum;
import com.hw.domain.po.DeviceReport;
import com.hw.service.deviceReport.DeviceReportService;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by liubin11 on 2017/12/21.
 */
@Controller
@RequestMapping("/device")
public class DeviceReportController {
    private static final Logger log  = LogTypeEnum.DEFAULT.getLog();
    private static final Logger unLog  = LogTypeEnum.DEVICEUNTREATEDLOG.getLog();
    private static final Logger deviceLog  = LogTypeEnum.DEVICELOG.getLog();

    @Resource
    private DeviceReportService  deviceReportService;
    /**
     * 设备上报
     * @param report
     * @return
     */
    @PostMapping(value="/report")
    @ResponseBody
    public void postReport( DeviceReport report )  {
        try{
           if(report!=null)
           {
               if(SystemConstants.DB_CONNECT_FLAG)
               {
                   deviceLog.info(JSON.toJSONString(report));
                   deviceReportService.insert(report);
               }else
               {
                   unLog.error(JSON.toJSONString(report));
               }
           }
        } catch (Exception e) {
            log.error("数据库保存失败，转存日志中！",e);
            unLog.error(JSON.toJSONString(report));
        }
    }
    /**
     * 设备上报
     * @param report
     * @return
     */
    @GetMapping(value="/report")
    @ResponseBody
    public String  getReport( DeviceReport report )  {
        return "ok";
    }

    /**
     * 获取日志
     * @param actId
     * @return
     */
    @PostMapping(value="/getReport")
    @ResponseBody
    public DeviceReport getReport( Long  actId )  {
        DeviceReport report = null;
        try{
            if(actId > 0 )
            {
                report   = deviceReportService.selectById(actId);
            }
        } catch (Exception e) {
            log.error("获取上报信息失败:",e);
        }
        return report;
    }
}
