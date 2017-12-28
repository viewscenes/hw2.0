
package com.hw.service.impl;


import com.hw.domain.po.ZrstRepEffectViewTab;
import com.hw.domain.po.query.ZrstRepEffectViewTabQuery;
import com.hw.mapper.ZrstRepEffectViewTabMapper;
import com.hw.service.ZrstRepEffectViewService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZrstRepEffectViewServiceImpl implements ZrstRepEffectViewService {

	private ZrstRepEffectViewTabMapper dao;

	@Override
	public Integer insert(ZrstRepEffectViewTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZrstRepEffectViewTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ZrstRepEffectViewTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ZrstRepEffectViewTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZrstRepEffectViewTab bean) {
		return dao.delete(bean);
	}
}
