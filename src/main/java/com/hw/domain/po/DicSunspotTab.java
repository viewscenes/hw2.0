
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


public class DicSunspotTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicSunspotTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_TIME_YEAR = "年";
	public static final String ALIAS_TIME_MONTH = "月";
	public static final String ALIAS_SSN = "太阳黑子数";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 年       db_column: TIME_YEAR 
     */	
	private String timeYear;
    /**
     * 月       db_column: TIME_MONTH 
     */	
	private String timeMonth;
    /**
     * 太阳黑子数       db_column: SSN 
     */	
	
	private Long ssn;
	//columns END

	public DicSunspotTab(){
	}

	public DicSunspotTab(
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
	public void setTimeYear(String value) {
		this.timeYear = value;
	}
	
	public String getTimeYear() {
		return this.timeYear;
	}
	public void setTimeMonth(String value) {
		this.timeMonth = value;
	}
	
	public String getTimeMonth() {
		return this.timeMonth;
	}
	public void setSsn(Long value) {
		this.ssn = value;
	}
	
	public Long getSsn() {
		return this.ssn;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("TimeYear",getTimeYear())
			.append("TimeMonth",getTimeMonth())
			.append("Ssn",getSsn())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicSunspotTab == false) return false;
		if(this == obj) return true;
		DicSunspotTab other = (DicSunspotTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

