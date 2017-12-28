
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZrstRepEffectViewTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** dataId */
	private Long dataId;
	/** 报表id */
	private Long reportId;
	/** 发射台名称 */
	private String stationName;
	/** 方向 */
	private String direction;
	/** 服务区 */
	private String serviceArea;
	/** 功率 */
	private Long power;
	/** 频率 */
	private Long frequency;
	/** 语言 */
	private String languageName;
	/** 统计日期 */
	private String datetime;
	/** 分数 */
	private String description;
	/** 站点名称 */
	private String headname;
	/** 播出日期 */
	private String playTime;
	/** 描述 */
	private String remark;
	/** 统计开始日期 */
	private String startTime;
	/** 统计结束日期 */
	private String endTime;
	/** 统计条目数 */
	private Long count;

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
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public Long getPower() {
		return this.power;
	}
	
	public void setPower(Long value) {
		this.power = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public String getDatetime() {
		return this.datetime;
	}
	
	public void setDatetime(String value) {
		this.datetime = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getHeadname() {
		return this.headname;
	}
	
	public void setHeadname(String value) {
		this.headname = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getStartTime() {
		return this.startTime;
	}
	
	public void setStartTime(String value) {
		this.startTime = value;
	}
	
	public String getEndTime() {
		return this.endTime;
	}
	
	public void setEndTime(String value) {
		this.endTime = value;
	}
	
	public Long getCount() {
		return this.count;
	}
	
	public void setCount(Long value) {
		this.count = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

