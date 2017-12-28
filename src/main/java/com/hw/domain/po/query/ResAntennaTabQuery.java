
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ResAntennaTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 天线id */
	private Long id;
	/** 发射台 */
	private String stationName;
	/** 天线号 */
	private String antennaNo;
	/** 天线模式 */
	private String antennaMode;
	/** ITU */
	private String itu;
	/** 描述 */
	private String direction;
	/** 服务区 */
	private String serviceArea;
	/** 地址 */
	private String address;
	/** CIRAF */
	private String ciraf;
	/** SHIYPD */
	private String shiypd;
	/** 备注 */
	private String remark;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getAntennaNo() {
		return this.antennaNo;
	}
	
	public void setAntennaNo(String value) {
		this.antennaNo = value;
	}
	
	public String getAntennaMode() {
		return this.antennaMode;
	}
	
	public void setAntennaMode(String value) {
		this.antennaMode = value;
	}
	
	public String getItu() {
		return this.itu;
	}
	
	public void setItu(String value) {
		this.itu = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getShiypd() {
		return this.shiypd;
	}
	
	public void setShiypd(String value) {
		this.shiypd = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

