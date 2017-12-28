package com.hw.service;



import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.vo.ScreenMidDataVo;
import com.hw.domain.vo.ScreenSidesDataVo;

import java.util.List;


public interface LargeScreenService {

    /**
     * 获取屏幕两侧数据
     * @param
     * @return
     */
    public ScreenSidesDataVo getScreenSidesData();

    /**
     * 获取屏幕中部数据
     * @return
     */
    public ScreenMidDataVo getScreenMidData();

    /**
     * 获取地图数据
     * @return
     */
    public List<ResHeadendTab> getHeadendMapData();
}
