
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


public class DicEquCategoryTab implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicEquCategoryTab";
	public static final String ALIAS_CATEGORY_ID = "设备回收日志id";
	public static final String ALIAS_CATEGORY = "设备回收日志类型";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 设备回收日志id       db_column: CATEGORY_ID 
     */	
	
	private Long categoryId;
    /**
     * 设备回收日志类型       db_column: CATEGORY 
     */	
	private String category;
	//columns END

	public DicEquCategoryTab(){
	}

	public DicEquCategoryTab(
		Long categoryId
	){
		this.categoryId = categoryId;
	}

	public void setCategoryId(Long value) {
		this.categoryId = value;
	}
	
	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategory(String value) {
		this.category = value;
	}
	
	public String getCategory() {
		return this.category;
	}
	

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("CategoryId",getCategoryId())
			.append("Category",getCategory())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getCategoryId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicEquCategoryTab == false) return false;
		if(this == obj) return true;
		DicEquCategoryTab other = (DicEquCategoryTab)obj;
		return new EqualsBuilder()
			.append(getCategoryId(),other.getCategoryId())
			.isEquals();
	}
}

