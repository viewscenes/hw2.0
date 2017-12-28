
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ResNatificationTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ResNatificationTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_FROM_USERID = "通知创建人";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_TO_USERID = "通知到达人群体id";
	public static final String ALIAS_CHECK_USERID = "通知查看人";
	public static final String ALIAS_DESCRIPTION = "通知详细";
	public static final String ALIAS_START_TIME = "通知有效开始时间";
	public static final String ALIAS_END_TIME = "通知有效结束时间";
	public static final String ALIAS_IS_DELETE = "是否删除";
	public static final String ALIAS_FROM_USERNAME = "fromUsername";
	public static final String ALIAS_TO_USERNAME = "通知到达人群体名称";
	
	//date formats

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 通知创建人       db_column: FROM_USERID 
     */	
	
	private Long fromUserid;
    /**
     * 创建时间       db_column: CREATE_TIME 
     */	
	
	private Date createTime;
    /**
     * 通知到达人群体id       db_column: TO_USERID 
     */	
	private String toUserid;
    /**
     * 通知查看人       db_column: CHECK_USERID 
     */	
	private String checkUserid;
    /**
     * 通知详细       db_column: DESCRIPTION 
     */	
	private String description;
    /**
     * 通知有效开始时间       db_column: START_TIME 
     */	
	
	private Date startTime;
    /**
     * 通知有效结束时间       db_column: END_TIME 
     */	
	
	private Date endTime;
    /**
     * 是否删除       db_column: IS_DELETE 
     */	
	
	private Long isDelete;
    /**
     * fromUsername       db_column: FROM_USERNAME 
     */	
	private String fromUsername;
    /**
     * 通知到达人群体名称       db_column: TO_USERNAME 
     */	
	private String toUsername;
	//columns END

	public ResNatificationTab(){
	}

	public ResNatificationTab(
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
	public void setFromUserid(Long value) {
		this.fromUserid = value;
	}
	
	public Long getFromUserid() {
		return this.fromUserid;
	}

	
	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setToUserid(String value) {
		this.toUserid = value;
	}
	
	public String getToUserid() {
		return this.toUserid;
	}
	public void setCheckUserid(String value) {
		this.checkUserid = value;
	}
	
	public String getCheckUserid() {
		return this.checkUserid;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}

	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	public void setFromUsername(String value) {
		this.fromUsername = value;
	}
	
	public String getFromUsername() {
		return this.fromUsername;
	}
	public void setToUsername(String value) {
		this.toUsername = value;
	}
	
	public String getToUsername() {
		return this.toUsername;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("FromUserid",getFromUserid())
			.append("CreateTime",getCreateTime())
			.append("ToUserid",getToUserid())
			.append("CheckUserid",getCheckUserid())
			.append("Description",getDescription())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.append("IsDelete",getIsDelete())
			.append("FromUsername",getFromUsername())
			.append("ToUsername",getToUsername())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ResNatificationTab == false) return false;
		if(this == obj) return true;
		ResNatificationTab other = (ResNatificationTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

