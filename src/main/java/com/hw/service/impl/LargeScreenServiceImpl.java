package com.hw.service.impl;




import com.hw.common.enums.HeadTypeEnum;
import com.hw.common.enums.LogTypeEnum;
import com.hw.common.enums.StateEnum;
import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.vo.AreaAlarmDataVo;
import com.hw.domain.vo.AreaDataVo;
import com.hw.domain.vo.ScreenMidDataVo;
import com.hw.domain.vo.ScreenSidesDataVo;
import com.hw.service.LargeScreenService;
import com.hw.service.ResHeadendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class LargeScreenServiceImpl implements LargeScreenService {
    private static final org.slf4j.Logger log  = LogTypeEnum.DEFAULT.getLog();
    @Resource
    private ResHeadendService resHeadendService;

    /**
     * 获取屏幕两侧数据
     * @param
     * @return
     */
    @Override
    public ScreenSidesDataVo getScreenSidesData( ) {
        return transDataResult2ScreenSidesDataVo();
    }


    /**
     * 获取屏幕中部数据
     * @return
     */
    @Override
    public ScreenMidDataVo getScreenMidData() {
        return createScreenMidData();
    }

    @Override
    public List<ResHeadendTab> getHeadendMapData() {
        log.info("-------------------获取屏幕mid数据----Begin----------------");
        List<ResHeadendTab> resHeadendList = new ArrayList<ResHeadendTab>();
        try{
            resHeadendList = createHeadendMapData();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        log.info("-------------------获取屏幕mid数据----End----------------");
        return resHeadendList;
    }

    /**
     * 创建ScreenMidDataVo
     * @return
     */
    private ScreenMidDataVo createScreenMidData(){
        log.info("-------------------获取屏幕mid数据----Begin----------------");
        ScreenMidDataVo screenMidDataVo = new ScreenMidDataVo();
        try{
            screenMidDataVo = createAllAreaDataList();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        log.info("-------------------获取屏幕mid数据----End----------------");
        return screenMidDataVo;
    }
    /**
     * 创建排序的AreaDataList
     * @return
     */
    private List<ResHeadendTab> createHeadendMapData(){

        List<ResHeadendTab> resHeadendList = resHeadendService.selectDistinctHeadendList(null);
        List<ResHeadendTab> resHeadendListAll = resHeadendService.selectHeadendList(null);
        resHeadendList=transHeadendList(resHeadendList,resHeadendListAll);
        return resHeadendList;
    }
    /**
     * 创建排序的AreaDataList
     * @return
     */
    private ScreenMidDataVo createAllAreaDataList(){
        ScreenMidDataVo screenMidDataVo = new ScreenMidDataVo();
        List<ResHeadendTab> resHeadendList = resHeadendService.selectDistinctHeadendList(null);
        List<ResHeadendTab> resHeadendListAll = resHeadendService.selectHeadendList(null);
        resHeadendList=transHeadendList(resHeadendList,resHeadendListAll);
        screenMidDataVo.setHeadendListAll(resHeadendList);

        List<AreaDataVo> areaDataVoList = new ArrayList<AreaDataVo>();
        Map<Integer, String> areaEnums = StateEnum.transferToMap();
        List<ResHeadendTab> headendListCJD=null;
        List<ResHeadendTab> headendListYKZ=null;
        for (Map.Entry<Integer, String> entry : areaEnums.entrySet()) {
            AreaDataVo areaDataVo =new AreaDataVo();
            areaDataVo.setId(entry.getKey());
            areaDataVo.setName(entry.getValue());
            int count=0;
            int cjdcount=0;
            int ykzcount=0;
            for(int i =0 ;i<resHeadendList.size();i++)
                if (resHeadendList.get(i).getState() != null && resHeadendList.get(i).getState().equals(areaDataVo.getId())) {
                    count++;
                    if (resHeadendList.get(i).getTypeId() != null && resHeadendList.get(i).getTypeId().equals(HeadTypeEnum.CJD.getValue())) {
                        cjdcount++;
                    } else if (resHeadendList.get(i).getTypeId() != null && resHeadendList.get(i).getTypeId().equals(HeadTypeEnum.YKZ.getValue())) {
                        ykzcount++;
                    }
                }
            areaDataVo.setCjdCountValue(cjdcount);
            areaDataVo.setYkzCountValue(ykzcount);
            areaDataVo.setCountValue(count);
            areaDataVoList.add(areaDataVo);
        }
        for(int i =0 ;i<resHeadendList.size();i++)
        {
                if (resHeadendList.get(i).getTypeId() != null && resHeadendList.get(i).getTypeId().equals(HeadTypeEnum.CJD.getValue())) {
                    headendListCJD.add(resHeadendList.get(i));
                } else if (resHeadendList.get(i).getTypeId() != null && resHeadendList.get(i).getTypeId().equals(HeadTypeEnum.YKZ.getValue())) {
                    headendListYKZ.add(resHeadendList.get(i));
                }

         }
        screenMidDataVo.setHeadendListCJD(headendListCJD);
        screenMidDataVo.setHeadendListYKZ(headendListYKZ);
        return screenMidDataVo;
    }
    private List<ResHeadendTab> transHeadendList(List<ResHeadendTab> resHeadendList , List<ResHeadendTab> resHeadendListAll)
    {
        for(int i=0;i<resHeadendList.size();i++)
        {
            for(int k=0;k<resHeadendListAll.size();k++)
            {
                if(resHeadendList.get(i).getSite().equals(resHeadendListAll.get(k).getSite()))
                {
                      resHeadendList.get(i).getHeadendList().add(resHeadendListAll.get(k));

                }
            }
        }
        return   resHeadendList;
    }
    /**
     * 转换屏幕两侧数据vo
     * @param
     * @return
     */
    private ScreenSidesDataVo transDataResult2ScreenSidesDataVo( ){
        log.info("-------------------获取屏幕Sides数据----Begin----------------");
        ScreenSidesDataVo screenSidesDataVo = new ScreenSidesDataVo();
        List<ResHeadendTab> resHeadendList = resHeadendService.selectHeadendList(null);
        screenSidesDataVo.setAreaAlarmDataVoList(createMissionDataVoList());
        screenSidesDataVo.setHeadendList(resHeadendList);
        log.info("-------------------获取屏幕Sides数据----End----------------");
        return screenSidesDataVo;
    }

    /**
     * 报警信息
     * @return
     */
    private List<AreaAlarmDataVo> createMissionDataVoList(){
        List<AreaAlarmDataVo> areaAlarmDataVoList = new ArrayList<AreaAlarmDataVo>();

        return areaAlarmDataVoList;
    }

}
