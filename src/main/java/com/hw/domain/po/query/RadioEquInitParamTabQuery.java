
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioEquInitParamTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** paramId */
	private Long paramId;
	/** 前端id */
	private Long headId;
	/** 前端code */
	private String headCode;
	/** 设备类型 */
	private Long typeId;
	/** 控制系统code */
	private String srccode;
	/** 上报url */
	private String upurl;
	/** ftp地址 */
	private String ftp;
	/** ftp端口 */
	private String ftpport;
	/** ftp用户名 */
	private String ftpuser;
	/** ftp密码 */
	private String ftppassword;
	/** ftp路径 */
	private String ftppath;
	/** 上报电话 */
	private String phonemain;
	/** 拨号用户名 */
	private String lognamemain;
	/** 拨号密码 */
	private String logpasswordmain;
	/** 备用拨号电话 */
	private String phoneslave;
	/** 备用拨号用户名 */
	private String lognameslave;
	/** 备用拨号密码 */
	private String logpasswordslave;
	/** 站点拨号密码 */
	private String nativelogpassword;
	/** 时间服务器 */
	private String timeserver;
	/** UPS电压下限 */
	private String batteryleveldownthreshold;
	/** 关机延时时间 */
	private String shutdowndelaytime;
	/** 是否进行UPS关机报警 */
	private String checkups;
	/** 断线时间长度 */
	private String offlinetime;
	/** 频谱扫描时频点采用时间 */
	private String spectrumscansamplelength;
	/** r1 */
	private String r1;
	/** r2 */
	private String r2;
	/** r3 */
	private String r3;
	/** r4 */
	private String r4;
	/** r5 */
	private String r5;
	/** r6 */
	private String r6;
	/** r7 */
	private String r7;
	/** r8 */
	private String r8;
	/** r9 */
	private String r9;
	/** 压缩大小 */
	private String compresssize;
	/** 设备日志过期时间 */
	private Long logexpiredays;
	/** 站点状态自动上报间隔 */
	private Long stationstatusreportinterval;

	public Long getParamId() {
		return this.paramId;
	}
	
	public void setParamId(Long value) {
		this.paramId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public Long getTypeId() {
		return this.typeId;
	}
	
	public void setTypeId(Long value) {
		this.typeId = value;
	}
	
	public String getSrccode() {
		return this.srccode;
	}
	
	public void setSrccode(String value) {
		this.srccode = value;
	}
	
	public String getUpurl() {
		return this.upurl;
	}
	
	public void setUpurl(String value) {
		this.upurl = value;
	}
	
	public String getFtp() {
		return this.ftp;
	}
	
	public void setFtp(String value) {
		this.ftp = value;
	}
	
	public String getFtpport() {
		return this.ftpport;
	}
	
	public void setFtpport(String value) {
		this.ftpport = value;
	}
	
	public String getFtpuser() {
		return this.ftpuser;
	}
	
	public void setFtpuser(String value) {
		this.ftpuser = value;
	}
	
	public String getFtppassword() {
		return this.ftppassword;
	}
	
	public void setFtppassword(String value) {
		this.ftppassword = value;
	}
	
	public String getFtppath() {
		return this.ftppath;
	}
	
	public void setFtppath(String value) {
		this.ftppath = value;
	}
	
	public String getPhonemain() {
		return this.phonemain;
	}
	
	public void setPhonemain(String value) {
		this.phonemain = value;
	}
	
	public String getLognamemain() {
		return this.lognamemain;
	}
	
	public void setLognamemain(String value) {
		this.lognamemain = value;
	}
	
	public String getLogpasswordmain() {
		return this.logpasswordmain;
	}
	
	public void setLogpasswordmain(String value) {
		this.logpasswordmain = value;
	}
	
	public String getPhoneslave() {
		return this.phoneslave;
	}
	
	public void setPhoneslave(String value) {
		this.phoneslave = value;
	}
	
	public String getLognameslave() {
		return this.lognameslave;
	}
	
	public void setLognameslave(String value) {
		this.lognameslave = value;
	}
	
	public String getLogpasswordslave() {
		return this.logpasswordslave;
	}
	
	public void setLogpasswordslave(String value) {
		this.logpasswordslave = value;
	}
	
	public String getNativelogpassword() {
		return this.nativelogpassword;
	}
	
	public void setNativelogpassword(String value) {
		this.nativelogpassword = value;
	}
	
	public String getTimeserver() {
		return this.timeserver;
	}
	
	public void setTimeserver(String value) {
		this.timeserver = value;
	}
	
	public String getBatteryleveldownthreshold() {
		return this.batteryleveldownthreshold;
	}
	
	public void setBatteryleveldownthreshold(String value) {
		this.batteryleveldownthreshold = value;
	}
	
	public String getShutdowndelaytime() {
		return this.shutdowndelaytime;
	}
	
	public void setShutdowndelaytime(String value) {
		this.shutdowndelaytime = value;
	}
	
	public String getCheckups() {
		return this.checkups;
	}
	
	public void setCheckups(String value) {
		this.checkups = value;
	}
	
	public String getOfflinetime() {
		return this.offlinetime;
	}
	
	public void setOfflinetime(String value) {
		this.offlinetime = value;
	}
	
	public String getSpectrumscansamplelength() {
		return this.spectrumscansamplelength;
	}
	
	public void setSpectrumscansamplelength(String value) {
		this.spectrumscansamplelength = value;
	}
	
	public String getR1() {
		return this.r1;
	}
	
	public void setR1(String value) {
		this.r1 = value;
	}
	
	public String getR2() {
		return this.r2;
	}
	
	public void setR2(String value) {
		this.r2 = value;
	}
	
	public String getR3() {
		return this.r3;
	}
	
	public void setR3(String value) {
		this.r3 = value;
	}
	
	public String getR4() {
		return this.r4;
	}
	
	public void setR4(String value) {
		this.r4 = value;
	}
	
	public String getR5() {
		return this.r5;
	}
	
	public void setR5(String value) {
		this.r5 = value;
	}
	
	public String getR6() {
		return this.r6;
	}
	
	public void setR6(String value) {
		this.r6 = value;
	}
	
	public String getR7() {
		return this.r7;
	}
	
	public void setR7(String value) {
		this.r7 = value;
	}
	
	public String getR8() {
		return this.r8;
	}
	
	public void setR8(String value) {
		this.r8 = value;
	}
	
	public String getR9() {
		return this.r9;
	}
	
	public void setR9(String value) {
		this.r9 = value;
	}
	
	public String getCompresssize() {
		return this.compresssize;
	}
	
	public void setCompresssize(String value) {
		this.compresssize = value;
	}
	
	public Long getLogexpiredays() {
		return this.logexpiredays;
	}
	
	public void setLogexpiredays(Long value) {
		this.logexpiredays = value;
	}
	
	public Long getStationstatusreportinterval() {
		return this.stationstatusreportinterval;
	}
	
	public void setStationstatusreportinterval(Long value) {
		this.stationstatusreportinterval = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

