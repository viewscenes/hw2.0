
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


public class SecOperationDetailTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "SecOperationDetailTab";
	public static final String ALIAS_DETAIL_ID = "detailId";
	public static final String ALIAS_OPERATION_NAME = "operationName";
	public static final String ALIAS_OPERATION_ID = "operationId";
	public static final String ALIAS_LEVELVALUE = "levelvalue";
	public static final String ALIAS_IS_LOG = "isLog";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * detailId       db_column: DETAIL_ID 
     */	
	
	private Long detailId;
    /**
     * operationName       db_column: OPERATION_NAME 
     */	
	private String operationName;
    /**
     * operationId       db_column: OPERATION_ID 
     */	
	
	private Long operationId;
    /**
     * levelvalue       db_column: LEVELVALUE 
     */	
	
	private Long levelvalue;
    /**
     * isLog       db_column: IS_LOG 
     */	
	
	private Long isLog;
	//columns END

	public SecOperationDetailTab(){
	}

	public SecOperationDetailTab(
		Long detailId
	){
		this.detailId = detailId;
	}

	public void setDetailId(Long value) {
		this.detailId = value;
	}
	
	public Long getDetailId() {
		return this.detailId;
	}
	public void setOperationName(String value) {
		this.operationName = value;
	}
	
	public String getOperationName() {
		return this.operationName;
	}
	public void setOperationId(Long value) {
		this.operationId = value;
	}
	
	public Long getOperationId() {
		return this.operationId;
	}
	public void setLevelvalue(Long value) {
		this.levelvalue = value;
	}
	
	public Long getLevelvalue() {
		return this.levelvalue;
	}
	public void setIsLog(Long value) {
		this.isLog = value;
	}
	
	public Long getIsLog() {
		return this.isLog;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("DetailId",getDetailId())
			.append("OperationName",getOperationName())
			.append("OperationId",getOperationId())
			.append("Levelvalue",getLevelvalue())
			.append("IsLog",getIsLog())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getDetailId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SecOperationDetailTab == false) return false;
		if(this == obj) return true;
		SecOperationDetailTab other = (SecOperationDetailTab)obj;
		return new EqualsBuilder()
			.append(getDetailId(),other.getDetailId())
			.isEquals();
	}
}

