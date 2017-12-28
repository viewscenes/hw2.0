
package com.hw.service.impl;


import com.hw.domain.po.ResTaskUnitTab;
import com.hw.domain.po.query.ResTaskUnitTabQuery;
import com.hw.mapper.ResTaskUnitTabMapper;
import com.hw.service.ResTaskUnitService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ResTaskUnitServiceImpl implements ResTaskUnitService{

	private ResTaskUnitTabMapper dao;

	@Override
	public Integer insert(ResTaskUnitTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ResTaskUnitTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ResTaskUnitTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ResTaskUnitTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ResTaskUnitTab bean) {
		return dao.delete(bean);
	}
}
