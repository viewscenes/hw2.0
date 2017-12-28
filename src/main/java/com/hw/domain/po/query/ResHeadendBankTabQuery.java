
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


public class ResHeadendBankTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 前端id */
	private Long headId;
	/** 前端code */
	private String code;
	/** 前端简称 */
	private String shortname;
	/** 1:宽带，2:拨号 */
	private String comId;
	/** 通信协议 */
	private String comProtocol;
	/** ip地址 */
	private String ip;
	/** 经度 */
	private String longitude;
	/** 纬度 */
	private String latitude;
	/** 拨号电话 */
	private String comphone;
	/** 站点 */
	private String site;
	/** 地址 */
	private String address;
	/** 站点状态: */
	private String siteStatus;
	/** 通信状态 */
	private String comStatus;
	/** 失败状态 */
	private String faultStatus;
	/** 发射台名称 */
	private String stationName;
	/** 描述 */
	private String descript;
	/** 大洲 */
	private Long state;
	/** 国家 */
	private String country;
	/** 版本 */
	private String version;
	/** 时区 */
	private Date occurTimeBegin;
	private Date occurTimeEnd;
	/** 海拔 */
	private Long altitude;
	/** 夏令开始时间 */
	private Date summertimeBeginBegin;
	private Date summertimeBeginEnd;
	/** 夏令结束时间 */
	private Date summertimeEndBegin;
	private Date summertimeEndEnd;
	/** CIRAF */
	private String ciraf;
	/** 维护人 */
	private String person;
	/** 维护人电话 */
	private String personPhone;
	/** 联系人 */
	private String principal;
	/** 联系人电话 */
	private String principalPhone;
	/** 时差 */
	private Long timeDiff;
	/** 是否删除 */
	private Long isDelete;
	/** 默认语言 */
	private String defaultLanguage;
	/** x */
	private String x;
	/** y */
	private String y;
	/** 101采集点，102遥控站 */
	private Long typeId;
	/** 站点下发地址 */
	private String url;
	/** 1:在线，0不在线 */
	private Long isOnline;
	/** ?????????????????? */
	private String manufacturer;
	/** 服务区 */
	private String serviceName;
	/** 职务 */
	private String post;

	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getShortname() {
		return this.shortname;
	}
	
	public void setShortname(String value) {
		this.shortname = value;
	}
	
	public String getComId() {
		return this.comId;
	}
	
	public void setComId(String value) {
		this.comId = value;
	}
	
	public String getComProtocol() {
		return this.comProtocol;
	}
	
	public void setComProtocol(String value) {
		this.comProtocol = value;
	}
	
	public String getIp() {
		return this.ip;
	}
	
	public void setIp(String value) {
		this.ip = value;
	}
	
	public String getLongitude() {
		return this.longitude;
	}
	
	public void setLongitude(String value) {
		this.longitude = value;
	}
	
	public String getLatitude() {
		return this.latitude;
	}
	
	public void setLatitude(String value) {
		this.latitude = value;
	}
	
	public String getComphone() {
		return this.comphone;
	}
	
	public void setComphone(String value) {
		this.comphone = value;
	}
	
	public String getSite() {
		return this.site;
	}
	
	public void setSite(String value) {
		this.site = value;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getSiteStatus() {
		return this.siteStatus;
	}
	
	public void setSiteStatus(String value) {
		this.siteStatus = value;
	}
	
	public String getComStatus() {
		return this.comStatus;
	}
	
	public void setComStatus(String value) {
		this.comStatus = value;
	}
	
	public String getFaultStatus() {
		return this.faultStatus;
	}
	
	public void setFaultStatus(String value) {
		this.faultStatus = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getDescript() {
		return this.descript;
	}
	
	public void setDescript(String value) {
		this.descript = value;
	}
	
	public Long getState() {
		return this.state;
	}
	
	public void setState(Long value) {
		this.state = value;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String value) {
		this.country = value;
	}
	
	public String getVersion() {
		return this.version;
	}
	
	public void setVersion(String value) {
		this.version = value;
	}
	
	public Date getOccurTimeBegin() {
		return this.occurTimeBegin;
	}
	
	public void setOccurTimeBegin(Date value) {
		this.occurTimeBegin = value;
	}	
	
	public Date getOccurTimeEnd() {
		return this.occurTimeEnd;
	}
	
	public void setOccurTimeEnd(Date value) {
		this.occurTimeEnd = value;
	}
	
	public Long getAltitude() {
		return this.altitude;
	}
	
	public void setAltitude(Long value) {
		this.altitude = value;
	}
	
	public Date getSummertimeBeginBegin() {
		return this.summertimeBeginBegin;
	}
	
	public void setSummertimeBeginBegin(Date value) {
		this.summertimeBeginBegin = value;
	}	
	
	public Date getSummertimeBeginEnd() {
		return this.summertimeBeginEnd;
	}
	
	public void setSummertimeBeginEnd(Date value) {
		this.summertimeBeginEnd = value;
	}
	
	public Date getSummertimeEndBegin() {
		return this.summertimeEndBegin;
	}
	
	public void setSummertimeEndBegin(Date value) {
		this.summertimeEndBegin = value;
	}	
	
	public Date getSummertimeEndEnd() {
		return this.summertimeEndEnd;
	}
	
	public void setSummertimeEndEnd(Date value) {
		this.summertimeEndEnd = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getPerson() {
		return this.person;
	}
	
	public void setPerson(String value) {
		this.person = value;
	}
	
	public String getPersonPhone() {
		return this.personPhone;
	}
	
	public void setPersonPhone(String value) {
		this.personPhone = value;
	}
	
	public String getPrincipal() {
		return this.principal;
	}
	
	public void setPrincipal(String value) {
		this.principal = value;
	}
	
	public String getPrincipalPhone() {
		return this.principalPhone;
	}
	
	public void setPrincipalPhone(String value) {
		this.principalPhone = value;
	}
	
	public Long getTimeDiff() {
		return this.timeDiff;
	}
	
	public void setTimeDiff(Long value) {
		this.timeDiff = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public String getDefaultLanguage() {
		return this.defaultLanguage;
	}
	
	public void setDefaultLanguage(String value) {
		this.defaultLanguage = value;
	}
	
	public String getX() {
		return this.x;
	}
	
	public void setX(String value) {
		this.x = value;
	}
	
	public String getY() {
		return this.y;
	}
	
	public void setY(String value) {
		this.y = value;
	}
	
	public Long getTypeId() {
		return this.typeId;
	}
	
	public void setTypeId(Long value) {
		this.typeId = value;
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public Long getIsOnline() {
		return this.isOnline;
	}
	
	public void setIsOnline(Long value) {
		this.isOnline = value;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public void setManufacturer(String value) {
		this.manufacturer = value;
	}
	
	public String getServiceName() {
		return this.serviceName;
	}
	
	public void setServiceName(String value) {
		this.serviceName = value;
	}
	
	public String getPost() {
		return this.post;
	}
	
	public void setPost(String value) {
		this.post = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

