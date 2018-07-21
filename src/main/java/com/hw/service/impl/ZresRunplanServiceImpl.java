
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.common.enums.RunplanStatisticsTypeEnum;
import com.hw.common.utils.DateUtil;
import com.hw.domain.po.ZresRunplanTab;
import com.hw.domain.po.query.ZresRunplanTabQuery;
import com.hw.domain.vo.RunpalnStatisticsVo;
import com.hw.domain.vo.query.RunplanStatisticsQuery;
import com.hw.mapper.ZresRunplanTabMapper;
import com.hw.service.ZresRunplanService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZresRunplanServiceImpl implements ZresRunplanService {
  @Resource
	private ZresRunplanTabMapper dao;

	@Override
	public Integer insert(ZresRunplanTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZresRunplanTab bean) {
		return dao.update(bean);
	}

    @Override
    public Page selectPage(ZresRunplanTabQuery query) {
        return dao.selectPage(query);
    }

    @Override
	public List<ZresRunplanTab> selectList(ZresRunplanTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ZresRunplanTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZresRunplanTabQuery bean) {
		return dao.delete(bean);
	}

    @Override
    public List<RunpalnStatisticsVo> gjtStatistics(RunplanStatisticsQuery query) {

        ZresRunplanTabQuery dbquery= new ZresRunplanTabQuery();
        dbquery.setStationId(query.getStationId());
        dbquery.setLanguageId(query.getLanguageId());
        if(query.getPalyTime()!=null&&query.getPalyTime().length()>0)
        {
            if(query.getPalyTime().split("-").length==2)
            {
                dbquery.setStartTime(query.getPalyTime().split("-")[0]);
                dbquery.setEndTime(query.getPalyTime().split("-")[1]);
            }
        }
        dbquery.setSeasonId(query.getSeasonId());
        dbquery.setServiceArea(query.getServiceArea());
        /**
         * 按照发射台进行统计
         */
        if(RunplanStatisticsTypeEnum.STATION_STATISTICS.equals(query.getType()))
        {
            return this.transStationStatisticsObject(dao.selectList(dbquery));
        }
        return this.transStationStatisticsObject(dao.selectList(dbquery));
    }

    /**
     * 根据查询的信息转换成界面显示的对象
     * @param runplanList
     * @return
     */
    private List<RunpalnStatisticsVo> transStationStatisticsObject(List<ZresRunplanTab> runplanList) {
        List<RunpalnStatisticsVo> returnList =new ArrayList<RunpalnStatisticsVo>();
        Map<String, RunpalnStatisticsVo> play_map = new HashMap<String, RunpalnStatisticsVo>();

        if(runplanList.size()>0){
            for(int i=0;i<runplanList.size();i++){
                ZresRunplanTab runplan = runplanList.get(i);
                RunpalnStatisticsVo vo=null;
                if(runplan.getStationName()!=null&&runplan.getStartTime()!=null&&runplan.getEndTime()!=null)
                {
                    String start_time = runplan.getStartTime();
                    String end_time =runplan.getEndTime();
                    BigDecimal hours = DateUtil.getTimeHour(start_time.trim() + ":00", end_time.trim() + ":00");
                    if(play_map.get(runplan.getStationName())!=null)
                     {
                         vo=play_map.get(runplan.getStationName());
                         vo.setPlayCount(vo.getPlayCount()+1);
                         vo.setPlayTime(vo.getPlayTime().add(hours));
                         vo.setQualityCount(vo.getQualityCount() + 1);
                         vo.setQualityTime(vo.getQualityTime().add(hours));
                         vo.setEffectCount(vo.getEffectCount() + 1);
                         vo.setEffectTime(vo.getEffectTime().add(hours));
                         play_map.put(runplan.getStationName(),vo);
                    }else
                    {
                        vo =new RunpalnStatisticsVo();
                        vo.setPlayCount(1);
                        vo.setPlayTime(hours);
                        if(runplan.getMonArea()!=null)
                        {
                            vo.setQualityCount(1);
                            vo.setQualityTime(hours);
                        }else
                        {
                            vo.setQualityCount(0);
                            vo.setQualityTime(new BigDecimal(0));
                        }
                        if(runplan.getXgMonArea()!=null)
                        {
                            vo.setEffectCount(1);
                            vo.setEffectTime(hours);
                        }else
                        {
                            vo.setEffectCount(0);
                            vo.setEffectTime(new BigDecimal(0));
                        }
                        }
                        play_map.put(runplan.getStationName(),vo);
                    }

                }
            }
            RunpalnStatisticsVo total=new RunpalnStatisticsVo();//定义一个总的统计
            for (Map.Entry<String, RunpalnStatisticsVo> entry : play_map.entrySet()) {
                total.setTypeValue("总计");
                total.setPlayCount(total.getPlayCount()+entry.getValue().getPlayCount());
                total.setPlayTime(total.getPlayTime().add(entry.getValue().getPlayTime()));
                total.setQualityCount(total.getQualityCount()+entry.getValue().getQualityCount());
                total.setQualityTime(total.getQualityTime().add(entry.getValue().getQualityTime()));
                total.setEffectCount(total.getEffectCount()+entry.getValue().getEffectCount());
                total.setEffectTime(total.getEffectTime().add(entry.getValue().getEffectTime()));
                returnList.add(entry.getValue());
            }
        returnList.add(total);
        return returnList;
     }

    @Override
    public List<RunpalnStatisticsVo> hwldStatistics(RunplanStatisticsQuery query) {

        return null;
    }

  @Override
  public ZresRunplanTab getRunplanByTaskId(Integer taskId) {
    return dao.getRunplanByTaskId(taskId);
  }
}
