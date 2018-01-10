
package com.hw.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RadioEquInitParamTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

	//columns START
    /**
     * paramId       db_column: PARAM_ID 
     */	
	
	private Integer paramId;
    /**
     * 前端id       db_column: HEAD_ID 
     */	
	
	private Integer headId;
    /**
     * 前端code       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 设备类型       db_column: TYPE_ID 
     */	
	
	private Integer typeId;
    /**
     * 控制系统code       db_column: SRCCODE 
     */	
	private String srccode;
    /**
     * 上报url       db_column: UPURL 
     */	
	private String upurl;
    /**
     * ftp地址       db_column: FTP 
     */	
	private String ftp;
    /**
     * ftp端口       db_column: FTPPORT 
     */	
	private String ftpport;
    /**
     * ftp用户名       db_column: FTPUSER 
     */	
	private String ftpuser;
    /**
     * ftp密码       db_column: FTPPASSWORD 
     */	
	private String ftppassword;
    /**
     * ftp路径       db_column: FTPPATH 
     */	
	private String ftppath;
    /**
     * 上报电话       db_column: PHONEMAIN 
     */	
	private String phonemain;
    /**
     * 拨号用户名       db_column: LOGNAMEMAIN 
     */	
	private String lognamemain;
    /**
     * 拨号密码       db_column: LOGPASSWORDMAIN 
     */	
	private String logpasswordmain;
    /**
     * 备用拨号电话       db_column: PHONESLAVE 
     */	
	private String phoneslave;
    /**
     * 备用拨号用户名       db_column: LOGNAMESLAVE 
     */	
	private String lognameslave;
    /**
     * 备用拨号密码       db_column: LOGPASSWORDSLAVE 
     */	
	private String logpasswordslave;
    /**
     * 站点拨号密码       db_column: NATIVELOGPASSWORD 
     */	
	private String nativelogpassword;
    /**
     * 时间服务器       db_column: TIMESERVER 
     */	
	private String timeserver;
    /**
     * UPS电压下限       db_column: BATTERYLEVELDOWNTHRESHOLD 
     */	
	private String batteryleveldownthreshold;
    /**
     * 关机延时时间       db_column: SHUTDOWNDELAYTIME 
     */	
	private String shutdowndelaytime;
    /**
     * 是否进行UPS关机报警       db_column: CHECKUPS 
     */	
	private String checkups;
    /**
     * 断线时间长度       db_column: OFFLINETIME 
     */	
	private String offlinetime;
    /**
     * 频谱扫描时频点采用时间       db_column: SPECTRUMSCANSAMPLELENGTH 
     */	
	private String spectrumscansamplelength;
    /**
     * r1       db_column: R1 
     */	
	private String r1;
    /**
     * r2       db_column: R2 
     */	
	private String r2;
    /**
     * r3       db_column: R3 
     */	
	private String r3;
    /**
     * r4       db_column: R4 
     */	
	private String r4;
    /**
     * r5       db_column: R5 
     */	
	private String r5;
    /**
     * r6       db_column: R6 
     */	
	private String r6;
    /**
     * r7       db_column: R7 
     */	
	private String r7;
    /**
     * r8       db_column: R8 
     */	
	private String r8;
    /**
     * r9       db_column: R9 
     */	
	private String r9;
    /**
     * 压缩大小       db_column: COMPRESSSIZE 
     */	
	private String compresssize;
    /**
     * 设备日志过期时间       db_column: LOGEXPIREDAYS 
     */	
	
	private Long logexpiredays;
    /**
     * 站点状态自动上报间隔       db_column: STATIONSTATUSREPORTINTERVAL 
     */	
	
	private Long stationstatusreportinterval;
	//columns END


}

