
package com.hw.service.impl;


import com.hw.domain.po.RadioEquEventTab;
import com.hw.domain.po.query.RadioEquEventTabQuery;
import com.hw.mapper.RadioEquEventTabMapper;
import com.hw.service.RadioEquEventService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioEquEventServiceImpl implements RadioEquEventService {

	private RadioEquEventTabMapper dao;

	@Override
	public Integer insert(RadioEquEventTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioEquEventTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioEquEventTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioEquEventTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioEquEventTab bean) {
		return dao.delete(bean);
	}
}
