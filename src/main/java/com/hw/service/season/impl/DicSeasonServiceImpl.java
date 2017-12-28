
package com.hw.service.season.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.DicSeasonTab;
import com.hw.domain.po.query.DicSeasonTabQuery;
import com.hw.mapper.DicSeasonTabMapper;
import com.hw.service.season.DicSeasonService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicSeasonServiceImpl implements DicSeasonService {

	private DicSeasonTabMapper dao;

	@Override
	public Integer insert(DicSeasonTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicSeasonTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectListPage(DicSeasonTabQuery query) {
		return dao.selectListPage(query);
	}

    @Override
    public List<DicSeasonTab> selectSeasonList(DicSeasonTabQuery query) {
        return dao.selectSeasonList(query);
    }

    @Override
	public DicSeasonTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicSeasonTab bean) {
		return dao.delete(bean);
	}
}
