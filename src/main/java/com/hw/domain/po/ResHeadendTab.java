package com.hw.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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

@Data
@AllArgsConstructor
@NoArgsConstructor
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


}

