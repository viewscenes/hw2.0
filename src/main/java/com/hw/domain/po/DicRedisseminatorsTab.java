
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


public class DicRedisseminatorsTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicRedisseminatorsTab";
	public static final String ALIAS_REDISSEMINATORS = "转播机构";
	public static final String ALIAS_COUNTRY = "所属国家";
	public static final String ALIAS_ID = "id";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 转播机构       db_column: REDISSEMINATORS 
     */	
	private String redisseminators;
    /**
     * 所属国家       db_column: COUNTRY 
     */	
	private String country;
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
	//columns END

	public DicRedisseminatorsTab(){
	}

	public DicRedisseminatorsTab(
		Long id
	){
		this.id = id;
	}

	public void setRedisseminators(String value) {
		this.redisseminators = value;
	}
	
	public String getRedisseminators() {
		return this.redisseminators;
	}
	public void setCountry(String value) {
		this.country = value;
	}
	
	public String getCountry() {
		return this.country;
	}
	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Redisseminators",getRedisseminators())
			.append("Country",getCountry())
			.append("Id",getId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicRedisseminatorsTab == false) return false;
		if(this == obj) return true;
		DicRedisseminatorsTab other = (DicRedisseminatorsTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

