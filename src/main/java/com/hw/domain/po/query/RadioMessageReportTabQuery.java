
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


public class RadioMessageReportTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 上报时间 */
	private Date reportTimeBegin;
	private Date reportTimeEnd;
	/** 上报内容 */
	private String reportDescription;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public Date getReportTimeBegin() {
		return this.reportTimeBegin;
	}
	
	public void setReportTimeBegin(Date value) {
		this.reportTimeBegin = value;
	}	
	
	public Date getReportTimeEnd() {
		return this.reportTimeEnd;
	}
	
	public void setReportTimeEnd(Date value) {
		this.reportTimeEnd = value;
	}
	
	public String getReportDescription() {
		return this.reportDescription;
	}
	
	public void setReportDescription(String value) {
		this.reportDescription = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

