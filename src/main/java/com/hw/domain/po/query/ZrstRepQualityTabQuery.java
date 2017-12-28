
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


public class ZrstRepQualityTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** dataId */
	private Long dataId;
	/** 报表id */
	private Long reportId;
	/** 频率 */
	private Long frequency;
	/** 播音时间 */
	private String playTime;
	/** 语言 */
	private String language;
	/** 发射台 */
	private String stationName;
	/** 收测站点 */
	private String headName;
	/** 收测时间 */
	private Date dataTimeBegin;
	private Date dataTimeEnd;
	/** 电平 */
	private Long dataLevel;
	/** 调制度或调幅度 */
	private Long dataFmoram;
	/** 频偏 */
	private Long dataOffset;
	/** 备注 */
	private String remark;

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
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	public void setLanguage(String value) {
		this.language = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getHeadName() {
		return this.headName;
	}
	
	public void setHeadName(String value) {
		this.headName = value;
	}
	
	public Date getDataTimeBegin() {
		return this.dataTimeBegin;
	}
	
	public void setDataTimeBegin(Date value) {
		this.dataTimeBegin = value;
	}	
	
	public Date getDataTimeEnd() {
		return this.dataTimeEnd;
	}
	
	public void setDataTimeEnd(Date value) {
		this.dataTimeEnd = value;
	}
	
	public Long getDataLevel() {
		return this.dataLevel;
	}
	
	public void setDataLevel(Long value) {
		this.dataLevel = value;
	}
	
	public Long getDataFmoram() {
		return this.dataFmoram;
	}
	
	public void setDataFmoram(Long value) {
		this.dataFmoram = value;
	}
	
	public Long getDataOffset() {
		return this.dataOffset;
	}
	
	public void setDataOffset(Long value) {
		this.dataOffset = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

