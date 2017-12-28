
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


public class ResHeadendOpenTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** headId */
	private Long headId;
	/** startTime */
	private Date startTimeBegin;
	private Date startTimeEnd;
	/** endTime */
	private Date endTimeBegin;
	private Date endTimeEnd;
	/** duration */
	private Long duration;
	/** id */
	private Long id;

	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
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
	
	public Long getDuration() {
		return this.duration;
	}
	
	public void setDuration(Long value) {
		this.duration = value;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

