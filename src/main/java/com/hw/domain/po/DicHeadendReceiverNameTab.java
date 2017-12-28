
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


public class DicHeadendReceiverNameTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicHeadendReceiverNameTab";
	public static final String ALIAS_NAME_ID = "接收机名称id";
	public static final String ALIAS_NAME = "接收机名称";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 接收机名称id       db_column: NAME_ID 
     */	
	
	private Long nameId;
    /**
     * 接收机名称       db_column: NAME 
     */	
	private String name;
	//columns END

	public DicHeadendReceiverNameTab(){
	}

	public DicHeadendReceiverNameTab(
		Long nameId
	){
		this.nameId = nameId;
	}

	public void setNameId(Long value) {
		this.nameId = value;
	}
	
	public Long getNameId() {
		return this.nameId;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("NameId",getNameId())
			.append("Name",getName())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getNameId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicHeadendReceiverNameTab == false) return false;
		if(this == obj) return true;
		DicHeadendReceiverNameTab other = (DicHeadendReceiverNameTab)obj;
		return new EqualsBuilder()
			.append(getNameId(),other.getNameId())
			.isEquals();
	}
}

