
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


public class RadioQualityAlarmTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * alarmId       db_column: ALARM_ID 
     */	
	
	private Integer alarmId;
    /**
     * 接收机       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 原始报警id       db_column: ORIGIN_ALARMID 
     */	
	
	private Integer originAlarmid;
    /**
     * 报警时间       db_column: ALARM_DATETIME 
     */	
	
	private Date alarmDatetime;
    /**
     * 恢复时间       db_column: RESUME_DATETIME 
     */	
	
	private Date resumeDatetime;
    /**
     * 是否回复       db_column: IS_RESUME 
     */	
	
	private Integer isResume;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Integer frequency;
    /**
     * 报警类型       db_column: TYPE 
     */	
	
	private Integer type;
    /**
     * 描述       db_column: DESCRIPTION 
     */	
	private String description;
    /**
     * 原因       db_column: REASON 
     */	
	private String reason;
    /**
     * 电平       db_column: E_LEVEL 
     */	
	
	private Integer elevel;
    /**
     * 调幅度       db_column: AM_MODULATION 
     */	
	
	private Integer amModulation;
    /**
     * 调制度       db_column: FM_MODULATION 
     */	
	
	private Integer fmModulation;
    /**
     * 衰减       db_column: ATTENUATION 
     */	
	
	private Integer attenuation;
    /**
     * 站点id       db_column: HEAD_ID 
     */	
	
	private Integer headId;
    /**
     * 报警类型：0，手动回收，1主动上报       db_column: REPORT_TYPE 
     */	
	
	private Integer reportType;
    /**
     * 是否处理       db_column: IS_HANDLE 
     */	
	
	private Integer isHandle;
    /**
     * 处理意见       db_column: REMARK 
     */	
	private String remark;
    /**
     * 处理人       db_column: OPERATOR 
     */	
	private String operator;
    /**
     * 处理时间       db_column: HANDLE_DATETIME 
     */	
	
	private Date handleDatetime;
    /**
     * 波段       db_column: BAND 
     */	
	private Integer band;
    /**
     * 站点code       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 审核人       db_column: AUDITOR 
     */	
	private String auditor;
    /**
     * 是否还可以入异态表 1可以 0不可以       db_column: ERRORINDB 
     */	
	private String errorindb;
	//columns END

	public RadioQualityAlarmTab(){
	}

	public RadioQualityAlarmTab(
		Integer alarmId
	){
		this.alarmId = alarmId;
	}

	public void setAlarmId(Integer value) {
		this.alarmId = value;
	}
	
	public Integer getAlarmId() {
		return this.alarmId;
	}
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	public void setOriginAlarmid(Integer value) {
		this.originAlarmid = value;
	}
	
	public Integer getOriginAlarmid() {
		return this.originAlarmid;
	}

	
	public void setAlarmDatetime(Date value) {
		this.alarmDatetime = value;
	}
	
	public Date getAlarmDatetime() {
		return this.alarmDatetime;
	}


	
	public void setResumeDatetime(Date value) {
		this.resumeDatetime = value;
	}
	
	public Date getResumeDatetime() {
		return this.resumeDatetime;
	}
	public void setIsResume(Integer value) {
		this.isResume = value;
	}
	
	public Integer getIsResume() {
		return this.isResume;
	}
	public void setFrequency(Integer value) {
		this.frequency = value;
	}
	
	public Integer getFrequency() {
		return this.frequency;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setReason(String value) {
		this.reason = value;
	}
	
	public String getReason() {
		return this.reason;
	}
	public void setElevel(Integer value) {
		this.elevel = value;
	}
	
	public Integer getElevel() {
		return this.elevel;
	}
	public void setAmModulation(Integer value) {
		this.amModulation = value;
	}
	
	public Integer getAmModulation() {
		return this.amModulation;
	}
	public void setFmModulation(Integer value) {
		this.fmModulation = value;
	}
	
	public Integer getFmModulation() {
		return this.fmModulation;
	}
	public void setAttenuation(Integer value) {
		this.attenuation = value;
	}
	
	public Integer getAttenuation() {
		return this.attenuation;
	}
	public void setHeadId(Integer value) {
		this.headId = value;
	}
	
	public Integer getHeadId() {
		return this.headId;
	}
	public void setReportType(Integer value) {
		this.reportType = value;
	}
	
	public Integer getReportType() {
		return this.reportType;
	}
	public void setIsHandle(Integer value) {
		this.isHandle = value;
	}
	
	public Integer getIsHandle() {
		return this.isHandle;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setOperator(String value) {
		this.operator = value;
	}
	
	public String getOperator() {
		return this.operator;
	}

	
	public void setHandleDatetime(Date value) {
		this.handleDatetime = value;
	}
	
	public Date getHandleDatetime() {
		return this.handleDatetime;
	}
	public void setBand(Integer value) {
		this.band = value;
	}
	
	public Integer getBand() {
		return this.band;
	}
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	public void setAuditor(String value) {
		this.auditor = value;
	}
	
	public String getAuditor() {
		return this.auditor;
	}
	public void setErrorindb(String value) {
		this.errorindb = value;
	}
	
	public String getErrorindb() {
		return this.errorindb;
	}
	
	private DicQualityAlarmTypeTab dicQualityAlarmTypeTab;
	
	public void setDicQualityAlarmTypeTab(DicQualityAlarmTypeTab dicQualityAlarmTypeTab){
		this.dicQualityAlarmTypeTab = dicQualityAlarmTypeTab;
	}
	
	public DicQualityAlarmTypeTab getDicQualityAlarmTypeTab() {
		return dicQualityAlarmTypeTab;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("AlarmId",getAlarmId())
			.append("EquCode",getEquCode())
			.append("OriginAlarmid",getOriginAlarmid())
			.append("AlarmDatetime",getAlarmDatetime())
			.append("ResumeDatetime",getResumeDatetime())
			.append("IsResume",getIsResume())
			.append("Frequency",getFrequency())
			.append("Type",getType())
			.append("Description",getDescription())
			.append("Reason",getReason())
			.append("Elevel",getElevel())
			.append("AmModulation",getAmModulation())
			.append("FmModulation",getFmModulation())
			.append("Attenuation",getAttenuation())
			.append("HeadId",getHeadId())
			.append("ReportType",getReportType())
			.append("IsHandle",getIsHandle())
			.append("Remark",getRemark())
			.append("Operator",getOperator())
			.append("HandleDatetime",getHandleDatetime())
			.append("Band",getBand())
			.append("HeadCode",getHeadCode())
			.append("Auditor",getAuditor())
			.append("Errorindb",getErrorindb())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getAlarmId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioQualityAlarmTab == false) return false;
		if(this == obj) return true;
		RadioQualityAlarmTab other = (RadioQualityAlarmTab)obj;
		return new EqualsBuilder()
			.append(getAlarmId(),other.getAlarmId())
			.isEquals();
	}
}

