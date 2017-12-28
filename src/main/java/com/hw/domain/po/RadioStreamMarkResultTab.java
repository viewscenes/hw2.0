/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.hw.domain.po;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioStreamMarkResultTab implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Integer id;
    /**
     * 录音文件表主键       db_column: STREAM_ID 
     */	

	private Integer streamId;
    /**
     * 录音文件开始时间       db_column: STREAM_START_DATETIME 
     */	
	
	private Date streamStartDatetime;
    /**
     * 录音文件结束时间       db_column: STREAM_END_DATETIME 
     */	
	
	private Date streamEndDatetime;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Integer frequency;
    /**
     * 文件名       db_column: FILENAME 
     */	

	private String filename;
    /**
     * 播放url       db_column: PLAY_URL 
     */	

	private String playUrl;
    /**
     * 录音类型       db_column: REPORT_TYPE 
     */	
	
	private Integer reportType;
    /**
     * fmModulation       db_column: FM_MODULATION 
     */	

	private String fmModulation;
    /**
     * amModulation       db_column: AM_MODULATION 
     */	

	private String amModulation;
    /**
     * offset       db_column: OFFSET 
     */	

	private String offset;
    /**
     * levelValue       db_column: LEVEL_VALUE 
     */	

	private String levelValue;
    /**
     * headId       db_column: HEAD_ID 
     */	
	
	private Integer headId;
    /**
     * headTypeId       db_column: HEAD_TYPE_ID 
     */	
	
	private Integer headTypeId;
    /**
     * headCode       db_column: HEAD_CODE 
     */	

	private String headCode;
    /**
     * headName       db_column: HEAD_NAME 
     */	

	private String headName;
    /**
     * markId       db_column: MARK_ID 
     */	

	private Integer markId;
    /**
     * counti       db_column: COUNTI 
     */	

	private Integer counti;
    /**
     * counto       db_column: COUNTO 
     */	

	private Integer counto;
    /**
     * counts       db_column: COUNTS 
     */	

	private Integer counts;
    /**
     * description       db_column: DESCRIPTION 
     */	

	private String description;
    /**
     * markUnit       db_column: MARK_UNIT 
     */	

	private String markUnit;
    /**
     * recordStartTime       db_column: RECORD_START_TIME 
     */	

	private String recordStartTime;
    /**
     * recordEndTime       db_column: RECORD_END_TIME 
     */	

	private String recordEndTime;
    /**
     * runplanId       db_column: RUNPLAN_ID 
     */	

	private Integer runplanId;
    /**
     * runplanTypeId       db_column: RUNPLAN_TYPE_ID 
     */	

	private Integer runplanTypeId;
    /**
     * stationId       db_column: STATION_ID 
     */	
	
	private Integer stationId;
    /**
     * stationName       db_column: STATION_NAME 
     */	

	private String stationName;
    /**
     * transmiterNo       db_column: TRANSMITER_NO 
     */	

	private String transmiterNo;

    /**
     * validStartTime       db_column: VALID_START_TIME 
     */	
	
	private Date validStartTime;
    /**
     * validEndTime       db_column: VALID_END_TIME 
     */	
	
	private Date validEndTime;
    /**
     * direction       db_column: DIRECTION 
     */	

	private String direction;
    /**
     * power       db_column: POWER 
     */	
	
	private String power;
    /**
     * serviceArea       db_column: SERVICE_AREA 
     */	

	private String serviceArea;
    /**
     * serviceName       db_column: SERVICE_NAME 
     */	

	private String serviceName;
    /**
     * runplanStartTime       db_column: RUNPLAN_START_TIME 
     */	

	private String runplanStartTime;
    /**
     * runplanEndTime       db_column: RUNPLAN_END_TIME 
     */	

	private String runplanEndTime;
    /**
     * playTime       db_column: PLAY_TIME 
     */	

	private String playTime;
    /**
     * programTypeId       db_column: PROGRAM_TYPE_ID 
     */	
	
	private Integer programTypeId;
    /**
     * programType       db_column: PROGRAM_TYPE 
     */	

	private String programType;
    /**
     * languageId       db_column: LANGUAGE_ID 
     */	
	
	private Integer languageId;
    /**
     * languageName       db_column: LANGUAGE_NAME 
     */	

	private String languageName;
    /**
     * programId       db_column: PROGRAM_ID 
     */	
	
	private Integer programId;
    /**
     * monArea       db_column: MON_AREA 
     */	

	private String monArea;
    /**
     * redisseminators       db_column: REDISSEMINATORS 
     */	

	private String redisseminators;
    /**
     * seasonId       db_column: SEASON_ID 
     */	

	private String seasonId;
    /**
     * xgMonArea       db_column: XG_MON_AREA 
     */	

	private String xgMonArea;
    /**
     * disRunplanId       db_column: DIS_RUNPLAN_ID 
     */	
	
	private Integer disRunplanId;
    /**
     * disturb       db_column: DISTURB 
     */	

	private String disturb;
    /**
     * stateName       db_column: STATE_NAME 
     */	

	private String stateName;
	//columns END

	public RadioStreamMarkResultTab(){
	}

	public RadioStreamMarkResultTab(
            Integer id
	){
		this.id = id;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }

    public Date getStreamStartDatetime() {
        return streamStartDatetime;
    }

    public void setStreamStartDatetime(Date streamStartDatetime) {
        this.streamStartDatetime = streamStartDatetime;
    }

    public Date getStreamEndDatetime() {
        return streamEndDatetime;
    }

    public void setStreamEndDatetime(Date streamEndDatetime) {
        this.streamEndDatetime = streamEndDatetime;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public String getFmModulation() {
        return fmModulation;
    }

    public void setFmModulation(String fmModulation) {
        this.fmModulation = fmModulation;
    }

    public String getAmModulation() {
        return amModulation;
    }

    public void setAmModulation(String amModulation) {
        this.amModulation = amModulation;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLevelValue() {
        return levelValue;
    }

    public void setLevelValue(String levelValue) {
        this.levelValue = levelValue;
    }

    public Integer getHeadId() {
        return headId;
    }

    public void setHeadId(Integer headId) {
        this.headId = headId;
    }

    public Integer getHeadTypeId() {
        return headTypeId;
    }

    public void setHeadTypeId(Integer headTypeId) {
        this.headTypeId = headTypeId;
    }

    public String getHeadCode() {
        return headCode;
    }

    public void setHeadCode(String headCode) {
        this.headCode = headCode;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public Integer getMarkId() {
        return markId;
    }

    public void setMarkId(Integer markId) {
        this.markId = markId;
    }

    public Integer getCounti() {
        return counti;
    }

    public void setCounti(Integer counti) {
        this.counti = counti;
    }

    public Integer getCounto() {
        return counto;
    }

    public void setCounto(Integer counto) {
        this.counto = counto;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMarkUnit() {
        return markUnit;
    }

    public void setMarkUnit(String markUnit) {
        this.markUnit = markUnit;
    }

    public String getRecordStartTime() {
        return recordStartTime;
    }

    public void setRecordStartTime(String recordStartTime) {
        this.recordStartTime = recordStartTime;
    }

    public String getRecordEndTime() {
        return recordEndTime;
    }

    public void setRecordEndTime(String recordEndTime) {
        this.recordEndTime = recordEndTime;
    }

    public Integer getRunplanId() {
        return runplanId;
    }

    public void setRunplanId(Integer runplanId) {
        this.runplanId = runplanId;
    }

    public Integer getRunplanTypeId() {
        return runplanTypeId;
    }

    public void setRunplanTypeId(Integer runplanTypeId) {
        this.runplanTypeId = runplanTypeId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getTransmiterNo() {
        return transmiterNo;
    }

    public void setTransmiterNo(String transmiterNo) {
        this.transmiterNo = transmiterNo;
    }

    public Date getValidStartTime() {
        return validStartTime;
    }

    public void setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    public Date getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getRunplanStartTime() {
        return runplanStartTime;
    }

    public void setRunplanStartTime(String runplanStartTime) {
        this.runplanStartTime = runplanStartTime;
    }

    public String getRunplanEndTime() {
        return runplanEndTime;
    }

    public void setRunplanEndTime(String runplanEndTime) {
        this.runplanEndTime = runplanEndTime;
    }

    public String getPlayTime() {
        return playTime;
    }

    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }

    public Integer getProgramTypeId() {
        return programTypeId;
    }

    public void setProgramTypeId(Integer programTypeId) {
        this.programTypeId = programTypeId;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    public String getMonArea() {
        return monArea;
    }

    public void setMonArea(String monArea) {
        this.monArea = monArea;
    }

    public String getRedisseminators() {
        return redisseminators;
    }

    public void setRedisseminators(String redisseminators) {
        this.redisseminators = redisseminators;
    }

    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public String getXgMonArea() {
        return xgMonArea;
    }

    public void setXgMonArea(String xgMonArea) {
        this.xgMonArea = xgMonArea;
    }

    public Integer getDisRunplanId() {
        return disRunplanId;
    }

    public void setDisRunplanId(Integer disRunplanId) {
        this.disRunplanId = disRunplanId;
    }

    public String getDisturb() {
        return disturb;
    }

    public void setDisturb(String disturb) {
        this.disturb = disturb;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}

