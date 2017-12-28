
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


public class RadioEquEventTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioEquEventTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_HEAD_CODE = "故障站点code";
	public static final String ALIAS_EVENT_TYPE = "故障类型";
	public static final String ALIAS_START_TIME = "开始时间";
	public static final String ALIAS_END_TIME = "结束时间";
	public static final String ALIAS_HANDLE_METHOD = "处理方式：1安装，2台内维护，3，外出维护";
	public static final String ALIAS_HANDLE_USERID = "处理人";
	public static final String ALIAS_REMARK = "备注";
	
	//date formats

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 故障站点code       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 故障类型       db_column: EVENT_TYPE 
     */	
	
	private Long eventType;
    /**
     * 开始时间       db_column: START_TIME 
     */	
	
	private Date startTime;
    /**
     * 结束时间       db_column: END_TIME 
     */	
	
	private Date endTime;
    /**
     * 处理方式：1安装，2台内维护，3，外出维护       db_column: HANDLE_METHOD 
     */	
	
	private Long handleMethod;
    /**
     * 处理人       db_column: HANDLE_USERID 
     */	
	
	private Long handleUserid;
    /**
     * 备注       db_column: REMARK 
     */	
	private String remark;
	//columns END

	public RadioEquEventTab(){
	}

	public RadioEquEventTab(
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
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	public void setEventType(Long value) {
		this.eventType = value;
	}
	
	public Long getEventType() {
		return this.eventType;
	}

	
	public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}

	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	public void setHandleMethod(Long value) {
		this.handleMethod = value;
	}
	
	public Long getHandleMethod() {
		return this.handleMethod;
	}
	public void setHandleUserid(Long value) {
		this.handleUserid = value;
	}
	
	public Long getHandleUserid() {
		return this.handleUserid;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	private DicEventTypeTab dicEventTypeTab;
	
	public void setDicEventTypeTab(DicEventTypeTab dicEventTypeTab){
		this.dicEventTypeTab = dicEventTypeTab;
	}
	
	public DicEventTypeTab getDicEventTypeTab() {
		return dicEventTypeTab;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("HeadCode",getHeadCode())
			.append("EventType",getEventType())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.append("HandleMethod",getHandleMethod())
			.append("HandleUserid",getHandleUserid())
			.append("Remark",getRemark())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioEquEventTab == false) return false;
		if(this == obj) return true;
		RadioEquEventTab other = (RadioEquEventTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

