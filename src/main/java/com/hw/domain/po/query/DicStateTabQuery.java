
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


public class DicStateTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 洲代号 */
	private Long state;
	/** 洲名称 */
	private String stateName;
	/** 夏令时开始时间 */
	private Date startTimeBegin;
	private Date startTimeEnd;
	/** 夏令时结束时间 */
	private Date endTimeBegin;
	private Date endTimeEnd;

	public Long getState() {
		return this.state;
	}
	
	public void setState(Long value) {
		this.state = value;
	}
	
	public String getStateName() {
		return this.stateName;
	}
	
	public void setStateName(String value) {
		this.stateName = value;
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
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

