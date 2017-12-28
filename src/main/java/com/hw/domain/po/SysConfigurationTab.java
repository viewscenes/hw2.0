
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


public class SysConfigurationTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "SysConfigurationTab";
	public static final String ALIAS_PARAM_NAME = "参数";
	public static final String ALIAS_PARAM_VALUE = "参数值";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 参数       db_column: PARAM_NAME 
     */	
	private String paramName;
    /**
     * 参数值       db_column: PARAM_VALUE 
     */	
	private String paramValue;
	//columns END

	public SysConfigurationTab(){
	}

	public SysConfigurationTab(
		String paramName
	){
		this.paramName = paramName;
	}

	public void setParamName(String value) {
		this.paramName = value;
	}
	
	public String getParamName() {
		return this.paramName;
	}
	public void setParamValue(String value) {
		this.paramValue = value;
	}
	
	public String getParamValue() {
		return this.paramValue;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("ParamName",getParamName())
			.append("ParamValue",getParamValue())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getParamName())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SysConfigurationTab == false) return false;
		if(this == obj) return true;
		SysConfigurationTab other = (SysConfigurationTab)obj;
		return new EqualsBuilder()
			.append(getParamName(),other.getParamName())
			.isEquals();
	}
}

