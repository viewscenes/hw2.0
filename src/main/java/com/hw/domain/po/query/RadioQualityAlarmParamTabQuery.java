
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioQualityAlarmParamTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** paramId */
	private Long paramId;
	/** 接收机代码 */
	private String equCode;
	/** 波段 */
	private Long band;
	/** 频率 */
	private Long frequency;
	/** 电平下限 */
	private Long downthreshold1level;
	/** 前端id */
	private Long headId;
	/** 电平异态时间长度 */
	private Long abnormitylength1level;
	/** 调制度报警采样时间长度 */
	private Long samplelength2fm;
	/** 调制度报警下限 */
	private Long downthreshold2fm;
	/** 调制度报警上限 */
	private Long upthreshold2fm;
	/** 统计过调制百分比 */
	private Long downabnormityrate2fm;
	/** 统计不足调制百分比 */
	private Long upabnormityrate2fm;
	/** 调幅度报警采用时间长度 */
	private Long samplelength3am;
	/** 持续时间长度 */
	private Long abnormitylength2fm;
	/** 调幅度报警下限 */
	private Long downthreshold3am;
	/** 调幅度报警上限 */
	private Long upthreshold3am;
	/** 调幅度过高百分比 */
	private Long upabnormityrate3am;
	/** 调幅度过低百分比 */
	private Long downabnormityrate3am;
	/** 持续时间长度 */
	private Long abnormitylength3am;
	/** 衰减状态设置 */
	private Long attenuation4attenuation;
	/** 站点类型 */
	private Long headTypeId;

	public Long getParamId() {
		return this.paramId;
	}
	
	public void setParamId(Long value) {
		this.paramId = value;
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
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getDownthreshold1level() {
		return this.downthreshold1level;
	}
	
	public void setDownthreshold1level(Long value) {
		this.downthreshold1level = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getAbnormitylength1level() {
		return this.abnormitylength1level;
	}
	
	public void setAbnormitylength1level(Long value) {
		this.abnormitylength1level = value;
	}
	
	public Long getSamplelength2fm() {
		return this.samplelength2fm;
	}
	
	public void setSamplelength2fm(Long value) {
		this.samplelength2fm = value;
	}
	
	public Long getDownthreshold2fm() {
		return this.downthreshold2fm;
	}
	
	public void setDownthreshold2fm(Long value) {
		this.downthreshold2fm = value;
	}
	
	public Long getUpthreshold2fm() {
		return this.upthreshold2fm;
	}
	
	public void setUpthreshold2fm(Long value) {
		this.upthreshold2fm = value;
	}
	
	public Long getDownabnormityrate2fm() {
		return this.downabnormityrate2fm;
	}
	
	public void setDownabnormityrate2fm(Long value) {
		this.downabnormityrate2fm = value;
	}
	
	public Long getUpabnormityrate2fm() {
		return this.upabnormityrate2fm;
	}
	
	public void setUpabnormityrate2fm(Long value) {
		this.upabnormityrate2fm = value;
	}
	
	public Long getSamplelength3am() {
		return this.samplelength3am;
	}
	
	public void setSamplelength3am(Long value) {
		this.samplelength3am = value;
	}
	
	public Long getAbnormitylength2fm() {
		return this.abnormitylength2fm;
	}
	
	public void setAbnormitylength2fm(Long value) {
		this.abnormitylength2fm = value;
	}
	
	public Long getDownthreshold3am() {
		return this.downthreshold3am;
	}
	
	public void setDownthreshold3am(Long value) {
		this.downthreshold3am = value;
	}
	
	public Long getUpthreshold3am() {
		return this.upthreshold3am;
	}
	
	public void setUpthreshold3am(Long value) {
		this.upthreshold3am = value;
	}
	
	public Long getUpabnormityrate3am() {
		return this.upabnormityrate3am;
	}
	
	public void setUpabnormityrate3am(Long value) {
		this.upabnormityrate3am = value;
	}
	
	public Long getDownabnormityrate3am() {
		return this.downabnormityrate3am;
	}
	
	public void setDownabnormityrate3am(Long value) {
		this.downabnormityrate3am = value;
	}
	
	public Long getAbnormitylength3am() {
		return this.abnormitylength3am;
	}
	
	public void setAbnormitylength3am(Long value) {
		this.abnormitylength3am = value;
	}
	
	public Long getAttenuation4attenuation() {
		return this.attenuation4attenuation;
	}
	
	public void setAttenuation4attenuation(Long value) {
		this.attenuation4attenuation = value;
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

