
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioSubTaskTab;
import com.hw.domain.po.query.RadioSubTaskTabQuery;
import com.hw.mapper.RadioSubTaskTabMapper;
import com.hw.service.RadioSubTaskService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioSubTaskServiceImpl implements RadioSubTaskService {


	private RadioSubTaskTabMapper dao;

	@Override
	public Integer insert(RadioSubTaskTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioSubTaskTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(RadioSubTaskTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioSubTaskTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioSubTaskTab bean) {
		return dao.delete(bean);
	}
}
