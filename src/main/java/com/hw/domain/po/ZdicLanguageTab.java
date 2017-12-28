
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


public class ZdicLanguageTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZdicLanguageTab";
	public static final String ALIAS_LANGUAGE_ID = "语言id";
	public static final String ALIAS_LANGUAGE_NAME = "语言名称";
	public static final String ALIAS_IS_DELETE = "是否删除";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 语言id       db_column: LANGUAGE_ID 
     */	
	
	private Integer languageId;
    /**
     * 语言名称       db_column: LANGUAGE_NAME 
     */	
	private String languageName;
    /**
     * 是否删除       db_column: IS_DELETE 
     */	
	
	private Long isDelete;
	//columns END

	public ZdicLanguageTab(){
	}

	public ZdicLanguageTab(
            Integer languageId
	){
		this.languageId = languageId;
	}

	public void setLanguageId(Integer value) {
		this.languageId = value;
	}
	
	public Integer getLanguageId() {
		return this.languageId;
	}
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("LanguageId",getLanguageId())
			.append("LanguageName",getLanguageName())
			.append("IsDelete",getIsDelete())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getLanguageId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZdicLanguageTab == false) return false;
		if(this == obj) return true;
		ZdicLanguageTab other = (ZdicLanguageTab)obj;
		return new EqualsBuilder()
			.append(getLanguageId(),other.getLanguageId())
			.isEquals();
	}
}

