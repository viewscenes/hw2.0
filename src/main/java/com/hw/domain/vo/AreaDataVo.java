package com.hw.domain.vo;

import java.io.Serializable;


public class AreaDataVo implements Serializable,Comparable {

    private static final long serialVersionUID = 1L;

    private Integer id;//大洲id
    private String name;//大洲名称
    private Integer countValue;//大洲站点总数量;
    private Integer cjdCountValue;//大洲采集点站点数量;
    private Integer ykzCountValue;//大洲遥控站站点数量;
    private Integer cjdAlarmCountValue;//大洲采集点报警站点数量;
    private Integer ykzAlarmCountValue;//大洲遥控站报警站点数量;


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

    public Integer getCountValue() {
        return countValue;
    }

    public void setCountValue(Integer countValue) {
        this.countValue = countValue;
    }

    public Integer getCjdCountValue() {
        return cjdCountValue;
    }

    public void setCjdCountValue(Integer cjdCountValue) {
        this.cjdCountValue = cjdCountValue;
    }

    public Integer getYkzCountValue() {
        return ykzCountValue;
    }

    public void setYkzCountValue(Integer ykzCountValue) {
        this.ykzCountValue = ykzCountValue;
    }

    public Integer getCjdAlarmCountValue() {
        return cjdAlarmCountValue;
    }

    public void setCjdAlarmCountValue(Integer cjdAlarmCountValue) {
        this.cjdAlarmCountValue = cjdAlarmCountValue;
    }

    public Integer getYkzAlarmCountValue() {
        return ykzAlarmCountValue;
    }

    public void setYkzAlarmCountValue(Integer ykzAlarmCountValue) {
        this.ykzAlarmCountValue = ykzAlarmCountValue;
    }

    @Override
    public int compareTo(Object o) {
        return this.countValue.compareTo(((AreaDataVo)o).getCountValue());
    }
}
