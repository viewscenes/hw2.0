
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZrstRepTimeStatisticsTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** REPORT_ID */
	private Long dataId;
	/** 报表ID */
	private Long reportId;
	/** 遥控站名 */
	private String receiveName;
	/** 发射台 */
	private String transmitStation;
	/** 语言 */
	private String languageName;
	/** 频率类型 如：6M */
	private String freqType;
	/** 24小时时间段的可听率集合 如：1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24 */
	private String timeListens;
	/** 子报表类型 1、语言  2、发射台   3、频段 */
	private String subReportType;

	public Long getDataId() {
		return this.dataId;
	}
	
	public void setDataId(Long value) {
		this.dataId = value;
	}
	
	public Long getReportId() {
		return this.reportId;
	}
	
	public void setReportId(Long value) {
		this.reportId = value;
	}
	
	public String getReceiveName() {
		return this.receiveName;
	}
	
	public void setReceiveName(String value) {
		this.receiveName = value;
	}
	
	public String getTransmitStation() {
		return this.transmitStation;
	}
	
	public void setTransmitStation(String value) {
		this.transmitStation = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public String getFreqType() {
		return this.freqType;
	}
	
	public void setFreqType(String value) {
		this.freqType = value;
	}
	
	public String getTimeListens() {
		return this.timeListens;
	}
	
	public void setTimeListens(String value) {
		this.timeListens = value;
	}
	
	public String getSubReportType() {
		return this.subReportType;
	}
	
	public void setSubReportType(String value) {
		this.subReportType = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

