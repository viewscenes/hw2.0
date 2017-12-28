
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepTab;
import com.hw.domain.po.query.ZrstRepAbnormalTabQuery;
import com.hw.domain.po.query.ZrstRepEffectStatisticsTabQuery;
import com.hw.domain.po.query.ZrstRepEffectSummaryTabQuery;
import com.hw.domain.po.query.ZrstRepTabQuery;
import com.hw.mapper.ZrstRepTabMapper;
import com.hw.service.ZrstRepAbnormalService;
import com.hw.service.ZrstRepEffectStatisticsService;
import com.hw.service.ZrstRepEffectSummaryService;
import com.hw.service.ZrstRepService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZrstRepServiceImpl implements ZrstRepService{

	private ZrstRepTabMapper dao;

    @Resource
    private ZrstRepEffectStatisticsService zrstRepEffectStatisticsService;

    @Resource
    private ZrstRepAbnormalService zrstRepAbnormalService;

    @Resource
    private ZrstRepEffectSummaryService zrstRepEffectSummaryService;

	@Override
	public Integer insert(ZrstRepTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZrstRepTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ZrstRepTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ZrstRepTab selectById(Integer id) {
		return dao.selectById(id);
	}

    @Override
    public ZrstRepTab getReportFromStarttimeEndtimeReportType(ZrstRepTabQuery query) {
        return dao.getReportFromStarttimeEndtimeReportType(query);
    }

    @Override
	public Integer delete(ZrstRepTab bean) {
		return dao.delete(bean);
	}

    @Override
    public Page selectReportDetailList(ZrstRepTab report) {
        Page page =null;
           if(report.getTabName().equalsIgnoreCase("zrst_rep_effect_statistics_tab"))
           {
               ZrstRepEffectStatisticsTabQuery query =new ZrstRepEffectStatisticsTabQuery();
               query.setReportId(report.getReportId());
               page=   zrstRepEffectStatisticsService.selectList(query);
           }else if(report.getTabName().equalsIgnoreCase("zrst_rep_abnormal_tab"))
           {
               ZrstRepAbnormalTabQuery query =new ZrstRepAbnormalTabQuery();
               query.setReportId(report.getReportId());
               page= zrstRepAbnormalService.selectList(query);
           }
           else if(report.getTabName().equalsIgnoreCase("zrst_rep_effect_summary_tab"))
           {
               ZrstRepEffectSummaryTabQuery query =new ZrstRepEffectSummaryTabQuery();
               query.setReportId(report.getReportId());
               page= zrstRepEffectSummaryService.selectList(query);
           }
        return page;
    }
}
