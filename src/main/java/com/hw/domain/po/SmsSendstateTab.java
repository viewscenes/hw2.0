
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


public class SmsSendstateTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "SmsSendstateTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_USERID = "userid";
	public static final String ALIAS_SMS = "sms";
	public static final String ALIAS_STATE = "0--待发送 1--成功 2--失败";
	public static final String ALIAS_MOBILEPHONE = "mobilephone";
	public static final String ALIAS_MSG_TIME = "msgTime";
	public static final String ALIAS_SEND_TIME = "sendTime";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * userid       db_column: USERID 
     */	
	
	private Long userid;
    /**
     * sms       db_column: SMS 
     */	
	private String sms;
    /**
     * 0--待发送 1--成功 2--失败       db_column: STATE 
     */	
	private Long state;
    /**
     * mobilephone       db_column: MOBILEPHONE 
     */	
	private String mobilephone;
    /**
     * msgTime       db_column: MSG_TIME 
     */	
	
	private Date msgTime;
    /**
     * sendTime       db_column: SEND_TIME 
     */	
	
	private Date sendTime;
	//columns END

	public SmsSendstateTab(){
	}

	public SmsSendstateTab(
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
	public void setUserid(Long value) {
		this.userid = value;
	}
	
	public Long getUserid() {
		return this.userid;
	}
	public void setSms(String value) {
		this.sms = value;
	}
	
	public String getSms() {
		return this.sms;
	}
	public void setState(Long value) {
		this.state = value;
	}
	
	public Long getState() {
		return this.state;
	}
	public void setMobilephone(String value) {
		this.mobilephone = value;
	}
	
	public String getMobilephone() {
		return this.mobilephone;
	}

	public void setMsgTime(Date value) {
		this.msgTime = value;
	}
	
	public Date getMsgTime() {
		return this.msgTime;
	}

	public void setSendTime(Date value) {
		this.sendTime = value;
	}
	
	public Date getSendTime() {
		return this.sendTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Userid",getUserid())
			.append("Sms",getSms())
			.append("State",getState())
			.append("Mobilephone",getMobilephone())
			.append("MsgTime",getMsgTime())
			.append("SendTime",getSendTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SmsSendstateTab == false) return false;
		if(this == obj) return true;
		SmsSendstateTab other = (SmsSendstateTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

