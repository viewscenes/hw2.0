
package com.hw.domain.po.query;



import java.io.Serializable;
import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioStreamResultTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
	/** resultId */
	private Long resultId;
	/** 波段 */
	private String band;
	/** 任务id */
	private Integer taskId;
	/** 录音开始时间 */
	private Date startDatetimeBegin;
	private Date startDatetimeEnd;
	/** 录音结束时间 */
	private Date endDatetimeBegin;
	private Date endDatetimeEnd;
	/** 频率 */
	private Integer frequency;
	/** 文件名称 */
	private String filename;
	/** 文件长度 */
	private Integer filesize;
	/** 设备id */
	private Integer headId;
	/** 录音文件地址 */
	private String url;
	/** 录音类型：0：效果录音，1质量录音，2实时录音，3：临时录音 */
	private Integer reportType;
	/** 是否回收回来 */
	private Integer isStored;
	/** 是否删除 */
	private Integer isDelete;
	/** 存储时间 */
	private Date storeDatetimeBegin;
	private Date storeDatetimeEnd;
	/** 打分文件名 */
	private String markFileName;
	/** 运行图id */
	private Long runplanId;
	/** 设备接收机code */
	private String equCode;
	/** 调幅度值 */
	private String fmModulation;
	/** 调制度值 */
	private String amModulation;
	/** 频偏值 */
	private String offset;
	/** 电平值 */
	private String levelValue;
	/** 接收机类型 */
	private String receiveType;
	/** language */
	private String language;
	/** stationName */
	private String stationName;


	public Long getResultId() {
		return this.resultId;
	}
	
	public void setResultId(Long value) {
		this.resultId = value;
	}
	
	public String getBand() {
		return this.band;
	}
	
	public void setBand(String value) {
		this.band = value;
	}

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Date getStartDatetimeBegin() {
        return startDatetimeBegin;
    }

    public void setStartDatetimeBegin(Date startDatetimeBegin) {
        this.startDatetimeBegin = startDatetimeBegin;
    }

    public Date getStartDatetimeEnd() {
        return startDatetimeEnd;
    }

    public void setStartDatetimeEnd(Date startDatetimeEnd) {
        this.startDatetimeEnd = startDatetimeEnd;
    }

    public Date getEndDatetimeBegin() {
        return endDatetimeBegin;
    }

    public void setEndDatetimeBegin(Date endDatetimeBegin) {
        this.endDatetimeBegin = endDatetimeBegin;
    }

    public Date getEndDatetimeEnd() {
        return endDatetimeEnd;
    }

    public void setEndDatetimeEnd(Date endDatetimeEnd) {
        this.endDatetimeEnd = endDatetimeEnd;
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

    public Date getStoreDatetimeBegin() {
        return storeDatetimeBegin;
    }

    public void setStoreDatetimeBegin(Date storeDatetimeBegin) {
        this.storeDatetimeBegin = storeDatetimeBegin;
    }

    public Date getStoreDatetimeEnd() {
        return storeDatetimeEnd;
    }

    public void setStoreDatetimeEnd(Date storeDatetimeEnd) {
        this.storeDatetimeEnd = storeDatetimeEnd;
    }

    public String getMarkFileName() {
        return markFileName;
    }

    public void setMarkFileName(String markFileName) {
        this.markFileName = markFileName;
    }

    public Long getRunplanId() {
        return runplanId;
    }

    public void setRunplanId(Long runplanId) {
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


}

