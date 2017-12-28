package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ResHeadendTab   implements java.io.Serializable{
    private static final long serialVersionUID = 5454155825314635342L;



    //可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
    //columns START
    /**
     * 前端id       db_column: HEAD_ID 
     */

    private Integer headId;
    /**
     * 前端code       db_column: CODE 
     */
    private String code;
    /**
     * 前端简称       db_column: SHORTNAME 
     */
    private String shortname;
    /**
     * 1:宽带，2:拨号       db_column: COM_ID 
     */
    private String comId;
    /**
     * 通信协议       db_column: COM_PROTOCOL 
     */
    private String comProtocol;
    /**
     * ip地址       db_column: IP 
     */
    private String ip;
    /**
     * 经度       db_column: LONGITUDE
     */
    private String longitude;
    /**
     * 纬度       db_column: LATITUDE 
     */
    private String latitude;
    /**
     * 拨号电话       db_column: COMPHONE 
     */
    private String comphone;
    /**
     * 站点       db_column: SITE 
     */
    private String site;
    /**
     * 地址       db_column: ADDRESS 
     */
    private String address;
    /**
     * 站点状态:       db_column: SITE_STATUS 
     */
    private String siteStatus;
    /**
     * 通信状态       db_column: COM_STATUS 
     */
    private String comStatus;
    /**
     * 失败状态       db_column: FAULT_STATUS 
     */
    private String faultStatus;
    /**
     * 发射台名称       db_column: STATION_NAME 
     */
    private String stationName;
    /**
     * 描述       db_column: DESCRIPT 
     */
    private String descript;
    /**
     * 大洲       db_column: STATE 
     */

    private Integer state;
    /**
     * 国家       db_column: COUNTRY 
     */
    private String country;
    /**
     * 版本       db_column: VERSION 
     */
    private String version;
    /**
     * 时区       db_column: OCCUR_TIME 
     */

    private Date occurTime;
    /**
     * 海拔       db_column: ALTITUDE 
     */

    private Integer altitude;
    /**
     * 夏令开始时间       db_column: SUMMERTIME_BEGIN 
     */

    private Date summertimeBegin;
    /**
     * 夏令结束时间       db_column: SUMMERTIME_END 
     */

    private Date summertimeEnd;
    /**
     * CIRAF       db_column: CIRAF 
     */
    private String ciraf;
    /**
     * 维护人       db_column: PERSON 
     */
    private String person;
    /**
     * 维护人电话       db_column: PERSON_PHONE 
     */
    private String personPhone;
    /**
     * 联系人       db_column: PRINCIPAL 
     */
    private String principal;
    /**
     * 联系人电话       db_column: PRINCIPAL_PHONE 
     */
    private String principalPhone;
    /**
     * 时差       db_column: TIME_DIFF 
     */

    private Integer timeDiff;
    /**
     * 是否删除       db_column: IS_DELETE 
     */

    private Integer isDelete;
    /**
     * 默认语言       db_column: DEFAULT_LANGUAGE 
     */
    private String defaultLanguage;
    /**
     * x       db_column: X 
     */
    private String x;
    /**
     * y       db_column: Y 
     */
    private String y;
    /**
     * 101采集点，102遥控站       db_column: TYPE_ID 
     */

    private Integer typeId;
    /**
     * 站点下发地址       db_column: URL 
     */
    private String url;
    /**
     * 1:在线，0不在线       db_column: IS_ONLINE 
     */

    private Integer isOnline;
    /**
     * ??????????????????       db_column: MANUFACTURER 
     */
    private String manufacturer;
    /**
     * 服务区       db_column: SERVICE_NAME 
     */
    private String serviceName;
    /**
     * 职务       db_column: POST 
     */
    private String post;
    /**
     * 是否含有夏令时，0 无，1 有       db_column: SUMMERTIME 
     */
    private String summertime;
    /**
     * 图片地址
     */
    private String imgUrl ;
    /**
     * 用于存放子前端。
     */
    private List<ResHeadendTab> headendList=new ArrayList<ResHeadendTab>();

    /**
     * 存放所有设备编码。
     */
    private List<String> codes ;
    /**
     * 存放所有设备名称。
     */
    private List<String> shortnames ;
    //columns END

    public ResHeadendTab(){
    }

    public ResHeadendTab(
            Integer headId
    ){
        this.headId = headId;
    }

    public List<String> getCodes() {
        return codes;
    }

    public void setCodes(List<String> codes) {
        this.codes = codes;
    }

    public List<String> getShortnames() {
        return shortnames;
    }

    public void setShortnames(List<String> shortnames) {
        this.shortnames = shortnames;
    }

    public void setHeadId(Integer value) {
        this.headId = value;
    }

    public List<ResHeadendTab> getHeadendList() {
        return headendList;
    }

    public void setHeadendList(List<ResHeadendTab> headendList) {
        this.headendList = headendList;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getHeadId() {
        return this.headId;
    }
    public void setCode(String value) {
        this.code = value;
    }

    public String getCode() {
        return this.code;
    }
    public void setShortname(String value) {
        this.shortname = value;
    }

    public String getShortname() {
        return this.shortname;
    }
    public void setComId(String value) {
        this.comId = value;
    }

    public String getComId() {
        return this.comId;
    }
    public void setComProtocol(String value) {
        this.comProtocol = value;
    }

    public String getComProtocol() {
        return this.comProtocol;
    }
    public void setIp(String value) {
        this.ip = value;
    }

    public String getIp() {
        return this.ip;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String value) {
        this.latitude = value;
    }

    public String getLatitude() {
        return this.latitude;
    }
    public void setComphone(String value) {
        this.comphone = value;
    }

    public String getComphone() {
        return this.comphone;
    }
    public void setSite(String value) {
        this.site = value;
    }

    public String getSite() {
        return this.site;
    }
    public void setAddress(String value) {
        this.address = value;
    }

    public String getAddress() {
        return this.address;
    }
    public void setSiteStatus(String value) {
        this.siteStatus = value;
    }

    public String getSiteStatus() {
        return this.siteStatus;
    }
    public void setComStatus(String value) {
        this.comStatus = value;
    }

    public String getComStatus() {
        return this.comStatus;
    }
    public void setFaultStatus(String value) {
        this.faultStatus = value;
    }

    public String getFaultStatus() {
        return this.faultStatus;
    }
    public void setStationName(String value) {
        this.stationName = value;
    }

    public String getStationName() {
        return this.stationName;
    }
    public void setDescript(String value) {
        this.descript = value;
    }

    public String getDescript() {
        return this.descript;
    }
    public void setState(Integer value) {
        this.state = value;
    }

    public Integer getState() {
        return this.state;
    }
    public void setCountry(String value) {
        this.country = value;
    }

    public String getCountry() {
        return this.country;
    }
    public void setVersion(String value) {
        this.version = value;
    }

    public String getVersion() {
        return this.version;
    }


    public void setOccurTime(Date value) {
        this.occurTime = value;
    }

    public Date getOccurTime() {
        return this.occurTime;
    }
    public void setAltitude(Integer value) {
        this.altitude = value;
    }

    public Integer getAltitude() {
        return this.altitude;
    }


    public void setSummertimeBegin(Date value) {
        this.summertimeBegin = value;
    }

    public Date getSummertimeBegin() {
        return this.summertimeBegin;
    }


    public void setSummertimeEnd(Date value) {
        this.summertimeEnd = value;
    }

    public Date getSummertimeEnd() {
        return this.summertimeEnd;
    }
    public void setCiraf(String value) {
        this.ciraf = value;
    }

    public String getCiraf() {
        return this.ciraf;
    }
    public void setPerson(String value) {
        this.person = value;
    }

    public String getPerson() {
        return this.person;
    }
    public void setPersonPhone(String value) {
        this.personPhone = value;
    }

    public String getPersonPhone() {
        return this.personPhone;
    }
    public void setPrincipal(String value) {
        this.principal = value;
    }

    public String getPrincipal() {
        return this.principal;
    }
    public void setPrincipalPhone(String value) {
        this.principalPhone = value;
    }

    public String getPrincipalPhone() {
        return this.principalPhone;
    }
    public void setTimeDiff(Integer value) {
        this.timeDiff = value;
    }

    public Integer getTimeDiff() {
        return this.timeDiff;
    }
    public void setIsDelete(Integer value) {
        this.isDelete = value;
    }

    public Integer getIsDelete() {
        return this.isDelete;
    }
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }
    public void setX(String value) {
        this.x = value;
    }

    public String getX() {
        return this.x;
    }
    public void setY(String value) {
        this.y = value;
    }

    public String getY() {
        return this.y;
    }
    public void setTypeId(Integer value) {
        this.typeId = value;
    }

    public Integer getTypeId() {
        return this.typeId;
    }
    public void setUrl(String value) {
        this.url = value;
    }

    public String getUrl() {
        return this.url;
    }
    public void setIsOnline(Integer value) {
        this.isOnline = value;
    }

    public Integer getIsOnline() {
        return this.isOnline;
    }
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    public String getServiceName() {
        return this.serviceName;
    }
    public void setPost(String value) {
        this.post = value;
    }

    public String getPost() {
        return this.post;
    }
    public void setSummertime(String value) {
        this.summertime = value;
    }

    public String getSummertime() {
        return this.summertime;
    }



    public int hashCode() {
        return new HashCodeBuilder()
                .append(getHeadId())
                .toHashCode();
    }

    public boolean equals(Object obj) {
        if(obj instanceof ResHeadendTab == false) return false;
        if(this == obj) return true;
        ResHeadendTab other = (ResHeadendTab)obj;
        return new EqualsBuilder()
                .append(getHeadId(),other.getHeadId())
                .isEquals();
    }
}

