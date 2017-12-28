
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


public class DicServicesareaTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicServicesareaTab";
	public static final String ALIAS_ID = "服务区id";
	public static final String ALIAS_CHINESE_NAME = "服务区中文名称";
	public static final String ALIAS_ENGLISH_NAME = "服务区英文名称";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 服务区id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 服务区中文名称       db_column: CHINESE_NAME 
     */	
	private String chineseName;
    /**
     * 服务区英文名称       db_column: ENGLISH_NAME 
     */	
	private String englishName;
	//columns END

	public DicServicesareaTab(){
	}

	public DicServicesareaTab(
		Long id
	){
		this.id = id;
	}

	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setChineseName(String value) {
		this.chineseName = value;
	}
	
	public String getChineseName() {
		return this.chineseName;
	}
	public void setEnglishName(String value) {
		this.englishName = value;
	}
	
	public String getEnglishName() {
		return this.englishName;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("ChineseName",getChineseName())
			.append("EnglishName",getEnglishName())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicServicesareaTab == false) return false;
		if(this == obj) return true;
		DicServicesareaTab other = (DicServicesareaTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

