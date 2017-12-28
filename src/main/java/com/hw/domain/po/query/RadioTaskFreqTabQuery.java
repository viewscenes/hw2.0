
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioTaskFreqTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 频道id */
	private Long freqId;
	/** 频率 */
	private Long frequency;
	/** 子任务id */
	private Long subTaskId;
	/** 衰减 */
	private Long attenuation;
	/** 接收机。 */
	private String equCode;

	public Long getFreqId() {
		return this.freqId;
	}
	
	public void setFreqId(Long value) {
		this.freqId = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getSubTaskId() {
		return this.subTaskId;
	}
	
	public void setSubTaskId(Long value) {
		this.subTaskId = value;
	}
	
	public Long getAttenuation() {
		return this.attenuation;
	}
	
	public void setAttenuation(Long value) {
		this.attenuation = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	
	public void setEquCode(String value) {
		this.equCode = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

