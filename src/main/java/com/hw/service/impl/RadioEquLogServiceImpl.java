
package com.hw.service.impl;


import com.hw.domain.po.RadioEquLogTab;
import com.hw.domain.po.query.RadioEquLogTabQuery;
import com.hw.mapper.RadioEquLogTabMapper;
import com.hw.service.RadioEquLogService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioEquLogServiceImpl implements RadioEquLogService {


	private RadioEquLogTabMapper dao;

	@Override
	public Integer insert(RadioEquLogTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioEquLogTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioEquLogTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioEquLogTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioEquLogTab bean) {
		return dao.delete(bean);
	}
}
