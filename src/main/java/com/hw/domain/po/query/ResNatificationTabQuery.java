
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


public class ResNatificationTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 通知创建人 */
	private Long fromUserid;
	/** 创建时间 */
	private Date createTimeBegin;
	private Date createTimeEnd;
	/** 通知到达人群体id */
	private String toUserid;
	/** 通知查看人 */
	private String checkUserid;
	/** 通知详细 */
	private String description;
	/** 通知有效开始时间 */
	private Date startTimeBegin;
	private Date startTimeEnd;
	/** 通知有效结束时间 */
	private Date endTimeBegin;
	private Date endTimeEnd;
	/** 是否删除 */
	private Long isDelete;
	/** fromUsername */
	private String fromUsername;
	/** 通知到达人群体名称 */
	private String toUsername;

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
	
	public String getToUserid() {
		return this.toUserid;
	}
	
	public void setToUserid(String value) {
		this.toUserid = value;
	}
	
	public String getCheckUserid() {
		return this.checkUserid;
	}
	
	public void setCheckUserid(String value) {
		this.checkUserid = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
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
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public String getFromUsername() {
		return this.fromUsername;
	}
	
	public void setFromUsername(String value) {
		this.fromUsername = value;
	}
	
	public String getToUsername() {
		return this.toUsername;
	}
	
	public void setToUsername(String value) {
		this.toUsername = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

