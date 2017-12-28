
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


public class ZrstRepQualityTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZrstRepQualityTab";
	public static final String ALIAS_DATA_ID = "dataId";
	public static final String ALIAS_REPORT_ID = "报表id";
	public static final String ALIAS_FREQUENCY = "频率";
	public static final String ALIAS_PLAY_TIME = "播音时间";
	public static final String ALIAS_LANGUAGE = "语言";
	public static final String ALIAS_STATION_NAME = "发射台";
	public static final String ALIAS_HEAD_NAME = "收测站点";
	public static final String ALIAS_DATA_TIME = "收测时间";
	public static final String ALIAS_DATA_LEVEL = "电平";
	public static final String ALIAS_DATA_FMORAM = "调制度或调幅度";
	public static final String ALIAS_DATA_OFFSET = "频偏";
	public static final String ALIAS_REMARK = "备注";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * dataId       db_column: DATA_ID 
     */	
	
	private Long dataId;
    /**
     * 报表id       db_column: REPORT_ID 
     */	
	
	private Long reportId;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Long frequency;
    /**
     * 播音时间       db_column: PLAY_TIME 
     */	
	private String playTime;
    /**
     * 语言       db_column: LANGUAGE 
     */	
	private String language;
    /**
     * 发射台       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * 收测站点       db_column: HEAD_NAME 
     */	
	private String headName;
    /**
     * 收测时间       db_column: DATA_TIME 
     */	
	
	private Date dataTime;
    /**
     * 电平       db_column: DATA_LEVEL 
     */	
	
	private Long dataLevel;
    /**
     * 调制度或调幅度       db_column: DATA_FMORAM 
     */	
	
	private Long dataFmoram;
    /**
     * 频偏       db_column: DATA_OFFSET 
     */	
	
	private Long dataOffset;
    /**
     * 备注       db_column: REMARK 
     */	
	private String remark;
	//columns END

	public ZrstRepQualityTab(){
	}

	public ZrstRepQualityTab(
		Long dataId
	){
		this.dataId = dataId;
	}

	public void setDataId(Long value) {
		this.dataId = value;
	}
	
	public Long getDataId() {
		return this.dataId;
	}
	public void setReportId(Long value) {
		this.reportId = value;
	}
	
	public Long getReportId() {
		return this.reportId;
	}
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	public void setLanguage(String value) {
		this.language = value;
	}
	
	public String getLanguage() {
		return this.language;
	}
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	public void setHeadName(String value) {
		this.headName = value;
	}
	
	public String getHeadName() {
		return this.headName;
	}

	
	public void setDataTime(Date value) {
		this.dataTime = value;
	}
	
	public Date getDataTime() {
		return this.dataTime;
	}
	public void setDataLevel(Long value) {
		this.dataLevel = value;
	}
	
	public Long getDataLevel() {
		return this.dataLevel;
	}
	public void setDataFmoram(Long value) {
		this.dataFmoram = value;
	}
	
	public Long getDataFmoram() {
		return this.dataFmoram;
	}
	public void setDataOffset(Long value) {
		this.dataOffset = value;
	}
	
	public Long getDataOffset() {
		return this.dataOffset;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("DataId",getDataId())
			.append("ReportId",getReportId())
			.append("Frequency",getFrequency())
			.append("PlayTime",getPlayTime())
			.append("Language",getLanguage())
			.append("StationName",getStationName())
			.append("HeadName",getHeadName())
			.append("DataTime",getDataTime())
			.append("DataLevel",getDataLevel())
			.append("DataFmoram",getDataFmoram())
			.append("DataOffset",getDataOffset())
			.append("Remark",getRemark())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getDataId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZrstRepQualityTab == false) return false;
		if(this == obj) return true;
		ZrstRepQualityTab other = (ZrstRepQualityTab)obj;
		return new EqualsBuilder()
			.append(getDataId(),other.getDataId())
			.isEquals();
	}
}

