
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


public class RadioQualityAlarmParamTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioQualityAlarmParamTab";
	public static final String ALIAS_PARAM_ID = "paramId";
	public static final String ALIAS_EQU_CODE = "接收机代码";
	public static final String ALIAS_BAND = "波段";
	public static final String ALIAS_FREQUENCY = "频率";
	public static final String ALIAS_DOWNTHRESHOLD1LEVEL = "电平下限";
	public static final String ALIAS_HEAD_ID = "前端id";
	public static final String ALIAS_ABNORMITYLENGTH1LEVEL = "电平异态时间长度";
	public static final String ALIAS_SAMPLELENGTH2FM = "调制度报警采样时间长度";
	public static final String ALIAS_DOWNTHRESHOLD2FM = "调制度报警下限";
	public static final String ALIAS_UPTHRESHOLD2FM = "调制度报警上限";
	public static final String ALIAS_DOWNABNORMITYRATE2FM = "统计过调制百分比";
	public static final String ALIAS_UPABNORMITYRATE2FM = "统计不足调制百分比";
	public static final String ALIAS_SAMPLELENGTH3AM = "调幅度报警采用时间长度";
	public static final String ALIAS_ABNORMITYLENGTH2FM = "持续时间长度";
	public static final String ALIAS_DOWNTHRESHOLD3AM = "调幅度报警下限";
	public static final String ALIAS_UPTHRESHOLD3AM = "调幅度报警上限";
	public static final String ALIAS_UPABNORMITYRATE3AM = "调幅度过高百分比";
	public static final String ALIAS_DOWNABNORMITYRATE3AM = "调幅度过低百分比";
	public static final String ALIAS_ABNORMITYLENGTH3AM = "持续时间长度";
	public static final String ALIAS_ATTENUATION4ATTENUATION = "衰减状态设置";
	public static final String ALIAS_HEAD_TYPE_ID = "站点类型";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * paramId       db_column: PARAM_ID 
     */	
	
	private Long paramId;
    /**
     * 接收机代码       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 波段       db_column: BAND 
     */	
	
	private Long band;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Long frequency;
    /**
     * 电平下限       db_column: DOWNTHRESHOLD1LEVEL 
     */	
	
	private Long downthreshold1level;
    /**
     * 前端id       db_column: HEAD_ID 
     */	
	
	private Long headId;
    /**
     * 电平异态时间长度       db_column: ABNORMITYLENGTH1LEVEL 
     */	
	
	private Long abnormitylength1level;
    /**
     * 调制度报警采样时间长度       db_column: SAMPLELENGTH2FM 
     */	
	
	private Long samplelength2fm;
    /**
     * 调制度报警下限       db_column: DOWNTHRESHOLD2FM 
     */	
	
	private Long downthreshold2fm;
    /**
     * 调制度报警上限       db_column: UPTHRESHOLD2FM 
     */	
	
	private Long upthreshold2fm;
    /**
     * 统计过调制百分比       db_column: DOWNABNORMITYRATE2FM 
     */	
	
	private Long downabnormityrate2fm;
    /**
     * 统计不足调制百分比       db_column: UPABNORMITYRATE2FM 
     */	
	
	private Long upabnormityrate2fm;
    /**
     * 调幅度报警采用时间长度       db_column: SAMPLELENGTH3AM 
     */	
	
	private Long samplelength3am;
    /**
     * 持续时间长度       db_column: ABNORMITYLENGTH2FM 
     */	
	
	private Long abnormitylength2fm;
    /**
     * 调幅度报警下限       db_column: DOWNTHRESHOLD3AM 
     */	
	
	private Long downthreshold3am;
    /**
     * 调幅度报警上限       db_column: UPTHRESHOLD3AM 
     */	
	
	private Long upthreshold3am;
    /**
     * 调幅度过高百分比       db_column: UPABNORMITYRATE3AM 
     */	
	
	private Long upabnormityrate3am;
    /**
     * 调幅度过低百分比       db_column: DOWNABNORMITYRATE3AM 
     */	
	
	private Long downabnormityrate3am;
    /**
     * 持续时间长度       db_column: ABNORMITYLENGTH3AM 
     */	
	
	private Long abnormitylength3am;
    /**
     * 衰减状态设置       db_column: ATTENUATION4ATTENUATION 
     */	
	
	private Long attenuation4attenuation;
    /**
     * 站点类型       db_column: HEAD_TYPE_ID 
     */	
	
	private Long headTypeId;
	//columns END

	public RadioQualityAlarmParamTab(){
	}

	public RadioQualityAlarmParamTab(
		Long paramId
	){
		this.paramId = paramId;
	}

	public void setParamId(Long value) {
		this.paramId = value;
	}
	
	public Long getParamId() {
		return this.paramId;
	}
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	public void setBand(Long value) {
		this.band = value;
	}
	
	public Long getBand() {
		return this.band;
	}
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	public void setDownthreshold1level(Long value) {
		this.downthreshold1level = value;
	}
	
	public Long getDownthreshold1level() {
		return this.downthreshold1level;
	}
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	public void setAbnormitylength1level(Long value) {
		this.abnormitylength1level = value;
	}
	
	public Long getAbnormitylength1level() {
		return this.abnormitylength1level;
	}
	public void setSamplelength2fm(Long value) {
		this.samplelength2fm = value;
	}
	
	public Long getSamplelength2fm() {
		return this.samplelength2fm;
	}
	public void setDownthreshold2fm(Long value) {
		this.downthreshold2fm = value;
	}
	
	public Long getDownthreshold2fm() {
		return this.downthreshold2fm;
	}
	public void setUpthreshold2fm(Long value) {
		this.upthreshold2fm = value;
	}
	
	public Long getUpthreshold2fm() {
		return this.upthreshold2fm;
	}
	public void setDownabnormityrate2fm(Long value) {
		this.downabnormityrate2fm = value;
	}
	
	public Long getDownabnormityrate2fm() {
		return this.downabnormityrate2fm;
	}
	public void setUpabnormityrate2fm(Long value) {
		this.upabnormityrate2fm = value;
	}
	
	public Long getUpabnormityrate2fm() {
		return this.upabnormityrate2fm;
	}
	public void setSamplelength3am(Long value) {
		this.samplelength3am = value;
	}
	
	public Long getSamplelength3am() {
		return this.samplelength3am;
	}
	public void setAbnormitylength2fm(Long value) {
		this.abnormitylength2fm = value;
	}
	
	public Long getAbnormitylength2fm() {
		return this.abnormitylength2fm;
	}
	public void setDownthreshold3am(Long value) {
		this.downthreshold3am = value;
	}
	
	public Long getDownthreshold3am() {
		return this.downthreshold3am;
	}
	public void setUpthreshold3am(Long value) {
		this.upthreshold3am = value;
	}
	
	public Long getUpthreshold3am() {
		return this.upthreshold3am;
	}
	public void setUpabnormityrate3am(Long value) {
		this.upabnormityrate3am = value;
	}
	
	public Long getUpabnormityrate3am() {
		return this.upabnormityrate3am;
	}
	public void setDownabnormityrate3am(Long value) {
		this.downabnormityrate3am = value;
	}
	
	public Long getDownabnormityrate3am() {
		return this.downabnormityrate3am;
	}
	public void setAbnormitylength3am(Long value) {
		this.abnormitylength3am = value;
	}
	
	public Long getAbnormitylength3am() {
		return this.abnormitylength3am;
	}
	public void setAttenuation4attenuation(Long value) {
		this.attenuation4attenuation = value;
	}
	
	public Long getAttenuation4attenuation() {
		return this.attenuation4attenuation;
	}
	public void setHeadTypeId(Long value) {
		this.headTypeId = value;
	}
	
	public Long getHeadTypeId() {
		return this.headTypeId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("ParamId",getParamId())
			.append("EquCode",getEquCode())
			.append("Band",getBand())
			.append("Frequency",getFrequency())
			.append("Downthreshold1level",getDownthreshold1level())
			.append("HeadId",getHeadId())
			.append("Abnormitylength1level",getAbnormitylength1level())
			.append("Samplelength2fm",getSamplelength2fm())
			.append("Downthreshold2fm",getDownthreshold2fm())
			.append("Upthreshold2fm",getUpthreshold2fm())
			.append("Downabnormityrate2fm",getDownabnormityrate2fm())
			.append("Upabnormityrate2fm",getUpabnormityrate2fm())
			.append("Samplelength3am",getSamplelength3am())
			.append("Abnormitylength2fm",getAbnormitylength2fm())
			.append("Downthreshold3am",getDownthreshold3am())
			.append("Upthreshold3am",getUpthreshold3am())
			.append("Upabnormityrate3am",getUpabnormityrate3am())
			.append("Downabnormityrate3am",getDownabnormityrate3am())
			.append("Abnormitylength3am",getAbnormitylength3am())
			.append("Attenuation4attenuation",getAttenuation4attenuation())
			.append("HeadTypeId",getHeadTypeId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getParamId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioQualityAlarmParamTab == false) return false;
		if(this == obj) return true;
		RadioQualityAlarmParamTab other = (RadioQualityAlarmParamTab)obj;
		return new EqualsBuilder()
			.append(getParamId(),other.getParamId())
			.isEquals();
	}
}

