
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioEquInitParamTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

	//columns START
    /**
     * paramId       db_column: PARAM_ID 
     */	
	
	private Long paramId;
    /**
     * 前端id       db_column: HEAD_ID 
     */	
	
	private Long headId;
    /**
     * 前端code       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 设备类型       db_column: TYPE_ID 
     */	
	
	private Long typeId;
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

	public RadioEquInitParamTab(){
	}

	public RadioEquInitParamTab(
		Long paramId
	){
		this.paramId = paramId;
	}

	public void setParamId(Long value) {
		this.paramId = value;
	}
	
	public Long getParamId() {
		return this.paramId;
	}
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	public void setTypeId(Long value) {
		this.typeId = value;
	}
	
	public Long getTypeId() {
		return this.typeId;
	}
	public void setSrccode(String value) {
		this.srccode = value;
	}
	
	public String getSrccode() {
		return this.srccode;
	}
	public void setUpurl(String value) {
		this.upurl = value;
	}
	
	public String getUpurl() {
		return this.upurl;
	}
	public void setFtp(String value) {
		this.ftp = value;
	}
	
	public String getFtp() {
		return this.ftp;
	}
	public void setFtpport(String value) {
		this.ftpport = value;
	}
	
	public String getFtpport() {
		return this.ftpport;
	}
	public void setFtpuser(String value) {
		this.ftpuser = value;
	}
	
	public String getFtpuser() {
		return this.ftpuser;
	}
	public void setFtppassword(String value) {
		this.ftppassword = value;
	}
	
	public String getFtppassword() {
		return this.ftppassword;
	}
	public void setFtppath(String value) {
		this.ftppath = value;
	}
	
	public String getFtppath() {
		return this.ftppath;
	}
	public void setPhonemain(String value) {
		this.phonemain = value;
	}
	
	public String getPhonemain() {
		return this.phonemain;
	}
	public void setLognamemain(String value) {
		this.lognamemain = value;
	}
	
	public String getLognamemain() {
		return this.lognamemain;
	}
	public void setLogpasswordmain(String value) {
		this.logpasswordmain = value;
	}
	
	public String getLogpasswordmain() {
		return this.logpasswordmain;
	}
	public void setPhoneslave(String value) {
		this.phoneslave = value;
	}
	
	public String getPhoneslave() {
		return this.phoneslave;
	}
	public void setLognameslave(String value) {
		this.lognameslave = value;
	}
	
	public String getLognameslave() {
		return this.lognameslave;
	}
	public void setLogpasswordslave(String value) {
		this.logpasswordslave = value;
	}
	
	public String getLogpasswordslave() {
		return this.logpasswordslave;
	}
	public void setNativelogpassword(String value) {
		this.nativelogpassword = value;
	}
	
	public String getNativelogpassword() {
		return this.nativelogpassword;
	}
	public void setTimeserver(String value) {
		this.timeserver = value;
	}
	
	public String getTimeserver() {
		return this.timeserver;
	}
	public void setBatteryleveldownthreshold(String value) {
		this.batteryleveldownthreshold = value;
	}
	
	public String getBatteryleveldownthreshold() {
		return this.batteryleveldownthreshold;
	}
	public void setShutdowndelaytime(String value) {
		this.shutdowndelaytime = value;
	}
	
	public String getShutdowndelaytime() {
		return this.shutdowndelaytime;
	}
	public void setCheckups(String value) {
		this.checkups = value;
	}
	
	public String getCheckups() {
		return this.checkups;
	}
	public void setOfflinetime(String value) {
		this.offlinetime = value;
	}
	
	public String getOfflinetime() {
		return this.offlinetime;
	}
	public void setSpectrumscansamplelength(String value) {
		this.spectrumscansamplelength = value;
	}
	
	public String getSpectrumscansamplelength() {
		return this.spectrumscansamplelength;
	}
	public void setR1(String value) {
		this.r1 = value;
	}
	
	public String getR1() {
		return this.r1;
	}
	public void setR2(String value) {
		this.r2 = value;
	}
	
	public String getR2() {
		return this.r2;
	}
	public void setR3(String value) {
		this.r3 = value;
	}
	
	public String getR3() {
		return this.r3;
	}
	public void setR4(String value) {
		this.r4 = value;
	}
	
	public String getR4() {
		return this.r4;
	}
	public void setR5(String value) {
		this.r5 = value;
	}
	
	public String getR5() {
		return this.r5;
	}
	public void setR6(String value) {
		this.r6 = value;
	}
	
	public String getR6() {
		return this.r6;
	}
	public void setR7(String value) {
		this.r7 = value;
	}
	
	public String getR7() {
		return this.r7;
	}
	public void setR8(String value) {
		this.r8 = value;
	}
	
	public String getR8() {
		return this.r8;
	}
	public void setR9(String value) {
		this.r9 = value;
	}
	
	public String getR9() {
		return this.r9;
	}
	public void setCompresssize(String value) {
		this.compresssize = value;
	}
	
	public String getCompresssize() {
		return this.compresssize;
	}
	public void setLogexpiredays(Long value) {
		this.logexpiredays = value;
	}
	
	public Long getLogexpiredays() {
		return this.logexpiredays;
	}
	public void setStationstatusreportinterval(Long value) {
		this.stationstatusreportinterval = value;
	}
	
	public Long getStationstatusreportinterval() {
		return this.stationstatusreportinterval;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("ParamId",getParamId())
			.append("HeadId",getHeadId())
			.append("HeadCode",getHeadCode())
			.append("TypeId",getTypeId())
			.append("Srccode",getSrccode())
			.append("Upurl",getUpurl())
			.append("Ftp",getFtp())
			.append("Ftpport",getFtpport())
			.append("Ftpuser",getFtpuser())
			.append("Ftppassword",getFtppassword())
			.append("Ftppath",getFtppath())
			.append("Phonemain",getPhonemain())
			.append("Lognamemain",getLognamemain())
			.append("Logpasswordmain",getLogpasswordmain())
			.append("Phoneslave",getPhoneslave())
			.append("Lognameslave",getLognameslave())
			.append("Logpasswordslave",getLogpasswordslave())
			.append("Nativelogpassword",getNativelogpassword())
			.append("Timeserver",getTimeserver())
			.append("Batteryleveldownthreshold",getBatteryleveldownthreshold())
			.append("Shutdowndelaytime",getShutdowndelaytime())
			.append("Checkups",getCheckups())
			.append("Offlinetime",getOfflinetime())
			.append("Spectrumscansamplelength",getSpectrumscansamplelength())
			.append("R1",getR1())
			.append("R2",getR2())
			.append("R3",getR3())
			.append("R4",getR4())
			.append("R5",getR5())
			.append("R6",getR6())
			.append("R7",getR7())
			.append("R8",getR8())
			.append("R9",getR9())
			.append("Compresssize",getCompresssize())
			.append("Logexpiredays",getLogexpiredays())
			.append("Stationstatusreportinterval",getStationstatusreportinterval())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getParamId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioEquInitParamTab == false) return false;
		if(this == obj) return true;
		RadioEquInitParamTab other = (RadioEquInitParamTab)obj;
		return new EqualsBuilder()
			.append(getParamId(),other.getParamId())
			.isEquals();
	}
}

