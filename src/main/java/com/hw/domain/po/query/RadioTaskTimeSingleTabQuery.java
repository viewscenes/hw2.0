
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


public class RadioTaskTimeSingleTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 独立任务id */
	private Long timeId;
	/** 上报类型 */
	private Long reportmode;
	/** 上报间隔 */
	private String reportinterval;
	/** 上报时间 */
	private String reporttime;
	/** 开始时间 */
	private Date startdatetimeBegin;
	private Date startdatetimeEnd;
	/** 结束时间 */
	private Date enddatetimeBegin;
	private Date enddatetimeEnd;
	/** 过期时间 */
	private Long expiredays;
	/** 子任务id */
	private Long subTaskId;

	public Long getTimeId() {
		return this.timeId;
	}
	
	public void setTimeId(Long value) {
		this.timeId = value;
	}
	
	public Long getReportmode() {
		return this.reportmode;
	}
	
	public void setReportmode(Long value) {
		this.reportmode = value;
	}
	
	public String getReportinterval() {
		return this.reportinterval;
	}
	
	public void setReportinterval(String value) {
		this.reportinterval = value;
	}
	
	public String getReporttime() {
		return this.reporttime;
	}
	
	public void setReporttime(String value) {
		this.reporttime = value;
	}
	
	public Date getStartdatetimeBegin() {
		return this.startdatetimeBegin;
	}
	
	public void setStartdatetimeBegin(Date value) {
		this.startdatetimeBegin = value;
	}	
	
	public Date getStartdatetimeEnd() {
		return this.startdatetimeEnd;
	}
	
	public void setStartdatetimeEnd(Date value) {
		this.startdatetimeEnd = value;
	}
	
	public Date getEnddatetimeBegin() {
		return this.enddatetimeBegin;
	}
	
	public void setEnddatetimeBegin(Date value) {
		this.enddatetimeBegin = value;
	}	
	
	public Date getEnddatetimeEnd() {
		return this.enddatetimeEnd;
	}
	
	public void setEnddatetimeEnd(Date value) {
		this.enddatetimeEnd = value;
	}
	
	public Long getExpiredays() {
		return this.expiredays;
	}
	
	public void setExpiredays(Long value) {
		this.expiredays = value;
	}
	
	public Long getSubTaskId() {
		return this.subTaskId;
	}
	
	public void setSubTaskId(Long value) {
		this.subTaskId = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

