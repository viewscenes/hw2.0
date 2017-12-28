
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioQualityAlarmTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** alarmId */
	private Long alarmId;
	/** 接收机 */
	private String equCode;
	/** 原始报警id */
	private Long originAlarmid;
	/** 报警时间 */
	private Date alarmDatetimeBegin;
	private Date alarmDatetimeEnd;
	/** 恢复时间 */
	private Date resumeDatetimeBegin;
	private Date resumeDatetimeEnd;
	/** 是否回复 */
	private Long isResume;
	/** 频率 */
	private Long frequency;
	/** 报警类型 */
	private Long type;
	/** 描述 */
	private String description;
	/** 原因 */
	private String reason;
	/** 电平 */
	private Long elevel;
	/** 调幅度 */
	private Long amModulation;
	/** 调制度 */
	private Long fmModulation;
	/** 衰减 */
	private Long attenuation;
	/** 站点id */
	private Long headId;
	/** 报警类型：0，手动回收，1主动上报 */
	private Long reportType;
	/** 是否处理 */
	private Long isHandle;
	/** 处理意见 */
	private String remark;
	/** 处理人 */
	private String operator;
	/** 处理时间 */
	private Date handleDatetimeBegin;
	private Date handleDatetimeEnd;
	/** 波段 */
	private Integer band;
	/** 站点code */
	private String headCode;
	/** 审核人 */
	private String auditor;
	/** 是否还可以入异态表 1可以 0不可以 */
	private String errorindb;

	public Long getAlarmId() {
		return this.alarmId;
	}
	
	public void setAlarmId(Long value) {
		this.alarmId = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public Long getOriginAlarmid() {
		return this.originAlarmid;
	}
	
	public void setOriginAlarmid(Long value) {
		this.originAlarmid = value;
	}
	
	public Date getAlarmDatetimeBegin() {
		return this.alarmDatetimeBegin;
	}
	
	public void setAlarmDatetimeBegin(Date value) {
		this.alarmDatetimeBegin = value;
	}	
	
	public Date getAlarmDatetimeEnd() {
		return this.alarmDatetimeEnd;
	}
	
	public void setAlarmDatetimeEnd(Date value) {
		this.alarmDatetimeEnd = value;
	}
	
	public Date getResumeDatetimeBegin() {
		return this.resumeDatetimeBegin;
	}
	
	public void setResumeDatetimeBegin(Date value) {
		this.resumeDatetimeBegin = value;
	}	
	
	public Date getResumeDatetimeEnd() {
		return this.resumeDatetimeEnd;
	}
	
	public void setResumeDatetimeEnd(Date value) {
		this.resumeDatetimeEnd = value;
	}
	
	public Long getIsResume() {
		return this.isResume;
	}
	
	public void setIsResume(Long value) {
		this.isResume = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getType() {
		return this.type;
	}
	
	public void setType(Long value) {
		this.type = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getReason() {
		return this.reason;
	}
	
	public void setReason(String value) {
		this.reason = value;
	}
	
	public Long getElevel() {
		return this.elevel;
	}
	
	public void setElevel(Long value) {
		this.elevel = value;
	}
	
	public Long getAmModulation() {
		return this.amModulation;
	}
	
	public void setAmModulation(Long value) {
		this.amModulation = value;
	}
	
	public Long getFmModulation() {
		return this.fmModulation;
	}
	
	public void setFmModulation(Long value) {
		this.fmModulation = value;
	}
	
	public Long getAttenuation() {
		return this.attenuation;
	}
	
	public void setAttenuation(Long value) {
		this.attenuation = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getReportType() {
		return this.reportType;
	}
	
	public void setReportType(Long value) {
		this.reportType = value;
	}
	
	public Long getIsHandle() {
		return this.isHandle;
	}
	
	public void setIsHandle(Long value) {
		this.isHandle = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getOperator() {
		return this.operator;
	}
	
	public void setOperator(String value) {
		this.operator = value;
	}
	
	public Date getHandleDatetimeBegin() {
		return this.handleDatetimeBegin;
	}
	
	public void setHandleDatetimeBegin(Date value) {
		this.handleDatetimeBegin = value;
	}	
	
	public Date getHandleDatetimeEnd() {
		return this.handleDatetimeEnd;
	}
	
	public void setHandleDatetimeEnd(Date value) {
		this.handleDatetimeEnd = value;
	}
	
	public Integer getBand() {
		return this.band;
	}
	
	public void setBand(Integer value) {
		this.band = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getAuditor() {
		return this.auditor;
	}
	
	public void setAuditor(String value) {
		this.auditor = value;
	}
	
	public String getErrorindb() {
		return this.errorindb;
	}
	
	public void setErrorindb(String value) {
		this.errorindb = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

