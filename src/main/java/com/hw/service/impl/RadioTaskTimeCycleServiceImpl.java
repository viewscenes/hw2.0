
package com.hw.service.impl;


import com.hw.domain.po.RadioTaskTimeCycleTab;
import com.hw.domain.po.query.RadioTaskTimeCycleTabQuery;
import com.hw.mapper.RadioTaskTimeCycleTabMapper;
import com.hw.service.RadioTaskTimeCycleService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioTaskTimeCycleServiceImpl implements RadioTaskTimeCycleService {


	private RadioTaskTimeCycleTabMapper dao;

	@Override
	public Integer insert(RadioTaskTimeCycleTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioTaskTimeCycleTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioTaskTimeCycleTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioTaskTimeCycleTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioTaskTimeCycleTab bean) {
		return dao.delete(bean);
	}
}
