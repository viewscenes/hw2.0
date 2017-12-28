
package com.hw.domain.po;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioStreamResultTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * resultId       db_column: RESULT_ID 
     */	
	
	private Integer resultId;
    /**
     * 波段       db_column: BAND 
     */	
	private String band;
    /**
     * 任务id       db_column: TASK_ID 
     */	
	
	private Integer taskId;
    /**
     * 录音开始时间       db_column: START_DATETIME 
     */	
	
	private Date startDatetime;
    /**
     * 录音结束时间       db_column: END_DATETIME 
     */	
	
	private Date endDatetime;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Integer frequency;
    /**
     * 文件名称       db_column: FILENAME 
     */	
	private String filename;
    /**
     * 文件长度       db_column: FILESIZE 
     */	
	
	private Integer filesize;
    /**
     * 设备id       db_column: HEAD_ID 
     */	
	
	private Integer headId;
    /**
     * 录音文件地址       db_column: URL 
     */	
	private String url;
    /**
     * 录音类型：0：效果录音，1质量录音，2实时录音，3：临时录音       db_column: REPORT_TYPE 
     */	
	
	private Integer reportType;
    /**
     * 是否回收回来       db_column: IS_STORED 
     */	
	
	private Integer isStored;
    /**
     * 是否删除       db_column: IS_DELETE 
     */	
	
	private Integer isDelete;
    /**
     * 存储时间       db_column: STORE_DATETIME 
     */	
	
	private Date storeDatetime;
    /**
     * 打分文件名       db_column: MARK_FILE_NAME 
     */	
	private String markFileName;
    /**
     * 运行图id       db_column: RUNPLAN_ID 
     */	
	
	private Integer runplanId;
    /**
     * 设备接收机code       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 调幅度值       db_column: FM_MODULATION 
     */	
	private String fmModulation;
    /**
     * 调制度值       db_column: AM_MODULATION 
     */	
	private String amModulation;
    /**
     * 频偏值       db_column: OFFSET 
     */	
	private String offset;
    /**
     * 电平值       db_column: LEVEL_VALUE 
     */	
	private String levelValue;
    /**
     * 接收机类型       db_column: RECEIVE_TYPE 
     */	
	private String receiveType;
    /**
     * language       db_column: LANGUAGE 
     */	
	private String language;
    /**
     * stationName       db_column: STATION_NAME 
     */	
	private String stationName;



     //打分表字段信息
    /**
     * I       db_column: COUNTI
     */

    private Integer counti;
    /**
     * o       db_column: COUNTO
     */

    private Integer counto;
    /**
     * s       db_column: COUNTS
     */

    private Integer counts;
    /**
     * 干扰类型       db_column: DESCRIPTION
     */
    private String description;
	//columns END

	public RadioStreamResultTab(){
	}

	public RadioStreamResultTab(
            Integer resultId,
		String url
	){
		this.resultId = resultId;
		this.url = url;
	}

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Date getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(Date startDatetime) {
        this.startDatetime = startDatetime;
    }

    public Date getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(Date endDatetime) {
        this.endDatetime = endDatetime;
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

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public Integer getHeadId() {
        return headId;
    }

    public void setHeadId(Integer headId) {
        this.headId = headId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public Integer getIsStored() {
        return isStored;
    }

    public void setIsStored(Integer isStored) {
        this.isStored = isStored;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getStoreDatetime() {
        return storeDatetime;
    }

    public void setStoreDatetime(Date storeDatetime) {
        this.storeDatetime = storeDatetime;
    }

    public String getMarkFileName() {
        return markFileName;
    }

    public void setMarkFileName(String markFileName) {
        this.markFileName = markFileName;
    }

    public Integer getRunplanId() {
        return runplanId;
    }

    public void setRunplanId(Integer runplanId) {
        this.runplanId = runplanId;
    }

    public String getEquCode() {
        return equCode;
    }

    public void setEquCode(String equCode) {
        this.equCode = equCode;
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

    public String getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(String receiveType) {
        this.receiveType = receiveType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
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
}

