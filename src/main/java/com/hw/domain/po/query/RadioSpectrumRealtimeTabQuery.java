
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


public class RadioSpectrumRealtimeTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** realtimeId */
	private Long realtimeId;
	/** 接收机 */
	private String equCode;
	/** 波段 */
	private Long band;
	/** 数据测量时间 */
	private Date checkDatetimeBegin;
	private Date checkDatetimeEnd;
	/** 频率 */
	private Long frequency;
	/** 测量值 */
	private String elevel;
	/** 前端ID */
	private Long headId;

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
	
	public Long getBand() {
		return this.band;
	}
	
	public void setBand(Long value) {
		this.band = value;
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
	
	public String getElevel() {
		return this.elevel;
	}
	
	public void setElevel(String value) {
		this.elevel = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

