
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioSubTaskTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 子任务id */
	private Long subTaskId;
	/** 波段 */
	private Long band;
	/** 起始频率 */
	private Long startfreq;
	/** 终止频率 */
	private Long endfreq;
	/** 步长频率 */
	private Long stepfreq;
	/** 任务id */
	private Long taskId;
	/** 是否来自运行图0：不，1：是 */
	private Long fromRunplan;
	/** 是否删除 */
	private Long isDelete;
	/** 接收机 */
	private String equCode;
	/** 频率 */
	private Long freq;
	/** 录音压缩 */
	private Long bps;
	/** 发射台名称 */
	private String stationName;
	/** 语言 */
	private String language;

	public Long getSubTaskId() {
		return this.subTaskId;
	}
	
	public void setSubTaskId(Long value) {
		this.subTaskId = value;
	}
	
	public Long getBand() {
		return this.band;
	}
	
	public void setBand(Long value) {
		this.band = value;
	}
	
	public Long getStartfreq() {
		return this.startfreq;
	}
	
	public void setStartfreq(Long value) {
		this.startfreq = value;
	}
	
	public Long getEndfreq() {
		return this.endfreq;
	}
	
	public void setEndfreq(Long value) {
		this.endfreq = value;
	}
	
	public Long getStepfreq() {
		return this.stepfreq;
	}
	
	public void setStepfreq(Long value) {
		this.stepfreq = value;
	}
	
	public Long getTaskId() {
		return this.taskId;
	}
	
	public void setTaskId(Long value) {
		this.taskId = value;
	}
	
	public Long getFromRunplan() {
		return this.fromRunplan;
	}
	
	public void setFromRunplan(Long value) {
		this.fromRunplan = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public Long getFreq() {
		return this.freq;
	}
	
	public void setFreq(Long value) {
		this.freq = value;
	}
	
	public Long getBps() {
		return this.bps;
	}
	
	public void setBps(Long value) {
		this.bps = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	public void setLanguage(String value) {
		this.language = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

