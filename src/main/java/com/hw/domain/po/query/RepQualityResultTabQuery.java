
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


public class RepQualityResultTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 统计结果id */
	private Long resultId;
	/** 统计日期 */
	private Date reportDateBegin;
	private Date reportDateEnd;
	/** 频率 */
	private Long frequency;
	/** 开始时间 */
	private Date startTimeBegin;
	private Date startTimeEnd;
	/** 结束时间 */
	private Date endTimeBegin;
	private Date endTimeEnd;
	/** 语言 */
	private String language;
	/** 发射台 */
	private String station;
	/** 収测站点 */
	private String headNames;
	/** 电平中值 */
	private Long levelValue;
	/** 调幅度/调制度 */
	private Long qualityValue;
	/** 频偏 */
	private Long offsetValue;

	public Long getResultId() {
		return this.resultId;
	}
	
	public void setResultId(Long value) {
		this.resultId = value;
	}
	
	public Date getReportDateBegin() {
		return this.reportDateBegin;
	}
	
	public void setReportDateBegin(Date value) {
		this.reportDateBegin = value;
	}	
	
	public Date getReportDateEnd() {
		return this.reportDateEnd;
	}
	
	public void setReportDateEnd(Date value) {
		this.reportDateEnd = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Date getStartTimeBegin() {
		return this.startTimeBegin;
	}
	
	public void setStartTimeBegin(Date value) {
		this.startTimeBegin = value;
	}	
	
	public Date getStartTimeEnd() {
		return this.startTimeEnd;
	}
	
	public void setStartTimeEnd(Date value) {
		this.startTimeEnd = value;
	}
	
	public Date getEndTimeBegin() {
		return this.endTimeBegin;
	}
	
	public void setEndTimeBegin(Date value) {
		this.endTimeBegin = value;
	}	
	
	public Date getEndTimeEnd() {
		return this.endTimeEnd;
	}
	
	public void setEndTimeEnd(Date value) {
		this.endTimeEnd = value;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	public void setLanguage(String value) {
		this.language = value;
	}
	
	public String getStation() {
		return this.station;
	}
	
	public void setStation(String value) {
		this.station = value;
	}
	
	public String getHeadNames() {
		return this.headNames;
	}
	
	public void setHeadNames(String value) {
		this.headNames = value;
	}
	
	public Long getLevelValue() {
		return this.levelValue;
	}
	
	public void setLevelValue(Long value) {
		this.levelValue = value;
	}
	
	public Long getQualityValue() {
		return this.qualityValue;
	}
	
	public void setQualityValue(Long value) {
		this.qualityValue = value;
	}
	
	public Long getOffsetValue() {
		return this.offsetValue;
	}
	
	public void setOffsetValue(Long value) {
		this.offsetValue = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

