
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


public class DicRunplanTypeTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicRunplanTypeTab";
	public static final String ALIAS_RUNPLAN_TYPE_ID = "运行图归属类型id";
	public static final String ALIAS_TYPE = "运行图归属类型详细";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 运行图归属类型id       db_column: RUNPLAN_TYPE_ID 
     */	
	
	private Long runplanTypeId;
    /**
     * 运行图归属类型详细       db_column: TYPE 
     */	
	private String type;
	//columns END

	public DicRunplanTypeTab(){
	}

	public DicRunplanTypeTab(
		Long runplanTypeId
	){
		this.runplanTypeId = runplanTypeId;
	}

	public void setRunplanTypeId(Long value) {
		this.runplanTypeId = value;
	}
	
	public Long getRunplanTypeId() {
		return this.runplanTypeId;
	}
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return this.type;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("RunplanTypeId",getRunplanTypeId())
			.append("Type",getType())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getRunplanTypeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicRunplanTypeTab == false) return false;
		if(this == obj) return true;
		DicRunplanTypeTab other = (DicRunplanTypeTab)obj;
		return new EqualsBuilder()
			.append(getRunplanTypeId(),other.getRunplanTypeId())
			.isEquals();
	}
}

