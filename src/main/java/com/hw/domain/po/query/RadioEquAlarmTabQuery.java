
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


public class RadioEquAlarmTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** alarmId */
	private Long alarmId;
	/** 前段id */
	private Long headId;
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
	/** 是否恢复 */
	private Long isResume;
	/** 类型 */
	private Long type;
	/** 描述 */
	private String description;
	/** 原因 */
	private String reason;
	/** 输出电压 */
	private Long outputlinelevel;
	/** 输入电压 */
	private Long inputlinelevel;
	/** 外电频率 */
	private Long linefrequency;
	/** UPS电池电压 */
	private Long batterylevel;
	/** UPS状态字 */
	private String upsstatus;
	/** 上报类型：0，手动回收，1主动上报,2手动添加 */
	private Long reportType;
	/** 是否处理 */
	private Long isHandle;
	/** 处理日期 */
	private Date handleDatetimeBegin;
	private Date handleDatetimeEnd;
	/** 处理人 */
	private String operator;
	/** 处理意见 */
	private String remark;
	/** 是否删除 */
	private Long isDelete;
	/** 前段代码 */
	private String headCode;

	public Long getAlarmId() {
		return this.alarmId;
	}
	
	public void setAlarmId(Long value) {
		this.alarmId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
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
	
	public Long getOutputlinelevel() {
		return this.outputlinelevel;
	}
	
	public void setOutputlinelevel(Long value) {
		this.outputlinelevel = value;
	}
	
	public Long getInputlinelevel() {
		return this.inputlinelevel;
	}
	
	public void setInputlinelevel(Long value) {
		this.inputlinelevel = value;
	}
	
	public Long getLinefrequency() {
		return this.linefrequency;
	}
	
	public void setLinefrequency(Long value) {
		this.linefrequency = value;
	}
	
	public Long getBatterylevel() {
		return this.batterylevel;
	}
	
	public void setBatterylevel(Long value) {
		this.batterylevel = value;
	}
	
	public String getUpsstatus() {
		return this.upsstatus;
	}
	
	public void setUpsstatus(String value) {
		this.upsstatus = value;
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
	
	public String getOperator() {
		return this.operator;
	}
	
	public void setOperator(String value) {
		this.operator = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

