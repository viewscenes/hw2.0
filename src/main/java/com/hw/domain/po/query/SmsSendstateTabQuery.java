
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class SmsSendstateTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** userid */
	private Long userid;
	/** sms */
	private String sms;
	/** 0--待发送 1--成功 2--失败 */
	private Long state;
	/** mobilephone */
	private String mobilephone;
	/** msgTime */
	private Date msgTimeBegin;
	private Date msgTimeEnd;
	/** sendTime */
	private Date sendTimeBegin;
	private Date sendTimeEnd;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getUserid() {
		return this.userid;
	}
	
	public void setUserid(Long value) {
		this.userid = value;
	}
	
	public String getSms() {
		return this.sms;
	}
	
	public void setSms(String value) {
		this.sms = value;
	}
	
	public Long getState() {
		return this.state;
	}
	
	public void setState(Long value) {
		this.state = value;
	}
	
	public String getMobilephone() {
		return this.mobilephone;
	}
	
	public void setMobilephone(String value) {
		this.mobilephone = value;
	}
	
	public Date getMsgTimeBegin() {
		return this.msgTimeBegin;
	}
	
	public void setMsgTimeBegin(Date value) {
		this.msgTimeBegin = value;
	}	
	
	public Date getMsgTimeEnd() {
		return this.msgTimeEnd;
	}
	
	public void setMsgTimeEnd(Date value) {
		this.msgTimeEnd = value;
	}
	
	public Date getSendTimeBegin() {
		return this.sendTimeBegin;
	}
	
	public void setSendTimeBegin(Date value) {
		this.sendTimeBegin = value;
	}	
	
	public Date getSendTimeEnd() {
		return this.sendTimeEnd;
	}
	
	public void setSendTimeEnd(Date value) {
		this.sendTimeEnd = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

