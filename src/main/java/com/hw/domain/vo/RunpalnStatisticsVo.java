package com.hw.domain.vo;


import java.io.Serializable;
import java.math.BigDecimal;


public class RunpalnStatisticsVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String typeValue;

    private Integer playCount;

    private BigDecimal playTime;

    private Integer qualityCount;

    private BigDecimal qualityTime;

    private Integer effectCount;

    private BigDecimal effectTime;

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }

    public Integer getPlayCount() {
        return playCount;
    }

    public void setPlayCount(Integer playCount) {
        this.playCount = playCount;
    }

    public BigDecimal getPlayTime() {
        return playTime;
    }

    public void setPlayTime(BigDecimal playTime) {
        this.playTime = playTime;
    }

    public Integer getQualityCount() {
        return qualityCount;
    }

    public void setQualityCount(Integer qualityCount) {
        this.qualityCount = qualityCount;
    }

    public BigDecimal getQualityTime() {
        return qualityTime;
    }

    public void setQualityTime(BigDecimal qualityTime) {
        this.qualityTime = qualityTime;
    }

    public Integer getEffectCount() {
        return effectCount;
    }

    public void setEffectCount(Integer effectCount) {
        this.effectCount = effectCount;
    }

    public BigDecimal getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(BigDecimal effectTime) {
        this.effectTime = effectTime;
    }
}
