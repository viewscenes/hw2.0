
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


public class RadioMarkViewXiaoheiQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** markId */
	private Long markId;
	/** markUser */
	private String markUser;
	/** markDatetime */
	private Date markDatetimeBegin;
	private Date markDatetimeEnd;
	/** headCode */
	private String headCode;
	/** equCode */
	private String equCode;
	/** frequency */
	private Long frequency;
	/** runplanId */
	private Long runplanId;
	/** counti */
	private Long counti;
	/** counto */
	private Long counto;
	/** counts */
	private Long counts;
	/** description */
	private String description;
	/** markType */
	private String markType;
	/** editUser */
	private String editUser;
	/** unit */
	private String unit;
	/** markFileUrl */
	private String markFileUrl;
	/** fileName */
	private String fileName;
	/** fileLength */
	private String fileLength;
	/** recordStartTime */
	private String recordStartTime;
	/** recordEndTime */
	private String recordEndTime;
	/** stationId */
	private Long stationId;
	/** stationName */
	private String stationName;
	/** headname */
	private String headname;
	/** playTime */
	private String playTime;
	/** taskId */
	private Long taskId;
	/** taskName */
	private String taskName;
	/** levelValue */
	private Long levelValue;
	/** fmValue */
	private Long fmValue;
	/** amValue */
	private Long amValue;
	/** offsetValue */
	private Long offsetValue;
	/** remark */
	private String remark;
	/** asrType */
	private Long asrType;
	/** resultType */
	private String resultType;
	/** status */
	private String status;
	/** languagename1 */
	private String languagename1;
	/** startDatetime */
	private Date startDatetimeBegin;
	private Date startDatetimeEnd;
	/** endDatetime */
	private Date endDatetimeBegin;
	private Date endDatetimeEnd;
	/** reportType */
	private Long reportType;

	public Long getMarkId() {
		return this.markId;
	}
	
	public void setMarkId(Long value) {
		this.markId = value;
	}
	
	public String getMarkUser() {
		return this.markUser;
	}
	
	public void setMarkUser(String value) {
		this.markUser = value;
	}
	
	public Date getMarkDatetimeBegin() {
		return this.markDatetimeBegin;
	}
	
	public void setMarkDatetimeBegin(Date value) {
		this.markDatetimeBegin = value;
	}	
	
	public Date getMarkDatetimeEnd() {
		return this.markDatetimeEnd;
	}
	
	public void setMarkDatetimeEnd(Date value) {
		this.markDatetimeEnd = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getRunplanId() {
		return this.runplanId;
	}
	
	public void setRunplanId(Long value) {
		this.runplanId = value;
	}
	
	public Long getCounti() {
		return this.counti;
	}
	
	public void setCounti(Long value) {
		this.counti = value;
	}
	
	public Long getCounto() {
		return this.counto;
	}
	
	public void setCounto(Long value) {
		this.counto = value;
	}
	
	public Long getCounts() {
		return this.counts;
	}
	
	public void setCounts(Long value) {
		this.counts = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getMarkType() {
		return this.markType;
	}
	
	public void setMarkType(String value) {
		this.markType = value;
	}
	
	public String getEditUser() {
		return this.editUser;
	}
	
	public void setEditUser(String value) {
		this.editUser = value;
	}
	
	public String getUnit() {
		return this.unit;
	}
	
	public void setUnit(String value) {
		this.unit = value;
	}
	
	public String getMarkFileUrl() {
		return this.markFileUrl;
	}
	
	public void setMarkFileUrl(String value) {
		this.markFileUrl = value;
	}
	
	public String getFileName() {
		return this.fileName;
	}
	
	public void setFileName(String value) {
		this.fileName = value;
	}
	
	public String getFileLength() {
		return this.fileLength;
	}
	
	public void setFileLength(String value) {
		this.fileLength = value;
	}
	
	public String getRecordStartTime() {
		return this.recordStartTime;
	}
	
	public void setRecordStartTime(String value) {
		this.recordStartTime = value;
	}
	
	public String getRecordEndTime() {
		return this.recordEndTime;
	}
	
	public void setRecordEndTime(String value) {
		this.recordEndTime = value;
	}
	
	public Long getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Long value) {
		this.stationId = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getHeadname() {
		return this.headname;
	}
	
	public void setHeadname(String value) {
		this.headname = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public Long getTaskId() {
		return this.taskId;
	}
	
	public void setTaskId(Long value) {
		this.taskId = value;
	}
	
	public String getTaskName() {
		return this.taskName;
	}
	
	public void setTaskName(String value) {
		this.taskName = value;
	}
	
	public Long getLevelValue() {
		return this.levelValue;
	}
	
	public void setLevelValue(Long value) {
		this.levelValue = value;
	}
	
	public Long getFmValue() {
		return this.fmValue;
	}
	
	public void setFmValue(Long value) {
		this.fmValue = value;
	}
	
	public Long getAmValue() {
		return this.amValue;
	}
	
	public void setAmValue(Long value) {
		this.amValue = value;
	}
	
	public Long getOffsetValue() {
		return this.offsetValue;
	}
	
	public void setOffsetValue(Long value) {
		this.offsetValue = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public Long getAsrType() {
		return this.asrType;
	}
	
	public void setAsrType(Long value) {
		this.asrType = value;
	}
	
	public String getResultType() {
		return this.resultType;
	}
	
	public void setResultType(String value) {
		this.resultType = value;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getLanguagename1() {
		return this.languagename1;
	}
	
	public void setLanguagename1(String value) {
		this.languagename1 = value;
	}
	
	public Date getStartDatetimeBegin() {
		return this.startDatetimeBegin;
	}
	
	public void setStartDatetimeBegin(Date value) {
		this.startDatetimeBegin = value;
	}	
	
	public Date getStartDatetimeEnd() {
		return this.startDatetimeEnd;
	}
	
	public void setStartDatetimeEnd(Date value) {
		this.startDatetimeEnd = value;
	}
	
	public Date getEndDatetimeBegin() {
		return this.endDatetimeBegin;
	}
	
	public void setEndDatetimeBegin(Date value) {
		this.endDatetimeBegin = value;
	}	
	
	public Date getEndDatetimeEnd() {
		return this.endDatetimeEnd;
	}
	
	public void setEndDatetimeEnd(Date value) {
		this.endDatetimeEnd = value;
	}
	
	public Long getReportType() {
		return this.reportType;
	}
	
	public void setReportType(Long value) {
		this.reportType = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

