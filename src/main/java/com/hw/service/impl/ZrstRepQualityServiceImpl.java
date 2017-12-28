
package com.hw.service.impl;


import com.hw.domain.po.ZrstRepQualityTab;
import com.hw.domain.po.query.ZrstRepQualityTabQuery;
import com.hw.mapper.ZrstRepQualityTabMapper;
import com.hw.service.ZrstRepQualityService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZrstRepQualityServiceImpl implements ZrstRepQualityService {

	private ZrstRepQualityTabMapper dao;

	@Override
	public Integer insert(ZrstRepQualityTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZrstRepQualityTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ZrstRepQualityTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ZrstRepQualityTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZrstRepQualityTab bean) {
		return dao.delete(bean);
	}
}
