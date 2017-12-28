
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZrstRepFreqStatisticsTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** dataId */
	private Long dataId;
	/** 报表ID */
	private Long reportId;
	/** 遥控站 */
	private String receiveName;
	/** 发射台 */
	private String transmitStation;
	/** 语言 */
	private String languageName;
	/** 各时段 如：01:00-02:00 */
	private String playTime;
	/** 6到25M可听率集合 如：6_7_9_11_13_15_17_19_21_25 */
	private String freqListens;
	/** 子报表类型 1、语言  2、发射台   3、时段 */
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
	
	public String getPlayTime() {
		return this.playTime;
	}
	
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public String getFreqListens() {
		return this.freqListens;
	}
	
	public void setFreqListens(String value) {
		this.freqListens = value;
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

