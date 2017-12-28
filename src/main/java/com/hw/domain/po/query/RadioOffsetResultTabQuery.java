
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


public class RadioOffsetResultTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** resultId */
	private Long resultId;
	/** 接收机 */
	private String equCode;
	/** 任务id */
	private Long taskId;
	/** 收测时间 */
	private Date checkDatetimeBegin;
	private Date checkDatetimeEnd;
	/** 频率 */
	private Long frequency;
	/** 频偏值 */
	//private Long offset;
	/** 上报类型：1主动上报，0手动回收 */
	private Long reportType;
	/** 前段id */
	private Long headId;
	/** 是否删除 */
	private Long isDelete;
	/** 存储时间 */
	private Date storeDatetimeBegin;
	private Date storeDatetimeEnd;
	/** 波段 */
	private Integer band;

	public Long getResultId() {
		return this.resultId;
	}
	
	public void setResultId(Long value) {
		this.resultId = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public Long getTaskId() {
		return this.taskId;
	}
	
	public void setTaskId(Long value) {
		this.taskId = value;
	}
	
	public Date getCheckDatetimeBegin() {
		return this.checkDatetimeBegin;
	}
	
	public void setCheckDatetimeBegin(Date value) {
		this.checkDatetimeBegin = value;
	}	
	
	public Date getCheckDatetimeEnd() {
		return this.checkDatetimeEnd;
	}
	
	public void setCheckDatetimeEnd(Date value) {
		this.checkDatetimeEnd = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
//	public Long getOffset() {
//		return this.offset;
//	}
//
//	public void setOffset(Long value) {
//		this.offset = value;
//	}
//
	public Long getReportType() {
		return this.reportType;
	}
	
	public void setReportType(Long value) {
		this.reportType = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Date getStoreDatetimeBegin() {
		return this.storeDatetimeBegin;
	}
	
	public void setStoreDatetimeBegin(Date value) {
		this.storeDatetimeBegin = value;
	}	
	
	public Date getStoreDatetimeEnd() {
		return this.storeDatetimeEnd;
	}
	
	public void setStoreDatetimeEnd(Date value) {
		this.storeDatetimeEnd = value;
	}
	
	public Integer getBand() {
		return this.band;
	}
	
	public void setBand(Integer value) {
		this.band = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

