
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioQualityAlarmTabLog   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioQualityAlarmTabLog";
	public static final String ALIAS_HEAD_CODE = "前端code";
	public static final String ALIAS_STATE00_COUNT = "当前未处理报警";
	public static final String ALIAS_REAL_ROW_COUNT = "总报警次数";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 前端code       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 当前未处理报警       db_column: STATE00_COUNT 
     */	
	
	private Long state00Count;
    /**
     * 总报警次数       db_column: REAL_ROW_COUNT 
     */	
	
	private Long realRowCount;
	//columns END

	public RadioQualityAlarmTabLog(){
	}

	public RadioQualityAlarmTabLog(
		String headCode
	){
		this.headCode = headCode;
	}

	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	public void setState00Count(Long value) {
		this.state00Count = value;
	}
	
	public Long getState00Count() {
		return this.state00Count;
	}
	public void setRealRowCount(Long value) {
		this.realRowCount = value;
	}
	
	public Long getRealRowCount() {
		return this.realRowCount;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("HeadCode",getHeadCode())
			.append("State00Count",getState00Count())
			.append("RealRowCount",getRealRowCount())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getHeadCode())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioQualityAlarmTabLog == false) return false;
		if(this == obj) return true;
		RadioQualityAlarmTabLog other = (RadioQualityAlarmTabLog)obj;
		return new EqualsBuilder()
			.append(getHeadCode(),other.getHeadCode())
			.isEquals();
	}
}

