
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepEffectStatisticsTab;
import com.hw.domain.po.query.ZrstRepEffectStatisticsTabQuery;
import com.hw.mapper.ZrstRepEffectStatisticsTabMapper;
import com.hw.service.ZrstRepEffectStatisticsService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZrstRepEffectStatisticsServiceImpl implements ZrstRepEffectStatisticsService {

	private ZrstRepEffectStatisticsTabMapper dao;

	@Override
	public Integer insert(ZrstRepEffectStatisticsTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZrstRepEffectStatisticsTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(ZrstRepEffectStatisticsTabQuery query) {
		return dao.selectList(query);
	}

    @Override
    public List<ZrstRepEffectStatisticsTab> selectRepEffectStatisticsDetail(ZrstRepEffectStatisticsTabQuery query) {
        return dao.selectRepEffectStatisticsDetail(query);
    }

    @Override
	public ZrstRepEffectStatisticsTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZrstRepEffectStatisticsTab bean) {
		return dao.delete(bean);
	}
}
