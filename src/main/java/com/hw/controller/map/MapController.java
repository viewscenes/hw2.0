/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */


package com.hw.controller.map;


import com.hw.common.enums.HeadTypeEnum;
import com.hw.common.enums.LogTypeEnum;
import com.hw.common.utils.Result;
import com.hw.common.utils.ResultFactory;
import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.po.StateStatistics;
import com.hw.service.LargeScreenService;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Controller
@RequestMapping("/map")
public class MapController {

    private static final Log log  = LogTypeEnum.DEFAULT.getLog();
    private static final Log unLog  = LogTypeEnum.DEVICEUNTREATEDLOG.getLog();

    @Resource
    private LargeScreenService largeScreenService;

    @RequestMapping(value = "/getMapData")
    @ResponseBody
    public Result getMidData(){
        Result result = null;
        try{
            List<ResHeadendTab> resHeadendTabList=largeScreenService.getHeadendMapData();
            if (resHeadendTabList != null && resHeadendTabList.size() > 0) {

                result =  ResultFactory.getSuccessResult();
                result.setObject(resHeadendTabList);
            } else {
                result =  ResultFactory.getErrorResult("查询站点地图数据失败!");
            }

        } catch (Exception e) {
            log.error("查询站点地图数据失败", e);
            result =  ResultFactory.getErrorResult("查询站点地图数据失败!");
        }
        return result;

    }
    /**
     * 根据大洲类型获取对应的大洲站点。
     * @param list
     * @param state
     * @return
     */
     public static StateStatistics getHeadendListByState(List<ResHeadendTab> list , Integer state)
    {
        StateStatistics stateStatistics =new StateStatistics();
        List<ResHeadendTab> allList =new ArrayList<ResHeadendTab>();
        List<ResHeadendTab> cjdList =new ArrayList<ResHeadendTab>();
        List<ResHeadendTab> ykzList =new ArrayList<ResHeadendTab>();
         for(int i=0;i<list.size();i++)
         {
             if(list.get(i).getState()!=null&&list.get(i).getState().equals(state))
             {
                  if(list.get(i).getTypeId().equals(HeadTypeEnum.CJD))
                  {
                      cjdList.add(list.get(i));
                  }else
                  {
                      ykzList.add(list.get(i));
                  }

                 allList.add(list.get(i));
             }
         }
        stateStatistics.setAllHeadendList(allList);
        stateStatistics.setCjdHeadendList(cjdList);
        stateStatistics.setYkzHeadendList(ykzList);
        return stateStatistics;
    }

}

