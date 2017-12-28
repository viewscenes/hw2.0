
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


public class RadioQualityRealtimeTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** realtimeId */
	private Long realtimeId;
	/** 接收机 */
	private String equCode;
	/** 频率 */
	private Long frequency;
	/** 数据测量时间 */
	private Date checkDatetimeBegin;
	private Date checkDatetimeEnd;
	/** 测量值 */
	private String value1;
	/** 测量值 */
	private String value2;
	/** 指标类型 1载波电平；2瞬时调制度；3调幅度；5调制度；6频偏指标；8带宽指标；100频谱测量 */
	private Long typeId;
	/** 前端ID */
	private Long headId;
	/** 波段 */
	private Integer band;
	/** 描述 */
	private String description;

	public Long getRealtimeId() {
		return this.realtimeId;
	}
	
	public void setRealtimeId(Long value) {
		this.realtimeId = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	
	public void setEquCode(String value) {
		this.equCode = value;
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
	
	public String getValue1() {
		return this.value1;
	}
	
	public void setValue1(String value) {
		this.value1 = value;
	}
	
	public String getValue2() {
		return this.value2;
	}
	
	public void setValue2(String value) {
		this.value2 = value;
	}
	
	public Long getTypeId() {
		return this.typeId;
	}
	
	public void setTypeId(Long value) {
		this.typeId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Integer getBand() {
		return this.band;
	}
	
	public void setBand(Integer value) {
		this.band = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

