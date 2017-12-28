
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


public class RepQualityResultTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RepQualityResultTab";
	public static final String ALIAS_RESULT_ID = "统计结果id";
	public static final String ALIAS_REPORT_DATE = "统计日期";
	public static final String ALIAS_FREQUENCY = "频率";
	public static final String ALIAS_START_TIME = "开始时间";
	public static final String ALIAS_END_TIME = "结束时间";
	public static final String ALIAS_LANGUAGE = "语言";
	public static final String ALIAS_STATION = "发射台";
	public static final String ALIAS_HEAD_NAMES = "収测站点";
	public static final String ALIAS_LEVEL_VALUE = "电平中值";
	public static final String ALIAS_QUALITY_VALUE = "调幅度/调制度";
	public static final String ALIAS_OFFSET_VALUE = "频偏";
	
	//date formats

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 统计结果id       db_column: RESULT_ID 
     */	
	
	private Long resultId;
    /**
     * 统计日期       db_column: REPORT_DATE 
     */	
	
	private Date reportDate;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Long frequency;
    /**
     * 开始时间       db_column: START_TIME 
     */	
	
	private Date startTime;
    /**
     * 结束时间       db_column: END_TIME 
     */	
	
	private Date endTime;
    /**
     * 语言       db_column: LANGUAGE 
     */	
	private String language;
    /**
     * 发射台       db_column: STATION 
     */	
	private String station;
    /**
     * 収测站点       db_column: HEAD_NAMES 
     */	
	private String headNames;
    /**
     * 电平中值       db_column: LEVEL_VALUE 
     */	
	
	private Long levelValue;
    /**
     * 调幅度/调制度       db_column: QUALITY_VALUE 
     */	
	
	private Long qualityValue;
    /**
     * 频偏       db_column: OFFSET_VALUE 
     */	
	
	private Long offsetValue;
	//columns END

	public RepQualityResultTab(){
	}

	public RepQualityResultTab(
		Long resultId
	){
		this.resultId = resultId;
	}

	public void setResultId(Long value) {
		this.resultId = value;
	}
	
	public Long getResultId() {
		return this.resultId;
	}

	
	public void setReportDate(Date value) {
		this.reportDate = value;
	}
	
	public Date getReportDate() {
		return this.reportDate;
	}
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}

	
	public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}

	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	public void setLanguage(String value) {
		this.language = value;
	}
	
	public String getLanguage() {
		return this.language;
	}
	public void setStation(String value) {
		this.station = value;
	}
	
	public String getStation() {
		return this.station;
	}
	public void setHeadNames(String value) {
		this.headNames = value;
	}
	
	public String getHeadNames() {
		return this.headNames;
	}
	public void setLevelValue(Long value) {
		this.levelValue = value;
	}
	
	public Long getLevelValue() {
		return this.levelValue;
	}
	public void setQualityValue(Long value) {
		this.qualityValue = value;
	}
	
	public Long getQualityValue() {
		return this.qualityValue;
	}
	public void setOffsetValue(Long value) {
		this.offsetValue = value;
	}
	
	public Long getOffsetValue() {
		return this.offsetValue;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("ResultId",getResultId())
			.append("ReportDate",getReportDate())
			.append("Frequency",getFrequency())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.append("Language",getLanguage())
			.append("Station",getStation())
			.append("HeadNames",getHeadNames())
			.append("LevelValue",getLevelValue())
			.append("QualityValue",getQualityValue())
			.append("OffsetValue",getOffsetValue())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getResultId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RepQualityResultTab == false) return false;
		if(this == obj) return true;
		RepQualityResultTab other = (RepQualityResultTab)obj;
		return new EqualsBuilder()
			.append(getResultId(),other.getResultId())
			.isEquals();
	}
}

