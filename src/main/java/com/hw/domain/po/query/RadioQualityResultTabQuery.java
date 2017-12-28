
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


public class RadioQualityResultTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** resultId */
	private Long resultId;
	/** 接收机 */
	private String equCode;
	/** 任务Id */
	private Long taskId;
	/** 频率 */
	private Long frequency;
	/** 测量时间 */
	private Date checkDatetimeBegin;
	private Date checkDatetimeEnd;
	/** 类型：1:载波电平 3:调幅度 5:调制度最大值 8:带宽 */
	private String type;
	/** 值 */
	private Long value1;
	/** 值 */
	private Long value2;
	/** 上报类型：1主动上报，0：手动获取 */
	private Long reportType;
	/** 前段id */
	private Long headId;
	/** 是否删除 */
	private Long isDelete;
	/** 存储时间 */
	private Date storeDatetimeBegin;
	private Date storeDatetimeEnd;
	/** 描述 */
	private String description;
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
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
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
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String value) {
		this.type = value;
	}
	
	public Long getValue1() {
		return this.value1;
	}
	
	public void setValue1(Long value) {
		this.value1 = value;
	}
	
	public Long getValue2() {
		return this.value2;
	}
	
	public void setValue2(Long value) {
		this.value2 = value;
	}
	
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
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
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

