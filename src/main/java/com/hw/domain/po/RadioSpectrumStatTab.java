
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


public class RadioSpectrumStatTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "频谱统计信息表";
	public static final String ALIAS_ID = " 主键";
	public static final String ALIAS_HEAD_CODE = "前端CODE";
	public static final String ALIAS_STATION_ID = "发射台ID";
	public static final String ALIAS_STATION_NAME = "发射台";
	public static final String ALIAS_LANGUAGE_ID = "语言ID";
	public static final String ALIAS_LANGUAGE_NAME = "语言";
	public static final String ALIAS_COUNTRY = "国家";
	public static final String ALIAS_EFFECT = "效果";
	public static final String ALIAS_MARK = "分数";
	public static final String ALIAS_FREQ = "频率";
	public static final String ALIAS_PLAYTIME = "播音时段";
	public static final String ALIAS_HEADTYPE = "101采集点，102遥控站";
	public static final String ALIAS_IS_PLAY = "0无播音，1有播音";
	public static final String ALIAS_INPUT_DATETIME = "录入日期";
	public static final String ALIAS_SHORTNAME = "站点名称";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     *  主键       db_column: ID 
     */	
	
	private Long id;
    /**
     * 前端CODE       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 发射台ID       db_column: STATION_ID 
     */	
	private String stationId;
    /**
     * 发射台       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * 语言ID       db_column: LANGUAGE_ID 
     */	
	private String languageId;
    /**
     * 语言       db_column: LANGUAGE_NAME 
     */	
	private String languageName;
    /**
     * 国家       db_column: COUNTRY 
     */	
	private String country;
    /**
     * 效果       db_column: EFFECT 
     */	
	private String effect;
    /**
     * 分数       db_column: MARK 
     */	
	private String mark;
    /**
     * 频率       db_column: FREQ 
     */	
	
	private Long freq;
    /**
     * 播音时段       db_column: PLAYTIME 
     */	
	private String playtime;
    /**
     * 101采集点，102遥控站       db_column: HEADTYPE 
     */	
	private String headtype;
    /**
     * 0无播音，1有播音       db_column: IS_PLAY 
     */	
	
	private Long isPlay;
    /**
     * 录入日期       db_column: INPUT_DATETIME 
     */	
	
	private Date inputDatetime;
    /**
     * 站点名称       db_column: SHORTNAME 
     */	
	private String shortname;
	//columns END

	public RadioSpectrumStatTab(){
	}

	public RadioSpectrumStatTab(
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
	public void setStationId(String value) {
		this.stationId = value;
	}
	
	public String getStationId() {
		return this.stationId;
	}
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	public void setLanguageId(String value) {
		this.languageId = value;
	}
	
	public String getLanguageId() {
		return this.languageId;
	}
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	public void setCountry(String value) {
		this.country = value;
	}
	
	public String getCountry() {
		return this.country;
	}
	public void setEffect(String value) {
		this.effect = value;
	}
	
	public String getEffect() {
		return this.effect;
	}
	public void setMark(String value) {
		this.mark = value;
	}
	
	public String getMark() {
		return this.mark;
	}
	public void setFreq(Long value) {
		this.freq = value;
	}
	
	public Long getFreq() {
		return this.freq;
	}
	public void setPlaytime(String value) {
		this.playtime = value;
	}
	
	public String getPlaytime() {
		return this.playtime;
	}
	public void setHeadtype(String value) {
		this.headtype = value;
	}
	
	public String getHeadtype() {
		return this.headtype;
	}
	public void setIsPlay(Long value) {
		this.isPlay = value;
	}
	
	public Long getIsPlay() {
		return this.isPlay;
	}

	
	public void setInputDatetime(Date value) {
		this.inputDatetime = value;
	}
	
	public Date getInputDatetime() {
		return this.inputDatetime;
	}
	public void setShortname(String value) {
		this.shortname = value;
	}
	
	public String getShortname() {
		return this.shortname;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("HeadCode",getHeadCode())
			.append("StationId",getStationId())
			.append("StationName",getStationName())
			.append("LanguageId",getLanguageId())
			.append("LanguageName",getLanguageName())
			.append("Country",getCountry())
			.append("Effect",getEffect())
			.append("Mark",getMark())
			.append("Freq",getFreq())
			.append("Playtime",getPlaytime())
			.append("Headtype",getHeadtype())
			.append("IsPlay",getIsPlay())
			.append("InputDatetime",getInputDatetime())
			.append("Shortname",getShortname())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioSpectrumStatTab == false) return false;
		if(this == obj) return true;
		RadioSpectrumStatTab other = (RadioSpectrumStatTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

