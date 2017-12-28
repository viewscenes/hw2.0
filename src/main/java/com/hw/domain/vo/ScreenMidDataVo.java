package com.hw.domain.vo;



import com.hw.domain.po.ResHeadendTab;

import java.io.Serializable;
import java.util.List;


public class ScreenMidDataVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<AreaDataVo> allAreaDataList;
    private List<ResHeadendTab> headendListAll;
    private List<ResHeadendTab> headendListCJD;
    private List<ResHeadendTab> headendListYKZ;
    private List<ResHeadendTab> headendListAlarm;
    private List<ResHeadendTab> headendListOnline;
    private List<ResHeadendTab> headendListOffline;

    public List<ResHeadendTab> getHeadendListAll() {
        return headendListAll;
    }

    public void setHeadendListAll(List<ResHeadendTab> headendListAll) {
        this.headendListAll = headendListAll;
    }

    public List<ResHeadendTab> getHeadendListOnline() {
        return headendListOnline;
    }

    public void setHeadendListOnline(List<ResHeadendTab> headendListOnline) {
        this.headendListOnline = headendListOnline;
    }

    public List<ResHeadendTab> getHeadendListOffline() {
        return headendListOffline;
    }

    public void setHeadendListOffline(List<ResHeadendTab> headendListOffline) {
        this.headendListOffline = headendListOffline;
    }

    public List<ResHeadendTab> getHeadendListCJD() {
        return headendListCJD;
    }

    public void setHeadendListCJD(List<ResHeadendTab> headendListCJD) {
        this.headendListCJD = headendListCJD;
    }

    public List<ResHeadendTab> getHeadendListYKZ() {
        return headendListYKZ;
    }

    public void setHeadendListYKZ(List<ResHeadendTab> headendListYKZ) {
        this.headendListYKZ = headendListYKZ;
    }

    public List<ResHeadendTab> getHeadendListAlarm() {
        return headendListAlarm;
    }

    public void setHeadendListAlarm(List<ResHeadendTab> headendListAlarm) {
        this.headendListAlarm = headendListAlarm;
    }

    public List<AreaDataVo> getAllAreaDataList() {
        return allAreaDataList;
    }

    public void setAllAreaDataList(List<AreaDataVo> allAreaDataList) {
        this.allAreaDataList = allAreaDataList;
    }
}
