
package com.hw.domain.po.query;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
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
public class ResHeadendTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 前端id */
	private Integer headId;
	private List<Integer> headIdList;
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
	/** 是否含有夏令时，0 无，1 有 */
	private String summertime;

}

