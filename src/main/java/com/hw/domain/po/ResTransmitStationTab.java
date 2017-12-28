
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


public class ResTransmitStationTab   implements java.io.Serializable{
	private static final Long serialVersionUID = 5454155825314635342L;
	

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 发射台id       db_column: STATION_ID 
     */	
	
	private Integer stationId;
    /**
     * 名称       db_column: NAME 
     */	
	private String name;
    /**
     * 发射台code       db_column: CODE 
     */	
	private String code;
    /**
     * gid       db_column: GID 
     */	
	private String gid;
    /**
     * 国家       db_column: COUNTRY 
     */	
	private String country;
    /**
     * 省会       db_column: PROVINCE 
     */	
	private String province;
    /**
     * 地址       db_column: ADDRESS 
     */	
	private String address;
    /**
     * 城市       db_column: CITY 
     */	
	private String city;
    /**
     * 经度       db_column: IntegerITUDE 
     */	
	private String longitude;
    /**
     * 预留       db_column: COUNTY 
     */	
	private String county;
    /**
     * 维度       db_column: LATITUDE 
     */	
	private String latitude;
    /**
     * 是否删除       db_column: IS_DELETE 
     */	
	
	private Integer isDelete;
    /**
     * 发射台所属  国内直属,国内地方,海外直属,海外转播       db_column: STATION_TYPE 
     */	
	private String stationType;

    /**
     * 播向区       db_column: broadcast_direction
     */

    private String broadcastDirection;
    
    private Integer StationTypeId;
	//columns END

	public ResTransmitStationTab(){
	}

    public Integer getStationTypeId() {
        return StationTypeId;
    }

    public void setStationTypeId(Integer stationTypeId) {
        StationTypeId = stationTypeId;
    }

    public ResTransmitStationTab(
		Integer stationId
	){
		this.stationId = stationId;
	}

    public String getBroadcastDirection() {
        return broadcastDirection;
    }

    public void setBroadcastDirection(String broadcastDirection) {
        this.broadcastDirection = broadcastDirection;
    }

    public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	public Integer getStationId() {
		return this.stationId;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return this.code;
	}
	public void setGid(String value) {
		this.gid = value;
	}
	
	public String getGid() {
		return this.gid;
	}
	public void setCountry(String value) {
		this.country = value;
	}
	
	public String getCountry() {
		return this.country;
	}
	public void setProvince(String value) {
		this.province = value;
	}
	
	public String getProvince() {
		return this.province;
	}
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return this.city;
	}

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setCounty(String value) {
		this.county = value;
	}
	
	public String getCounty() {
		return this.county;
	}
	public void setLatitude(String value) {
		this.latitude = value;
	}
	
	public String getLatitude() {
		return this.latitude;
	}
	public void setIsDelete(Integer value) {
		this.isDelete = value;
	}
	
	public Integer getIsDelete() {
		return this.isDelete;
	}
	public void setStationType(String value) {
		this.stationType = value;
	}
	
	public String getStationType() {
		return this.stationType;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("StationId",getStationId())
			.append("Name",getName())
			.append("Code",getCode())
			.append("Gid",getGid())
			.append("Country",getCountry())
			.append("Province",getProvince())
			.append("Address",getAddress())
			.append("City",getCity())
			.append("Longitude",getLongitude())
			.append("County",getCounty())
			.append("Latitude",getLatitude())
			.append("IsDelete",getIsDelete())
			.append("StationType",getStationType())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getStationId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ResTransmitStationTab == false) return false;
		if(this == obj) return true;
		ResTransmitStationTab other = (ResTransmitStationTab)obj;
		return new EqualsBuilder()
			.append(getStationId(),other.getStationId())
			.isEquals();
	}
}

