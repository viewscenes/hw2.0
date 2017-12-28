
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


public class DicEquLogTypeTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicEquLogTypeTab";
	public static final String ALIAS_TYPE_ID = "设备日志详细id";
	public static final String ALIAS_TYPE = "设备日志详细";
	public static final String ALIAS_CATEGORY_ID = "设备日志类型id";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 设备日志详细id       db_column: TYPE_ID 
     */	
	
	private Long typeId;
    /**
     * 设备日志详细       db_column: TYPE 
     */	
	private String type;
    /**
     * 设备日志类型id       db_column: CATEGORY_ID 
     */	
	
	private Long categoryId;
	//columns END

	public DicEquLogTypeTab(){
	}

	public DicEquLogTypeTab(
		Long typeId
	){
		this.typeId = typeId;
	}

	public void setTypeId(Long value) {
		this.typeId = value;
	}
	
	public Long getTypeId() {
		return this.typeId;
	}
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return this.type;
	}
	public void setCategoryId(Long value) {
		this.categoryId = value;
	}
	
	public Long getCategoryId() {
		return this.categoryId;
	}
	
	private DicEquCategoryTab dicEquCategoryTab;
	
	public void setDicEquCategoryTab(DicEquCategoryTab dicEquCategoryTab){
		this.dicEquCategoryTab = dicEquCategoryTab;
	}
	
	public DicEquCategoryTab getDicEquCategoryTab() {
		return dicEquCategoryTab;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("TypeId",getTypeId())
			.append("Type",getType())
			.append("CategoryId",getCategoryId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getTypeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicEquLogTypeTab == false) return false;
		if(this == obj) return true;
		DicEquLogTypeTab other = (DicEquLogTypeTab)obj;
		return new EqualsBuilder()
			.append(getTypeId(),other.getTypeId())
			.isEquals();
	}
}

