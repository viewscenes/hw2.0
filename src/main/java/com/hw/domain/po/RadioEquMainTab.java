
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioEquMainTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioEquMainTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_HEAD_ID = "前段id";
	public static final String ALIAS_INSTALLATION = "安装情况";
	public static final String ALIAS_USE_CASE = "使用情况";
	public static final String ALIAS_FAULT = "故障情况";
	public static final String ALIAS_REPLACEMENT = "更换情况";
	public static final String ALIAS_MAINTAIN = "维护情况";
	public static final String ALIAS_EQU_NUMBER = "设备数量";
	public static final String ALIAS_EQU_ID = "设备编号";
	public static final String ALIAS_HEAD_CODE = "前段代码";
	public static final String ALIAS_MAIN_DATETIME = "维护时间";
	public static final String ALIAS_HEAD_NAME = "站点名称";
	public static final String ALIAS_PIC_PATH = "文件路径";
	public static final String ALIAS_START_TIME = "故障开始时间";
	public static final String ALIAS_END_TIME = "故障结束时间";
	public static final String ALIAS_PERSON = "维护人";
	public static final String ALIAS_RESAULT = "处理结果";
	public static final String ALIAS_RECORD_PATH = "录音文件路径";
	public static final String ALIAS_OLD_EQU = "旧设备编号";
	public static final String ALIAS_OLD_PLACE = "旧设备去向，0站点保存 1使馆寄存";
	public static final String ALIAS_OLD_STATUS = "旧设备状态：0可以修复，1已经报废";
	public static final String ALIAS_NEW_EQU = "新设备编号";
	public static final String ALIAS_NEW_FROM = "新设备来源:0邮寄过去，1站点存储，2使馆存储";
	public static final String ALIAS_MAIL_ORDER = "邮件单号";
	public static final String ALIAS_MAIL_TIME = "邮寄时间";
	
	//date formats

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 前段id       db_column: HEAD_ID 
     */	
	private Long headId;
    /**
     * 安装情况       db_column: INSTALLATION 
     */	
	private String installation;
    /**
     * 使用情况       db_column: USE_CASE 
     */	
	private String useCase;
    /**
     * 故障情况       db_column: FAULT 
     */	
	private String fault;
    /**
     * 更换情况       db_column: REPLACEMENT 
     */	
	private String replacement;
    /**
     * 维护情况       db_column: MAINTAIN 
     */	
	private String maintain;
    /**
     * 设备数量       db_column: EQU_NUMBER 
     */	
	private String equNumber;
    /**
     * 设备编号       db_column: EQU_ID 
     */	
	private String equId;
    /**
     * 前段代码       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 维护时间       db_column: MAIN_DATETIME 
     */	
	
	private Date mainDatetime;
    /**
     * 站点名称       db_column: HEAD_NAME 
     */	
	private String headName;
    /**
     * 文件路径       db_column: PIC_PATH 
     */	
	private String picPath;
    /**
     * 故障开始时间       db_column: START_TIME 
     */	
	
	private Date startTime;
    /**
     * 故障结束时间       db_column: END_TIME 
     */	
	
	private Date endTime;
    /**
     * 维护人       db_column: PERSON 
     */	
	private String person;
    /**
     * 处理结果       db_column: RESAULT 
     */	
	private String resault;
    /**
     * 录音文件路径       db_column: RECORD_PATH 
     */	
	private String recordPath;
    /**
     * 旧设备编号       db_column: OLD_EQU 
     */	
	private String oldEqu;
    /**
     * 旧设备去向，0站点保存 1使馆寄存       db_column: OLD_PLACE 
     */	
	private String oldPlace;
    /**
     * 旧设备状态：0可以修复，1已经报废       db_column: OLD_STATUS 
     */	
	private String oldStatus;
    /**
     * 新设备编号       db_column: NEW_EQU 
     */	
	private String newEqu;
    /**
     * 新设备来源:0邮寄过去，1站点存储，2使馆存储       db_column: NEW_FROM 
     */	
	private String newFrom;
    /**
     * 邮件单号       db_column: MAIL_ORDER 
     */	
	private String mailOrder;
    /**
     * 邮寄时间       db_column: MAIL_TIME 
     */	
	
	private Date mailTime;
	//columns END

	public RadioEquMainTab(){
	}

	public RadioEquMainTab(
		Long id
	){
		this.id = id;
	}

	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	public void setInstallation(String value) {
		this.installation = value;
	}
	
	public String getInstallation() {
		return this.installation;
	}
	public void setUseCase(String value) {
		this.useCase = value;
	}
	
	public String getUseCase() {
		return this.useCase;
	}
	public void setFault(String value) {
		this.fault = value;
	}
	
	public String getFault() {
		return this.fault;
	}
	public void setReplacement(String value) {
		this.replacement = value;
	}
	
	public String getReplacement() {
		return this.replacement;
	}
	public void setMaintain(String value) {
		this.maintain = value;
	}
	
	public String getMaintain() {
		return this.maintain;
	}
	public void setEquNumber(String value) {
		this.equNumber = value;
	}
	
	public String getEquNumber() {
		return this.equNumber;
	}
	public void setEquId(String value) {
		this.equId = value;
	}
	
	public String getEquId() {
		return this.equId;
	}
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}

	
	public void setMainDatetime(Date value) {
		this.mainDatetime = value;
	}
	
	public Date getMainDatetime() {
		return this.mainDatetime;
	}
	public void setHeadName(String value) {
		this.headName = value;
	}
	
	public String getHeadName() {
		return this.headName;
	}
	public void setPicPath(String value) {
		this.picPath = value;
	}
	
	public String getPicPath() {
		return this.picPath;
	}

	
	public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}

	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	public void setPerson(String value) {
		this.person = value;
	}
	
	public String getPerson() {
		return this.person;
	}
	public void setResault(String value) {
		this.resault = value;
	}
	
	public String getResault() {
		return this.resault;
	}
	public void setRecordPath(String value) {
		this.recordPath = value;
	}
	
	public String getRecordPath() {
		return this.recordPath;
	}
	public void setOldEqu(String value) {
		this.oldEqu = value;
	}
	
	public String getOldEqu() {
		return this.oldEqu;
	}
	public void setOldPlace(String value) {
		this.oldPlace = value;
	}
	
	public String getOldPlace() {
		return this.oldPlace;
	}
	public void setOldStatus(String value) {
		this.oldStatus = value;
	}
	
	public String getOldStatus() {
		return this.oldStatus;
	}
	public void setNewEqu(String value) {
		this.newEqu = value;
	}
	
	public String getNewEqu() {
		return this.newEqu;
	}
	public void setNewFrom(String value) {
		this.newFrom = value;
	}
	
	public String getNewFrom() {
		return this.newFrom;
	}
	public void setMailOrder(String value) {
		this.mailOrder = value;
	}
	
	public String getMailOrder() {
		return this.mailOrder;
	}

	public void setMailTime(Date value) {
		this.mailTime = value;
	}
	
	public Date getMailTime() {
		return this.mailTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("HeadId",getHeadId())
			.append("Installation",getInstallation())
			.append("UseCase",getUseCase())
			.append("Fault",getFault())
			.append("Replacement",getReplacement())
			.append("Maintain",getMaintain())
			.append("EquNumber",getEquNumber())
			.append("EquId",getEquId())
			.append("HeadCode",getHeadCode())
			.append("MainDatetime",getMainDatetime())
			.append("HeadName",getHeadName())
			.append("PicPath",getPicPath())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.append("Person",getPerson())
			.append("Resault",getResault())
			.append("RecordPath",getRecordPath())
			.append("OldEqu",getOldEqu())
			.append("OldPlace",getOldPlace())
			.append("OldStatus",getOldStatus())
			.append("NewEqu",getNewEqu())
			.append("NewFrom",getNewFrom())
			.append("MailOrder",getMailOrder())
			.append("MailTime",getMailTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioEquMainTab == false) return false;
		if(this == obj) return true;
		RadioEquMainTab other = (RadioEquMainTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

