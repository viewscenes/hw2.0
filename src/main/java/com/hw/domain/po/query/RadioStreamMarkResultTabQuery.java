/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

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


public class RadioStreamMarkResultTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 录音文件表主键 */
	private Long streamId;
	/** 录音文件开始时间 */
	private Date streamStartDatetimeBegin;
	private Date streamStartDatetimeEnd;
	/** 录音文件结束时间 */
	private Date streamEndDatetimeBegin;
	private Date streamEndDatetimeEnd;
	/** 频率 */
	private Long frequency;
	/** 文件名 */
	private String filename;
	/** 播放url */
	private String playUrl;
	/** 录音类型 */
	private Long reportType;
	/** fmModulation */
	private String fmModulation;
	/** amModulation */
	private String amModulation;
	/** offset */
	private String offset;
	/** levelValue */
	private String levelValue;
	/** headId */
	private Long headId;
	/** headTypeId */
	private Long headTypeId;
	/** headCode */
	private String headCode;
	/** headName */
	private String headName;
	/** markId */
	private Long markId;
	/** counti */
	private Integer counti;
	/** counto */
	private Integer counto;
	/** counts */
	private Integer counts;
	/** description */
	private String description;
	/** markUnit */
	private String markUnit;
	/** recordStartTime */
	private String recordStartTime;
	/** recordEndTime */
	private String recordEndTime;
	/** runplanId */
	private Long runplanId;
	/** runplanTypeId */
	private Long runplanTypeId;
	/** stationId */
	private Long stationId;
	/** stationName */
	private String stationName;
	/** transmiterNo */
	private String transmiterNo;
	/** freq */
	private Long freq;
	/** validStartTime */
	private Date validStartTimeBegin;
	private Date validStartTimeEnd;
	/** validEndTime */
	private Date validEndTimeBegin;
	private Date validEndTimeEnd;
	/** direction */
	private String direction;
	/** power */
	private Long power;
	/** serviceArea */
	private String serviceArea;
	/** serviceName */
	private String serviceName;
	/** runplanStartTime */
	private String runplanStartTime;
	/** runplanEndTime */
	private String runplanEndTime;
	/** playTime */
	private String playTime;
	/** programTypeId */
	private Long programTypeId;
	/** programType */
	private String programType;
	/** languageId */
	private Long languageId;
	/** languageName */
	private String languageName;
	/** programId */
	private Long programId;
	/** monArea */
	private String monArea;
	/** redisseminators */
	private String redisseminators;
	/** seasonId */
	private String seasonId;
	/** xgMonArea */
	private String xgMonArea;
	/** disRunplanId */
	private Long disRunplanId;
	/** disturb */
	private String disturb;
	/** stateName */
	private String stateName;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getStreamId() {
		return this.streamId;
	}
	
	public void setStreamId(Long value) {
		this.streamId = value;
	}
	
	public Date getStreamStartDatetimeBegin() {
		return this.streamStartDatetimeBegin;
	}
	
	public void setStreamStartDatetimeBegin(Date value) {
		this.streamStartDatetimeBegin = value;
	}	
	
	public Date getStreamStartDatetimeEnd() {
		return this.streamStartDatetimeEnd;
	}
	
	public void setStreamStartDatetimeEnd(Date value) {
		this.streamStartDatetimeEnd = value;
	}
	
	public Date getStreamEndDatetimeBegin() {
		return this.streamEndDatetimeBegin;
	}
	
	public void setStreamEndDatetimeBegin(Date value) {
		this.streamEndDatetimeBegin = value;
	}	
	
	public Date getStreamEndDatetimeEnd() {
		return this.streamEndDatetimeEnd;
	}
	
	public void setStreamEndDatetimeEnd(Date value) {
		this.streamEndDatetimeEnd = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public String getFilename() {
		return this.filename;
	}
	
	public void setFilename(String value) {
		this.filename = value;
	}
	
	public String getPlayUrl() {
		return this.playUrl;
	}
	
	public void setPlayUrl(String value) {
		this.playUrl = value;
	}
	
	public Long getReportType() {
		return this.reportType;
	}
	
	public void setReportType(Long value) {
		this.reportType = value;
	}
	
	public String getFmModulation() {
		return this.fmModulation;
	}
	
	public void setFmModulation(String value) {
		this.fmModulation = value;
	}
	
	public String getAmModulation() {
		return this.amModulation;
	}
	
	public void setAmModulation(String value) {
		this.amModulation = value;
	}
	
	public String getOffset() {
		return this.offset;
	}
	
	public void setOffset(String value) {
		this.offset = value;
	}
	
	public String getLevelValue() {
		return this.levelValue;
	}
	
	public void setLevelValue(String value) {
		this.levelValue = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getHeadTypeId() {
		return this.headTypeId;
	}
	
	public void setHeadTypeId(Long value) {
		this.headTypeId = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadName() {
		return this.headName;
	}
	
	public void setHeadName(String value) {
		this.headName = value;
	}
	
	public Long getMarkId() {
		return this.markId;
	}
	
	public void setMarkId(Long value) {
		this.markId = value;
	}
	
	public Integer getCounti() {
		return this.counti;
	}
	
	public void setCounti(Integer value) {
		this.counti = value;
	}
	
	public Integer getCounto() {
		return this.counto;
	}
	
	public void setCounto(Integer value) {
		this.counto = value;
	}
	
	public Integer getCounts() {
		return this.counts;
	}
	
	public void setCounts(Integer value) {
		this.counts = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getMarkUnit() {
		return this.markUnit;
	}
	
	public void setMarkUnit(String value) {
		this.markUnit = value;
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
	
	public Long getRunplanId() {
		return this.runplanId;
	}
	
	public void setRunplanId(Long value) {
		this.runplanId = value;
	}
	
	public Long getRunplanTypeId() {
		return this.runplanTypeId;
	}
	
	public void setRunplanTypeId(Long value) {
		this.runplanTypeId = value;
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
	
	public String getTransmiterNo() {
		return this.transmiterNo;
	}
	
	public void setTransmiterNo(String value) {
		this.transmiterNo = value;
	}
	
	public Long getFreq() {
		return this.freq;
	}
	
	public void setFreq(Long value) {
		this.freq = value;
	}
	
	public Date getValidStartTimeBegin() {
		return this.validStartTimeBegin;
	}
	
	public void setValidStartTimeBegin(Date value) {
		this.validStartTimeBegin = value;
	}	
	
	public Date getValidStartTimeEnd() {
		return this.validStartTimeEnd;
	}
	
	public void setValidStartTimeEnd(Date value) {
		this.validStartTimeEnd = value;
	}
	
	public Date getValidEndTimeBegin() {
		return this.validEndTimeBegin;
	}
	
	public void setValidEndTimeBegin(Date value) {
		this.validEndTimeBegin = value;
	}	
	
	public Date getValidEndTimeEnd() {
		return this.validEndTimeEnd;
	}
	
	public void setValidEndTimeEnd(Date value) {
		this.validEndTimeEnd = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public Long getPower() {
		return this.power;
	}
	
	public void setPower(Long value) {
		this.power = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getServiceName() {
		return this.serviceName;
	}
	
	public void setServiceName(String value) {
		this.serviceName = value;
	}
	
	public String getRunplanStartTime() {
		return this.runplanStartTime;
	}
	
	public void setRunplanStartTime(String value) {
		this.runplanStartTime = value;
	}
	
	public String getRunplanEndTime() {
		return this.runplanEndTime;
	}
	
	public void setRunplanEndTime(String value) {
		this.runplanEndTime = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public Long getProgramTypeId() {
		return this.programTypeId;
	}
	
	public void setProgramTypeId(Long value) {
		this.programTypeId = value;
	}
	
	public String getProgramType() {
		return this.programType;
	}
	
	public void setProgramType(String value) {
		this.programType = value;
	}
	
	public Long getLanguageId() {
		return this.languageId;
	}
	
	public void setLanguageId(Long value) {
		this.languageId = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public Long getProgramId() {
		return this.programId;
	}
	
	public void setProgramId(Long value) {
		this.programId = value;
	}
	
	public String getMonArea() {
		return this.monArea;
	}
	
	public void setMonArea(String value) {
		this.monArea = value;
	}
	
	public String getRedisseminators() {
		return this.redisseminators;
	}
	
	public void setRedisseminators(String value) {
		this.redisseminators = value;
	}
	
	public String getSeasonId() {
		return this.seasonId;
	}
	
	public void setSeasonId(String value) {
		this.seasonId = value;
	}
	
	public String getXgMonArea() {
		return this.xgMonArea;
	}
	
	public void setXgMonArea(String value) {
		this.xgMonArea = value;
	}
	
	public Long getDisRunplanId() {
		return this.disRunplanId;
	}
	
	public void setDisRunplanId(Long value) {
		this.disRunplanId = value;
	}
	
	public String getDisturb() {
		return this.disturb;
	}
	
	public void setDisturb(String value) {
		this.disturb = value;
	}
	
	public String getStateName() {
		return this.stateName;
	}
	
	public void setStateName(String value) {
		this.stateName = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

