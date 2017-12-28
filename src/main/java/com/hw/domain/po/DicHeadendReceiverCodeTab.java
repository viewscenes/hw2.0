
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


public class DicHeadendReceiverCodeTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicHeadendReceiverCodeTab";
	public static final String ALIAS_CODE_ID = "接收机code_id";
	public static final String ALIAS_CODE = "接收机code";
	public static final String ALIAS_DESCRIPTION = "接收机描述";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 接收机code_id       db_column: CODE_ID 
     */	
	
	private Long codeId;
    /**
     * 接收机code       db_column: CODE 
     */	
	private String code;
    /**
     * 接收机描述       db_column: DESCRIPTION 
     */	
	private String description;
	//columns END

	public DicHeadendReceiverCodeTab(){
	}

	public DicHeadendReceiverCodeTab(
		Long codeId
	){
		this.codeId = codeId;
	}

	public void setCodeId(Long value) {
		this.codeId = value;
	}
	
	public Long getCodeId() {
		return this.codeId;
	}
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return this.code;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("CodeId",getCodeId())
			.append("Code",getCode())
			.append("Description",getDescription())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getCodeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicHeadendReceiverCodeTab == false) return false;
		if(this == obj) return true;
		DicHeadendReceiverCodeTab other = (DicHeadendReceiverCodeTab)obj;
		return new EqualsBuilder()
			.append(getCodeId(),other.getCodeId())
			.isEquals();
	}
}

