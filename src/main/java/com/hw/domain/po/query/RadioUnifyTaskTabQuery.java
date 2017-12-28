
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


public class RadioUnifyTaskTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** taskId */
	private Long taskId;
	/** 接收机号，指标、频偏、录音任务接收机取RADIO_TASK_FREQ_TAB中的，频谱取这个。 */
	private String equCode;
	/** 前端code */
	private String headCode;
	/** 是否删除0：未删除。1：删除 */
	private Long isDelete;
	/** 有效期开始时间 */
	private Date validStartdatetimeBegin;
	private Date validStartdatetimeEnd;
	/** 有效期结束时间 */
	private Date validEnddatetimeBegin;
	private Date validEnddatetimeEnd;
	/** 是否监测电平 */
	private Long checkLevel;
	/** 是否监测调制度 */
	private Long checkFmModulation;
	/** 是否监测条幅度 */
	private Long checkAmModulation;
	/** 是否监测最大调制度 */
	private Long checkFmModulationMax;
	/** 是否监测频偏 */
	private Long checkOffset;
	/** 是否监测带宽 */
	private Long checkBandwidth;
	/** 采样单元1分钟2秒钟3小时 */
	private Long unit;
	/** 采样个数 */
	private Long samplesNumber;
	/** 下达状态：0未下达，1已下达，2下达失败，3等待下达 */
	private Long isSend;
	/** 是否延迟下达0不延迟，1延迟 */
	private Long isDelaysend;
	/** 延迟下达时间 */
	private Date delaysendDatetimeBegin;
	private Date delaysendDatetimeEnd;
	/** 录音时间 */
	private String recordlength;
	/** 有效期 */
	private Long expiredays;
	/** 间隔时间 */
	private String sleeptime;
	/** 下达次数 */
	private Long sendTimes;
	/** 下达信息 */
	private String note;
	/** 运行图id */
	private Long runplanId;
	/** 在有效下发次数范围中下发日期 */
	private String batchNo;
	/** 是否存活：0激活，1延迟 */
	private Long isActive;
	/** 权限 */
	private Long priority;
	/** 是否临时任务：1是。2否 */
	private Long isTemporary;
	/** 下发到设备日期 */
	private Date sendDatetimeBegin;
	private Date sendDatetimeEnd;
	/** 码率 */
	private Long bps;
	/** 任务类型1 指标任务 2 录音任务 3 频偏任务 4 频谱任务 5录音指标任务 */
	private Long taskType;
	/** 任务生成人 */
	private String createUser;
	/** 任务下发 人 */
	private String sendUser;
	/** 0:未审核1：审核 */
	private Long authenticStatus;
	/** 审核人 */
	private String authenticUser;
	/** 指标收测时间间隔 */
	private String qualitySleeptime;
	/** 录音收测时间间隔 */
	private String streamSleeptime;
	/** 频偏收测时间间隔 */
	private String offsetSleeptime;
	/** 频谱收测时间间隔 */
	private String spectrumSleeptime;
	/** 1:代表指标任务 */
	private Long checkQualityTask;
	/** 1;代表频偏任务 */
	private Long checkOffsetTask;
	/** 1:代表录音任务 */
	private Long checkStreamTask;
	/** 0报警1不报警 */
	private Long checkAlarm;
	/** 站点类型 101采集点 102遥控站 */
	private Long headTypeId;
	/** 运行图录音任务类型 质量 录音 */
	private String recordType;

	public Long getTaskId() {
		return this.taskId;
	}
	
	public void setTaskId(Long value) {
		this.taskId = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Date getValidStartdatetimeBegin() {
		return this.validStartdatetimeBegin;
	}
	
	public void setValidStartdatetimeBegin(Date value) {
		this.validStartdatetimeBegin = value;
	}	
	
	public Date getValidStartdatetimeEnd() {
		return this.validStartdatetimeEnd;
	}
	
	public void setValidStartdatetimeEnd(Date value) {
		this.validStartdatetimeEnd = value;
	}
	
	public Date getValidEnddatetimeBegin() {
		return this.validEnddatetimeBegin;
	}
	
	public void setValidEnddatetimeBegin(Date value) {
		this.validEnddatetimeBegin = value;
	}	
	
	public Date getValidEnddatetimeEnd() {
		return this.validEnddatetimeEnd;
	}
	
	public void setValidEnddatetimeEnd(Date value) {
		this.validEnddatetimeEnd = value;
	}
	
	public Long getCheckLevel() {
		return this.checkLevel;
	}
	
	public void setCheckLevel(Long value) {
		this.checkLevel = value;
	}
	
	public Long getCheckFmModulation() {
		return this.checkFmModulation;
	}
	
	public void setCheckFmModulation(Long value) {
		this.checkFmModulation = value;
	}
	
	public Long getCheckAmModulation() {
		return this.checkAmModulation;
	}
	
	public void setCheckAmModulation(Long value) {
		this.checkAmModulation = value;
	}
	
	public Long getCheckFmModulationMax() {
		return this.checkFmModulationMax;
	}
	
	public void setCheckFmModulationMax(Long value) {
		this.checkFmModulationMax = value;
	}
	
	public Long getCheckOffset() {
		return this.checkOffset;
	}
	
	public void setCheckOffset(Long value) {
		this.checkOffset = value;
	}
	
	public Long getCheckBandwidth() {
		return this.checkBandwidth;
	}
	
	public void setCheckBandwidth(Long value) {
		this.checkBandwidth = value;
	}
	
	public Long getUnit() {
		return this.unit;
	}
	
	public void setUnit(Long value) {
		this.unit = value;
	}
	
	public Long getSamplesNumber() {
		return this.samplesNumber;
	}
	
	public void setSamplesNumber(Long value) {
		this.samplesNumber = value;
	}
	
	public Long getIsSend() {
		return this.isSend;
	}
	
	public void setIsSend(Long value) {
		this.isSend = value;
	}
	
	public Long getIsDelaysend() {
		return this.isDelaysend;
	}
	
	public void setIsDelaysend(Long value) {
		this.isDelaysend = value;
	}
	
	public Date getDelaysendDatetimeBegin() {
		return this.delaysendDatetimeBegin;
	}
	
	public void setDelaysendDatetimeBegin(Date value) {
		this.delaysendDatetimeBegin = value;
	}	
	
	public Date getDelaysendDatetimeEnd() {
		return this.delaysendDatetimeEnd;
	}
	
	public void setDelaysendDatetimeEnd(Date value) {
		this.delaysendDatetimeEnd = value;
	}
	
	public String getRecordlength() {
		return this.recordlength;
	}
	
	public void setRecordlength(String value) {
		this.recordlength = value;
	}
	
	public Long getExpiredays() {
		return this.expiredays;
	}
	
	public void setExpiredays(Long value) {
		this.expiredays = value;
	}
	
	public String getSleeptime() {
		return this.sleeptime;
	}
	
	public void setSleeptime(String value) {
		this.sleeptime = value;
	}
	
	public Long getSendTimes() {
		return this.sendTimes;
	}
	
	public void setSendTimes(Long value) {
		this.sendTimes = value;
	}
	
	public String getNote() {
		return this.note;
	}
	
	public void setNote(String value) {
		this.note = value;
	}
	
	public Long getRunplanId() {
		return this.runplanId;
	}
	
	public void setRunplanId(Long value) {
		this.runplanId = value;
	}
	
	public String getBatchNo() {
		return this.batchNo;
	}
	
	public void setBatchNo(String value) {
		this.batchNo = value;
	}
	
	public Long getIsActive() {
		return this.isActive;
	}
	
	public void setIsActive(Long value) {
		this.isActive = value;
	}
	
	public Long getPriority() {
		return this.priority;
	}
	
	public void setPriority(Long value) {
		this.priority = value;
	}
	
	public Long getIsTemporary() {
		return this.isTemporary;
	}
	
	public void setIsTemporary(Long value) {
		this.isTemporary = value;
	}
	
	public Date getSendDatetimeBegin() {
		return this.sendDatetimeBegin;
	}
	
	public void setSendDatetimeBegin(Date value) {
		this.sendDatetimeBegin = value;
	}	
	
	public Date getSendDatetimeEnd() {
		return this.sendDatetimeEnd;
	}
	
	public void setSendDatetimeEnd(Date value) {
		this.sendDatetimeEnd = value;
	}
	
	public Long getBps() {
		return this.bps;
	}
	
	public void setBps(Long value) {
		this.bps = value;
	}
	
	public Long getTaskType() {
		return this.taskType;
	}
	
	public void setTaskType(Long value) {
		this.taskType = value;
	}
	
	public String getCreateUser() {
		return this.createUser;
	}
	
	public void setCreateUser(String value) {
		this.createUser = value;
	}
	
	public String getSendUser() {
		return this.sendUser;
	}
	
	public void setSendUser(String value) {
		this.sendUser = value;
	}
	
	public Long getAuthenticStatus() {
		return this.authenticStatus;
	}
	
	public void setAuthenticStatus(Long value) {
		this.authenticStatus = value;
	}
	
	public String getAuthenticUser() {
		return this.authenticUser;
	}
	
	public void setAuthenticUser(String value) {
		this.authenticUser = value;
	}
	
	public String getQualitySleeptime() {
		return this.qualitySleeptime;
	}
	
	public void setQualitySleeptime(String value) {
		this.qualitySleeptime = value;
	}
	
	public String getStreamSleeptime() {
		return this.streamSleeptime;
	}
	
	public void setStreamSleeptime(String value) {
		this.streamSleeptime = value;
	}
	
	public String getOffsetSleeptime() {
		return this.offsetSleeptime;
	}
	
	public void setOffsetSleeptime(String value) {
		this.offsetSleeptime = value;
	}
	
	public String getSpectrumSleeptime() {
		return this.spectrumSleeptime;
	}
	
	public void setSpectrumSleeptime(String value) {
		this.spectrumSleeptime = value;
	}
	
	public Long getCheckQualityTask() {
		return this.checkQualityTask;
	}
	
	public void setCheckQualityTask(Long value) {
		this.checkQualityTask = value;
	}
	
	public Long getCheckOffsetTask() {
		return this.checkOffsetTask;
	}
	
	public void setCheckOffsetTask(Long value) {
		this.checkOffsetTask = value;
	}
	
	public Long getCheckStreamTask() {
		return this.checkStreamTask;
	}
	
	public void setCheckStreamTask(Long value) {
		this.checkStreamTask = value;
	}
	
	public Long getCheckAlarm() {
		return this.checkAlarm;
	}
	
	public void setCheckAlarm(Long value) {
		this.checkAlarm = value;
	}
	
	public Long getHeadTypeId() {
		return this.headTypeId;
	}
	
	public void setHeadTypeId(Long value) {
		this.headTypeId = value;
	}
	
	public String getRecordType() {
		return this.recordType;
	}
	
	public void setRecordType(String value) {
		this.recordType = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

