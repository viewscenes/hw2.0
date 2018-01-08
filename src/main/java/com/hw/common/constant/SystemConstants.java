package com.hw.common.constant;

import com.hw.domain.po.HeadendStateCount;
import com.hw.domain.vo.FtpServerVo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by liubin11 on 2017/11/20.
 */
public class SystemConstants {
    public static final String DEFAULT_ENCODE = "UTF-8";

    public static final String    SYSTEM_INDEX    = "index";

    public static  boolean  DB_CONNECT_FLAG  =  true;

    public static  int  headendCount  =  0;

    /**
     * 线程安全
     */
    public static  List<HeadendStateCount> headendStateCountList = Collections.synchronizedList(new ArrayList<HeadendStateCount>());

    /**
     * 线程安全
     */
    //所有ftp服务器
    public static  List<FtpServerVo> ftpServerList = Collections.synchronizedList(new ArrayList<FtpServerVo>());
    //存货ftp服务器
    public static  List<FtpServerVo> validFtpServerList = Collections.synchronizedList(new ArrayList<FtpServerVo>());

}

