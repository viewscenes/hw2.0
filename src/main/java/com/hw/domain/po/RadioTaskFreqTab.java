
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioTaskFreqTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioTaskFreqTab";
	public static final String ALIAS_FREQ_ID = "频道id";
	public static final String ALIAS_FREQUENCY = "频率";
	public static final String ALIAS_SUB_TASK_ID = "子任务id";
	public static final String ALIAS_ATTENUATION = "衰减";
	public static final String ALIAS_EQU_CODE = "接收机。";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 频道id       db_column: FREQ_ID 
     */	
	
	private Long freqId;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Long frequency;
    /**
     * 子任务id       db_column: SUB_TASK_ID 
     */	
	
	private Long subTaskId;
    /**
     * 衰减       db_column: ATTENUATION 
     */	
	
	private Long attenuation;
    /**
     * 接收机。       db_column: EQU_CODE 
     */	
	private String equCode;
	//columns END

	public RadioTaskFreqTab(){
	}

	public RadioTaskFreqTab(
		Long freqId
	){
		this.freqId = freqId;
	}

	public void setFreqId(Long value) {
		this.freqId = value;
	}
	
	public Long getFreqId() {
		return this.freqId;
	}
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	public void setSubTaskId(Long value) {
		this.subTaskId = value;
	}
	
	public Long getSubTaskId() {
		return this.subTaskId;
	}
	public void setAttenuation(Long value) {
		this.attenuation = value;
	}
	
	public Long getAttenuation() {
		return this.attenuation;
	}
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("FreqId",getFreqId())
			.append("Frequency",getFrequency())
			.append("SubTaskId",getSubTaskId())
			.append("Attenuation",getAttenuation())
			.append("EquCode",getEquCode())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getFreqId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioTaskFreqTab == false) return false;
		if(this == obj) return true;
		RadioTaskFreqTab other = (RadioTaskFreqTab)obj;
		return new EqualsBuilder()
			.append(getFreqId(),other.getFreqId())
			.isEquals();
	}
}

