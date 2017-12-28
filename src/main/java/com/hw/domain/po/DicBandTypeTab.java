
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


public class DicBandTypeTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicBandTypeTab";
	public static final String ALIAS_BAND_ID = "波段id";
	public static final String ALIAS_BAND_NAME = "波段名称";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 波段id       db_column: BAND_ID 
     */	
	
	private Long bandId;
    /**
     * 波段名称       db_column: BAND_NAME 
     */	

	private String bandName;
	//columns END

	public DicBandTypeTab(){
	}

	public DicBandTypeTab(
		Long bandId
	){
		this.bandId = bandId;
	}

	public void setBandId(Long value) {
		this.bandId = value;
	}
	
	public Long getBandId() {
		return this.bandId;
	}
	public void setBandName(String value) {
		this.bandName = value;
	}
	
	public String getBandName() {
		return this.bandName;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("BandId",getBandId())
			.append("BandName",getBandName())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getBandId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicBandTypeTab == false) return false;
		if(this == obj) return true;
		DicBandTypeTab other = (DicBandTypeTab)obj;
		return new EqualsBuilder()
			.append(getBandId(),other.getBandId())
			.isEquals();
	}
}

