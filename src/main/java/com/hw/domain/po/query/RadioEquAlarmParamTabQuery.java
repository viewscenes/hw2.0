
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioEquAlarmParamTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** paramId */
	private Long paramId;
	/** 供电异常时间长度 */
	private Long abnormitylength1gd;
	/** 输入电压下限 */
	private Long inputlineleveldownthreshold1gd;
	/** 接收机异常时间长度 */
	private Long abnormitylength2jsh;
	/** 调制度卡异常时间长度 */
	private Long abnormitylength3tzh;
	/** 调幅度卡异常时间长度 */
	private Long abnormitylength4tf;
	/** 语音压缩卡异常时间长度 */
	private Long abnormitylength5yy;
	/** 频偏卡异常时间长度 */
	private Long abnormitylength6pp;
	/** 前段id */
	private Long headId;
	/** 输入电压上限 */
	private Long inputlinelevelupthreshold1gd;
	/** 前端类型 */
	private Long headTypeId;

	public Long getParamId() {
		return this.paramId;
	}
	
	public void setParamId(Long value) {
		this.paramId = value;
	}
	
	public Long getAbnormitylength1gd() {
		return this.abnormitylength1gd;
	}
	
	public void setAbnormitylength1gd(Long value) {
		this.abnormitylength1gd = value;
	}
	
	public Long getInputlineleveldownthreshold1gd() {
		return this.inputlineleveldownthreshold1gd;
	}
	
	public void setInputlineleveldownthreshold1gd(Long value) {
		this.inputlineleveldownthreshold1gd = value;
	}
	
	public Long getAbnormitylength2jsh() {
		return this.abnormitylength2jsh;
	}
	
	public void setAbnormitylength2jsh(Long value) {
		this.abnormitylength2jsh = value;
	}
	
	public Long getAbnormitylength3tzh() {
		return this.abnormitylength3tzh;
	}
	
	public void setAbnormitylength3tzh(Long value) {
		this.abnormitylength3tzh = value;
	}
	
	public Long getAbnormitylength4tf() {
		return this.abnormitylength4tf;
	}
	
	public void setAbnormitylength4tf(Long value) {
		this.abnormitylength4tf = value;
	}
	
	public Long getAbnormitylength5yy() {
		return this.abnormitylength5yy;
	}
	
	public void setAbnormitylength5yy(Long value) {
		this.abnormitylength5yy = value;
	}
	
	public Long getAbnormitylength6pp() {
		return this.abnormitylength6pp;
	}
	
	public void setAbnormitylength6pp(Long value) {
		this.abnormitylength6pp = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getInputlinelevelupthreshold1gd() {
		return this.inputlinelevelupthreshold1gd;
	}
	
	public void setInputlinelevelupthreshold1gd(Long value) {
		this.inputlinelevelupthreshold1gd = value;
	}
	
	public Long getHeadTypeId() {
		return this.headTypeId;
	}
	
	public void setHeadTypeId(Long value) {
		this.headTypeId = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

