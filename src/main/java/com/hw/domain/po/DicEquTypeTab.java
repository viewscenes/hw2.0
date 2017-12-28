
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


public class DicEquTypeTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicEquTypeTab";
	public static final String ALIAS_EQU_TYPE_ID = "设备类型id";
	public static final String ALIAS_CODE = "设备code";
	public static final String ALIAS_NAME = "设备名称";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 设备类型id       db_column: EQU_TYPE_ID 
     */	
	
	private Long equTypeId;
    /**
     * 设备code       db_column: CODE 
     */	
	private String code;
    /**
     * 设备名称       db_column: NAME 
     */	
	private String name;
	//columns END

	public DicEquTypeTab(){
	}

	public DicEquTypeTab(
		Long equTypeId
	){
		this.equTypeId = equTypeId;
	}

	public void setEquTypeId(Long value) {
		this.equTypeId = value;
	}
	
	public Long getEquTypeId() {
		return this.equTypeId;
	}
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return this.code;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("EquTypeId",getEquTypeId())
			.append("Code",getCode())
			.append("Name",getName())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getEquTypeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicEquTypeTab == false) return false;
		if(this == obj) return true;
		DicEquTypeTab other = (DicEquTypeTab)obj;
		return new EqualsBuilder()
			.append(getEquTypeId(),other.getEquTypeId())
			.isEquals();
	}
}

