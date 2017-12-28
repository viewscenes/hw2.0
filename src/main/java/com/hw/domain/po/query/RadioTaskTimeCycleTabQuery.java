
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioTaskTimeCycleTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 循环任务id */
	private Long timeId;
	/** 任务周设置 */
	private String dayofweek;
	/** 开始时间 */
	private String starttime;
	/** 结束时间 */
	private String endtime;
	/** 上报类型 */
	private Long reportmode;
	/** 上报间隔 */
	private String reportinterval;
	/** 上报时间 */
	private String reporttime;
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
	
	public String getDayofweek() {
		return this.dayofweek;
	}
	
	public void setDayofweek(String value) {
		this.dayofweek = value;
	}
	
	public String getStarttime() {
		return this.starttime;
	}
	
	public void setStarttime(String value) {
		this.starttime = value;
	}
	
	public String getEndtime() {
		return this.endtime;
	}
	
	public void setEndtime(String value) {
		this.endtime = value;
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

