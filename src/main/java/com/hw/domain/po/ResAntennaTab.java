
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


public class ResAntennaTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ResAntennaTab";
	public static final String ALIAS_ID = "天线id";
	public static final String ALIAS_STATION_NAME = "发射台";
	public static final String ALIAS_ANTENNA_NO = "天线号";
	public static final String ALIAS_ANTENNA_MODE = "天线模式";
	public static final String ALIAS_ITU = "ITU";
	public static final String ALIAS_DIRECTION = "描述";
	public static final String ALIAS_SERVICE_AREA = "服务区";
	public static final String ALIAS_ADDRESS = "地址";
	public static final String ALIAS_CIRAF = "CIRAF";
	public static final String ALIAS_SHIYPD = "SHIYPD";
	public static final String ALIAS_REMARK = "备注";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 天线id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 发射台       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * 天线号       db_column: ANTENNA_NO 
     */	
	private String antennaNo;
    /**
     * 天线模式       db_column: ANTENNA_MODE 
     */	
	private String antennaMode;
    /**
     * ITU       db_column: ITU 
     */	
	private String itu;
    /**
     * 描述       db_column: DIRECTION 
     */	
	private String direction;
    /**
     * 服务区       db_column: SERVICE_AREA 
     */	
	private String serviceArea;
    /**
     * 地址       db_column: ADDRESS 
     */	
	private String address;
    /**
     * CIRAF       db_column: CIRAF 
     */	
	private String ciraf;
    /**
     * SHIYPD       db_column: SHIYPD 
     */	
	private String shiypd;
    /**
     * 备注       db_column: REMARK 
     */	
	private String remark;
	//columns END

	public ResAntennaTab(){
	}

	public ResAntennaTab(
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
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	public void setAntennaNo(String value) {
		this.antennaNo = value;
	}
	
	public String getAntennaNo() {
		return this.antennaNo;
	}
	public void setAntennaMode(String value) {
		this.antennaMode = value;
	}
	
	public String getAntennaMode() {
		return this.antennaMode;
	}
	public void setItu(String value) {
		this.itu = value;
	}
	
	public String getItu() {
		return this.itu;
	}
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	public void setShiypd(String value) {
		this.shiypd = value;
	}
	
	public String getShiypd() {
		return this.shiypd;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("StationName",getStationName())
			.append("AntennaNo",getAntennaNo())
			.append("AntennaMode",getAntennaMode())
			.append("Itu",getItu())
			.append("Direction",getDirection())
			.append("ServiceArea",getServiceArea())
			.append("Address",getAddress())
			.append("Ciraf",getCiraf())
			.append("Shiypd",getShiypd())
			.append("Remark",getRemark())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ResAntennaTab == false) return false;
		if(this == obj) return true;
		ResAntennaTab other = (ResAntennaTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

