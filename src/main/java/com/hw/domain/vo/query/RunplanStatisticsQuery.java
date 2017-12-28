
package com.hw.domain.vo.query;

import java.io.Serializable;
import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RunplanStatisticsQuery  implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 发射台 */
	private Integer stationId;
	/** 语言id */
    private Integer languageId;
    /** 服务区 */
    private String serviceArea;

    /** 播音时间 */
    private String palyTime;

    /** 季节代号 */
    private String seasonId;

    /** 开始时间 */
    private Date startTime;

    /** 开始时间 */
    private Date endTime;
    /** 统计类型 */
    private Integer type;
    /**
     * 运行图类型
     */
    private Integer runplanTypeId;

    public Integer getStationId() {
        return stationId;
    }

    public String getSeasonId() {
        return seasonId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getRunplanTypeId() {
        return runplanTypeId;
    }

    public void setRunplanTypeId(Integer runplanTypeId) {
        this.runplanTypeId = runplanTypeId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getPalyTime() {
        return palyTime;
    }

    public void setPalyTime(String palyTime) {
        this.palyTime = palyTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}

