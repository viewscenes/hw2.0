
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZrstRepFreqStatisticsTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZrstRepFreqStatisticsTab";
	public static final String ALIAS_DATA_ID = "dataId";
	public static final String ALIAS_REPORT_ID = "报表ID";
	public static final String ALIAS_RECEIVE_NAME = "遥控站";
	public static final String ALIAS_TRANSMIT_STATION = "发射台";
	public static final String ALIAS_LANGUAGE_NAME = "语言";
	public static final String ALIAS_PLAY_TIME = "各时段 如：01:00-02:00";
	public static final String ALIAS_FREQ_LISTENS = "6到25M可听率集合 如：6_7_9_11_13_15_17_19_21_25";
	public static final String ALIAS_SUB_REPORT_TYPE = "子报表类型 1、语言  2、发射台   3、时段";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * dataId       db_column: DATA_ID 
     */	
	
	private Long dataId;
    /**
     * 报表ID       db_column: REPORT_ID 
     */	
	
	private Long reportId;
    /**
     * 遥控站       db_column: RECEIVE_NAME 
     */	
	private String receiveName;
    /**
     * 发射台       db_column: TRANSMIT_STATION 
     */	
	private String transmitStation;
    /**
     * 语言       db_column: LANGUAGE_NAME 
     */	
	private String languageName;
    /**
     * 各时段 如：01:00-02:00       db_column: PLAY_TIME 
     */	
	private String playTime;
    /**
     * 6到25M可听率集合 如：6_7_9_11_13_15_17_19_21_25       db_column: FREQ_LISTENS 
     */	
	private String freqListens;
    /**
     * 子报表类型 1、语言  2、发射台   3、时段       db_column: SUB_REPORT_TYPE 
     */	
	private String subReportType;
	//columns END

	public ZrstRepFreqStatisticsTab(){
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
	public void setReceiveName(String value) {
		this.receiveName = value;
	}
	
	public String getReceiveName() {
		return this.receiveName;
	}
	public void setTransmitStation(String value) {
		this.transmitStation = value;
	}
	
	public String getTransmitStation() {
		return this.transmitStation;
	}
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	public void setFreqListens(String value) {
		this.freqListens = value;
	}
	
	public String getFreqListens() {
		return this.freqListens;
	}
	public void setSubReportType(String value) {
		this.subReportType = value;
	}
	
	public String getSubReportType() {
		return this.subReportType;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("DataId",getDataId())
			.append("ReportId",getReportId())
			.append("ReceiveName",getReceiveName())
			.append("TransmitStation",getTransmitStation())
			.append("LanguageName",getLanguageName())
			.append("PlayTime",getPlayTime())
			.append("FreqListens",getFreqListens())
			.append("SubReportType",getSubReportType())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZrstRepFreqStatisticsTab == false) return false;
		if(this == obj) return true;
		ZrstRepFreqStatisticsTab other = (ZrstRepFreqStatisticsTab)obj;
		return new EqualsBuilder()
			.isEquals();
	}
}

