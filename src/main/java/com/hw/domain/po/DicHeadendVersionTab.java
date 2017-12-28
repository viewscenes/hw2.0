
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


public class DicHeadendVersionTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicHeadendVersionTab";
	public static final String ALIAS_VERSION_ID = "接口版本管理表id";
	public static final String ALIAS_VERSION_NAME = "名称";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 接口版本管理表id       db_column: VERSION_ID 
     */	
	
	private Long versionId;
    /**
     * 名称       db_column: VERSION_NAME 
     */	
	private String versionName;
	//columns END

	public DicHeadendVersionTab(){
	}

	public DicHeadendVersionTab(
		Long versionId
	){
		this.versionId = versionId;
	}

	public void setVersionId(Long value) {
		this.versionId = value;
	}
	
	public Long getVersionId() {
		return this.versionId;
	}
	public void setVersionName(String value) {
		this.versionName = value;
	}
	
	public String getVersionName() {
		return this.versionName;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("VersionId",getVersionId())
			.append("VersionName",getVersionName())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getVersionId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicHeadendVersionTab == false) return false;
		if(this == obj) return true;
		DicHeadendVersionTab other = (DicHeadendVersionTab)obj;
		return new EqualsBuilder()
			.append(getVersionId(),other.getVersionId())
			.isEquals();
	}
}

