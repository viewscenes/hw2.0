
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


public class RadioEquAlarmParamTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioEquAlarmParamTab";
	public static final String ALIAS_PARAM_ID = "paramId";
	public static final String ALIAS_ABNORMITYLENGTH1GD = "供电异常时间长度";
	public static final String ALIAS_INPUTLINELEVELDOWNTHRESHOLD1GD = "输入电压下限";
	public static final String ALIAS_ABNORMITYLENGTH2JSH = "接收机异常时间长度";
	public static final String ALIAS_ABNORMITYLENGTH3TZH = "调制度卡异常时间长度";
	public static final String ALIAS_ABNORMITYLENGTH4TF = "调幅度卡异常时间长度";
	public static final String ALIAS_ABNORMITYLENGTH5YY = "语音压缩卡异常时间长度";
	public static final String ALIAS_ABNORMITYLENGTH6PP = "频偏卡异常时间长度";
	public static final String ALIAS_HEAD_ID = "前段id";
	public static final String ALIAS_INPUTLINELEVELUPTHRESHOLD1GD = "输入电压上限";
	public static final String ALIAS_HEAD_TYPE_ID = "前端类型";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * paramId       db_column: PARAM_ID 
     */	
	
	private Long paramId;
    /**
     * 供电异常时间长度       db_column: ABNORMITYLENGTH1GD 
     */	
	
	private Long abnormitylength1gd;
    /**
     * 输入电压下限       db_column: INPUTLINELEVELDOWNTHRESHOLD1GD 
     */	
	
	private Long inputlineleveldownthreshold1gd;
    /**
     * 接收机异常时间长度       db_column: ABNORMITYLENGTH2JSH 
     */	
	
	private Long abnormitylength2jsh;
    /**
     * 调制度卡异常时间长度       db_column: ABNORMITYLENGTH3TZH 
     */	
	
	private Long abnormitylength3tzh;
    /**
     * 调幅度卡异常时间长度       db_column: ABNORMITYLENGTH4TF 
     */	
	
	private Long abnormitylength4tf;
    /**
     * 语音压缩卡异常时间长度       db_column: ABNORMITYLENGTH5YY 
     */	
	
	private Long abnormitylength5yy;
    /**
     * 频偏卡异常时间长度       db_column: ABNORMITYLENGTH6PP 
     */	
	
	private Long abnormitylength6pp;
    /**
     * 前段id       db_column: HEAD_ID 
     */	
	
	private Long headId;
    /**
     * 输入电压上限       db_column: INPUTLINELEVELUPTHRESHOLD1GD 
     */	
	
	private Long inputlinelevelupthreshold1gd;
    /**
     * 前端类型       db_column: HEAD_TYPE_ID 
     */	
	
	private Long headTypeId;
	//columns END

	public RadioEquAlarmParamTab(){
	}

	public RadioEquAlarmParamTab(
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
	public void setAbnormitylength1gd(Long value) {
		this.abnormitylength1gd = value;
	}
	
	public Long getAbnormitylength1gd() {
		return this.abnormitylength1gd;
	}
	public void setInputlineleveldownthreshold1gd(Long value) {
		this.inputlineleveldownthreshold1gd = value;
	}
	
	public Long getInputlineleveldownthreshold1gd() {
		return this.inputlineleveldownthreshold1gd;
	}
	public void setAbnormitylength2jsh(Long value) {
		this.abnormitylength2jsh = value;
	}
	
	public Long getAbnormitylength2jsh() {
		return this.abnormitylength2jsh;
	}
	public void setAbnormitylength3tzh(Long value) {
		this.abnormitylength3tzh = value;
	}
	
	public Long getAbnormitylength3tzh() {
		return this.abnormitylength3tzh;
	}
	public void setAbnormitylength4tf(Long value) {
		this.abnormitylength4tf = value;
	}
	
	public Long getAbnormitylength4tf() {
		return this.abnormitylength4tf;
	}
	public void setAbnormitylength5yy(Long value) {
		this.abnormitylength5yy = value;
	}
	
	public Long getAbnormitylength5yy() {
		return this.abnormitylength5yy;
	}
	public void setAbnormitylength6pp(Long value) {
		this.abnormitylength6pp = value;
	}
	
	public Long getAbnormitylength6pp() {
		return this.abnormitylength6pp;
	}
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	public void setInputlinelevelupthreshold1gd(Long value) {
		this.inputlinelevelupthreshold1gd = value;
	}
	
	public Long getInputlinelevelupthreshold1gd() {
		return this.inputlinelevelupthreshold1gd;
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
			.append("Abnormitylength1gd",getAbnormitylength1gd())
			.append("Inputlineleveldownthreshold1gd",getInputlineleveldownthreshold1gd())
			.append("Abnormitylength2jsh",getAbnormitylength2jsh())
			.append("Abnormitylength3tzh",getAbnormitylength3tzh())
			.append("Abnormitylength4tf",getAbnormitylength4tf())
			.append("Abnormitylength5yy",getAbnormitylength5yy())
			.append("Abnormitylength6pp",getAbnormitylength6pp())
			.append("HeadId",getHeadId())
			.append("Inputlinelevelupthreshold1gd",getInputlinelevelupthreshold1gd())
			.append("HeadTypeId",getHeadTypeId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getParamId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioEquAlarmParamTab == false) return false;
		if(this == obj) return true;
		RadioEquAlarmParamTab other = (RadioEquAlarmParamTab)obj;
		return new EqualsBuilder()
			.append(getParamId(),other.getParamId())
			.isEquals();
	}
}

