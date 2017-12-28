
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


public class ZrstRepTimeStatisticsTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZrstRepTimeStatisticsTab";
	public static final String ALIAS_DATA_ID = "REPORT_ID";
	public static final String ALIAS_REPORT_ID = "报表ID";
	public static final String ALIAS_RECEIVE_NAME = "遥控站名";
	public static final String ALIAS_TRANSMIT_STATION = "发射台";
	public static final String ALIAS_LANGUAGE_NAME = "语言";
	public static final String ALIAS_FREQ_TYPE = "频率类型 如：6M";
	public static final String ALIAS_TIME_LISTENS = "24小时时间段的可听率集合 如：1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24";
	public static final String ALIAS_SUB_REPORT_TYPE = "子报表类型 1、语言  2、发射台   3、频段";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * REPORT_ID       db_column: DATA_ID 
     */	
	
	private Long dataId;
    /**
     * 报表ID       db_column: REPORT_ID 
     */	
	
	private Long reportId;
    /**
     * 遥控站名       db_column: RECEIVE_NAME 
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
     * 频率类型 如：6M       db_column: FREQ_TYPE 
     */	
	private String freqType;
    /**
     * 24小时时间段的可听率集合 如：1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24       db_column: TIME_LISTENS 
     */	
	private String timeListens;
    /**
     * 子报表类型 1、语言  2、发射台   3、频段       db_column: SUB_REPORT_TYPE 
     */	
	private String subReportType;
	//columns END

	public ZrstRepTimeStatisticsTab(){
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
	public void setFreqType(String value) {
		this.freqType = value;
	}
	
	public String getFreqType() {
		return this.freqType;
	}
	public void setTimeListens(String value) {
		this.timeListens = value;
	}
	
	public String getTimeListens() {
		return this.timeListens;
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
			.append("FreqType",getFreqType())
			.append("TimeListens",getTimeListens())
			.append("SubReportType",getSubReportType())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZrstRepTimeStatisticsTab == false) return false;
		if(this == obj) return true;
		ZrstRepTimeStatisticsTab other = (ZrstRepTimeStatisticsTab)obj;
		return new EqualsBuilder()
			.isEquals();
	}
}

