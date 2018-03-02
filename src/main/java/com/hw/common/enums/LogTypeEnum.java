package com.hw.common.enums;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Logger Enum
 */
public enum LogTypeEnum {
    DEFAULT(LogFactory.getLog("DEFAULT-LOG"), "公共日志"),
    DEVICELOG(LogFactory.getLog("DEVICE-LOG"),"设备交互日志"),
    AUTOREPORTLOG(LogFactory.getLog("AUTOREPORT-LOG"),"设备自动上报日志"),
    DEVICEUNTREATEDLOG(LogFactory.getLog("DEVICE-UNTREATED-LOG"),"设备未处理日志"),
    DATACLEARLOG(LogFactory.getLog("DATA-CLEAR-LOG"),"数据清理日志"),
    ;

    private Log log;
    private String desc;
    LogTypeEnum(Log log, String desc) {
        this.log = log;
        this.desc = desc;
    }
    public Log getLog(){
        return log;
    }

    public String getDesc(){
        return desc;
    }

}
