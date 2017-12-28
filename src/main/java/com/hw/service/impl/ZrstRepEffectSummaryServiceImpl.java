
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepEffectSummaryTab;
import com.hw.domain.po.query.ZrstRepEffectSummaryTabQuery;
import com.hw.mapper.ZrstRepEffectSummaryTabMapper;
import com.hw.service.ZrstRepEffectSummaryService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZrstRepEffectSummaryServiceImpl implements ZrstRepEffectSummaryService {

	private ZrstRepEffectSummaryTabMapper dao;

	@Override
	public Integer insert(ZrstRepEffectSummaryTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZrstRepEffectSummaryTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(ZrstRepEffectSummaryTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ZrstRepEffectSummaryTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZrstRepEffectSummaryTab bean) {
		return dao.delete(bean);
	}
}
