
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ResTransmitStationTabQuery implements Serializable {
    private static final Long serialVersionUID = 3148176768559230877L;
    

	/** 发射台id */
	private Integer stationId;
	/** 名称 */
	private String name;
	/** 发射台code */
	private String code;
	/** gid */
	private String gid;
	/** 国家 */
	private String country;
	/** 省会 */
	private String province;
	/** 地址 */
	private String address;
	/** 城市 */
	private String city;
	/** 经度 */
	private String longitude;
	/** 预留 */
	private String county;
	/** 维度 */
	private String latitude;
	/** 是否删除 */
	private Integer isDelete;
	/** 发射台所属  国内直属,国内地方,海外直属,海外转播 */
	private String stationType;

    /**
     * 播向区       db_column: broadcast_direction
     */

    private String broadcastDirection;

    private Integer StationTypeId;

	public Integer getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String value) {
		this.name = value;
	}

    public String getBroadcastDirection() {
        return broadcastDirection;
    }

    public void setBroadcastDirection(String broadcastDirection) {
        this.broadcastDirection = broadcastDirection;
    }

    public Integer getStationTypeId() {
        return StationTypeId;
    }

    public void setStationTypeId(Integer stationTypeId) {
        StationTypeId = stationTypeId;
    }

    public String getCode() {
		return this.code;
	}
	
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getGid() {
		return this.gid;
	}
	
	public void setGid(String value) {
		this.gid = value;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String value) {
		this.country = value;
	}
	
	public String getProvince() {
		return this.province;
	}
	
	public void setProvince(String value) {
		this.province = value;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String value) {
		this.city = value;
	}

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCounty() {
		return this.county;
	}
	
	public void setCounty(String value) {
		this.county = value;
	}
	
	public String getLatitude() {
		return this.latitude;
	}
	
	public void setLatitude(String value) {
		this.latitude = value;
	}
	
	public Integer getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Integer value) {
		this.isDelete = value;
	}
	
	public String getStationType() {
		return this.stationType;
	}
	
	public void setStationType(String value) {
		this.stationType = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

