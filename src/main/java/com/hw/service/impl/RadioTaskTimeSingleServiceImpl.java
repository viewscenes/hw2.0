
package com.hw.service.impl;


import com.hw.domain.po.RadioTaskTimeSingleTab;
import com.hw.domain.po.query.RadioTaskTimeSingleTabQuery;
import com.hw.mapper.RadioTaskTimeSingleTabMapper;
import com.hw.service.RadioTaskTimeSingleService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioTaskTimeSingleServiceImpl implements RadioTaskTimeSingleService {

	private RadioTaskTimeSingleTabMapper dao;

	@Override
	public Integer insert(RadioTaskTimeSingleTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioTaskTimeSingleTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioTaskTimeSingleTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioTaskTimeSingleTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioTaskTimeSingleTab bean) {
		return dao.delete(bean);
	}
}
