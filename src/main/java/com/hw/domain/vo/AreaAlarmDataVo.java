package com.hw.domain.vo;



import com.hw.domain.po.RadioEquAlarmTab;
import com.hw.domain.po.RadioQualityAlarmTab;

import java.io.Serializable;
import java.util.List;


public class AreaAlarmDataVo implements Serializable,Comparable {

    private static final long serialVersionUID = 1L;

    private Integer id;//大洲id
    private String name;//大洲名称
    private Integer alarmCountValue;//大洲报警站点数量;
    private List<RadioEquAlarmTab> equAlarmList;//设备报警站点
    private List<RadioQualityAlarmTab> qualityAlarmList;//指标报警站点;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<RadioEquAlarmTab> getEquAlarmList() {
        return equAlarmList;
    }

    public void setEquAlarmList(List<RadioEquAlarmTab> equAlarmList) {
        this.equAlarmList = equAlarmList;
    }

    public List<RadioQualityAlarmTab> getQualityAlarmList() {
        return qualityAlarmList;
    }

    public void setQualityAlarmList(List<RadioQualityAlarmTab> qualityAlarmList) {
        this.qualityAlarmList = qualityAlarmList;
    }

    public Integer getAlarmCountValue() {
        return alarmCountValue;
    }

    public void setAlarmCountValue(Integer alarmCountValue) {
        this.alarmCountValue = alarmCountValue;
    }

    @Override
    public int compareTo(Object o) {
        return this.alarmCountValue.compareTo(((AreaAlarmDataVo)o).getAlarmCountValue());
    }
}
