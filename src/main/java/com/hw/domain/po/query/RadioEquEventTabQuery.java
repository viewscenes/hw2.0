
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


public class RadioEquEventTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 故障站点code */
	private String headCode;
	/** 故障类型 */
	private Long eventType;
	/** 开始时间 */
	private Date startTimeBegin;
	private Date startTimeEnd;
	/** 结束时间 */
	private Date endTimeBegin;
	private Date endTimeEnd;
	/** 处理方式：1安装，2台内维护，3，外出维护 */
	private Long handleMethod;
	/** 处理人 */
	private Long handleUserid;
	/** 备注 */
	private String remark;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public Long getEventType() {
		return this.eventType;
	}
	
	public void setEventType(Long value) {
		this.eventType = value;
	}
	
	public Date getStartTimeBegin() {
		return this.startTimeBegin;
	}
	
	public void setStartTimeBegin(Date value) {
		this.startTimeBegin = value;
	}	
	
	public Date getStartTimeEnd() {
		return this.startTimeEnd;
	}
	
	public void setStartTimeEnd(Date value) {
		this.startTimeEnd = value;
	}
	
	public Date getEndTimeBegin() {
		return this.endTimeBegin;
	}
	
	public void setEndTimeBegin(Date value) {
		this.endTimeBegin = value;
	}	
	
	public Date getEndTimeEnd() {
		return this.endTimeEnd;
	}
	
	public void setEndTimeEnd(Date value) {
		this.endTimeEnd = value;
	}
	
	public Long getHandleMethod() {
		return this.handleMethod;
	}
	
	public void setHandleMethod(Long value) {
		this.handleMethod = value;
	}
	
	public Long getHandleUserid() {
		return this.handleUserid;
	}
	
	public void setHandleUserid(Long value) {
		this.handleUserid = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

