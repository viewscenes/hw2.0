
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


public class RadioMessageReportTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioMessageReportTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_REPORT_TIME = "上报时间";
	public static final String ALIAS_REPORT_DESCRIPTION = "上报内容";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 上报时间       db_column: REPORT_TIME 
     */	
	
	private Date reportTime;
    /**
     * 上报内容       db_column: REPORT_DESCRIPTION 
     */	
	private String reportDescription;
	//columns END

	public RadioMessageReportTab(){
	}

	public RadioMessageReportTab(
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

	
	public void setReportTime(Date value) {
		this.reportTime = value;
	}
	
	public Date getReportTime() {
		return this.reportTime;
	}
	public void setReportDescription(String value) {
		this.reportDescription = value;
	}
	
	public String getReportDescription() {
		return this.reportDescription;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("ReportTime",getReportTime())
			.append("ReportDescription",getReportDescription())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioMessageReportTab == false) return false;
		if(this == obj) return true;
		RadioMessageReportTab other = (RadioMessageReportTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

