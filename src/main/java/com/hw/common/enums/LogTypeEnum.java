package com.hw.common.enums;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logger Enum
 */
public enum LogTypeEnum {
    DEFAULT(LoggerFactory.getLogger("DEFAULT-LOG"), "公共日志"),
    DEVICELOG(LoggerFactory.getLogger("DEVICE-LOG"),"设备交互日志"),
    AUTOREPORTLOG(LoggerFactory.getLogger("AUTOREPORT-LOG"),"设备自动上报日志"),
    DEVICEUNTREATEDLOG(LoggerFactory.getLogger("DEVICE-UNTREATED-LOG"),"设备未处理日志"),;

    private Logger log;
    private String desc;
    LogTypeEnum(Logger log, String desc) {
        this.log = log;
        this.desc = desc;
    }
    public Logger getLog(){
        return log;
    }

    public String getDesc(){
        return desc;
    }

}
