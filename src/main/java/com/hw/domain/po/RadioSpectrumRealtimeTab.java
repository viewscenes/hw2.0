
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


public class RadioSpectrumRealtimeTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioSpectrumRealtimeTab";
	public static final String ALIAS_REALTIME_ID = "realtimeId";
	public static final String ALIAS_EQU_CODE = "接收机";
	public static final String ALIAS_BAND = "波段";
	public static final String ALIAS_CHECK_DATETIME = "数据测量时间";
	public static final String ALIAS_FREQUENCY = "频率";
	public static final String ALIAS_ELEVEL = "测量值";
	public static final String ALIAS_HEAD_ID = "前端ID";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * realtimeId       db_column: REALTIME_ID 
     */	
	
	private Long realtimeId;
    /**
     * 接收机       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 波段       db_column: BAND 
     */	
	
	private Long band;
    /**
     * 数据测量时间       db_column: CHECK_DATETIME 
     */	
	
	private Date checkDatetime;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Long frequency;
    /**
     * 测量值       db_column: E_LEVEL 
     */	
	private String elevel;
    /**
     * 前端ID       db_column: HEAD_ID 
     */	
	
	private Long headId;
	//columns END

	public RadioSpectrumRealtimeTab(){
	}

	public RadioSpectrumRealtimeTab(
		Long realtimeId
	){
		this.realtimeId = realtimeId;
	}

	public void setRealtimeId(Long value) {
		this.realtimeId = value;
	}
	
	public Long getRealtimeId() {
		return this.realtimeId;
	}
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	public void setBand(Long value) {
		this.band = value;
	}
	
	public Long getBand() {
		return this.band;
	}

	
	public void setCheckDatetime(Date value) {
		this.checkDatetime = value;
	}
	
	public Date getCheckDatetime() {
		return this.checkDatetime;
	}
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	public void setElevel(String value) {
		this.elevel = value;
	}
	
	public String getElevel() {
		return this.elevel;
	}
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("RealtimeId",getRealtimeId())
			.append("EquCode",getEquCode())
			.append("Band",getBand())
			.append("CheckDatetime",getCheckDatetime())
			.append("Frequency",getFrequency())
			.append("Elevel",getElevel())
			.append("HeadId",getHeadId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getRealtimeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioSpectrumRealtimeTab == false) return false;
		if(this == obj) return true;
		RadioSpectrumRealtimeTab other = (RadioSpectrumRealtimeTab)obj;
		return new EqualsBuilder()
			.append(getRealtimeId(),other.getRealtimeId())
			.isEquals();
	}
}

