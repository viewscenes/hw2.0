
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


public class ResShiftLogTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 交接班日志创建人id */
	private Long fromUserid;
	/** 交接班开始日期 */
	private Date startTimeBegin;
	private Date startTimeEnd;
	/** 交接班详细 */
	private String description;
	/** 交接班日志创建人 */
	private String fromUsername;
	/** isDelete */
	private Long isDelete;
	/** 交接班结束日期 */
	private Date endTimeBegin;
	private Date endTimeEnd;
	/** 交接人 */
	private String douserName;
	/** 交接班日志创建日期 */
	private Date createTimeBegin;
	private Date createTimeEnd;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getFromUserid() {
		return this.fromUserid;
	}
	
	public void setFromUserid(Long value) {
		this.fromUserid = value;
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
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getFromUsername() {
		return this.fromUsername;
	}
	
	public void setFromUsername(String value) {
		this.fromUsername = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
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
	
	public String getDouserName() {
		return this.douserName;
	}
	
	public void setDouserName(String value) {
		this.douserName = value;
	}
	
	public Date getCreateTimeBegin() {
		return this.createTimeBegin;
	}
	
	public void setCreateTimeBegin(Date value) {
		this.createTimeBegin = value;
	}	
	
	public Date getCreateTimeEnd() {
		return this.createTimeEnd;
	}
	
	public void setCreateTimeEnd(Date value) {
		this.createTimeEnd = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

