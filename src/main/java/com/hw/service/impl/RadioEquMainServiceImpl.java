
package com.hw.service.impl;


import com.hw.domain.po.RadioEquMainTab;
import com.hw.domain.po.query.RadioEquMainTabQuery;
import com.hw.mapper.RadioEquMainTabMapper;
import com.hw.service.RadioEquMainService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioEquMainServiceImpl implements RadioEquMainService {


	private RadioEquMainTabMapper dao;

	@Override
	public Integer insert(RadioEquMainTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioEquMainTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioEquMainTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioEquMainTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioEquMainTab bean) {
		return dao.delete(bean);
	}
}
