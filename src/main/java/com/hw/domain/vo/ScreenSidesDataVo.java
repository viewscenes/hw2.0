package com.hw.domain.vo;



import com.hw.domain.po.ResHeadendTab;

import java.io.Serializable;
import java.util.List;


public class ScreenSidesDataVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<AreaAlarmDataVo> areaAlarmDataVoList;
    private List<ResHeadendTab> headendList;

    public List<ResHeadendTab> getHeadendList() {
        return headendList;
    }

    public void setHeadendList(List<ResHeadendTab> headendList) {
        this.headendList = headendList;
    }

    public List<AreaAlarmDataVo> getAreaAlarmDataVoList() {
        return areaAlarmDataVoList;
    }

    public void setAreaAlarmDataVoList(List<AreaAlarmDataVo> areaAlarmDataVoList) {
        this.areaAlarmDataVoList = areaAlarmDataVoList;
    }
}
