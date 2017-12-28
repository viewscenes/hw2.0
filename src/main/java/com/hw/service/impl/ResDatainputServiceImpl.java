
package com.hw.service.impl;


import com.hw.domain.po.ResDatainputTab;
import com.hw.domain.po.query.ResDatainputTabQuery;
import com.hw.mapper.ResDatainputTabMapper;
import com.hw.service.ResDatainputService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ResDatainputServiceImpl implements ResDatainputService {

	private ResDatainputTabMapper dao;

	@Override
	public Integer insert(ResDatainputTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ResDatainputTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ResDatainputTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ResDatainputTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ResDatainputTab bean) {
		return dao.delete(bean);
	}
}
