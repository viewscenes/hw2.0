
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioEquInitParamTab;
import com.hw.domain.po.query.RadioEquInitParamTabQuery;
import com.hw.mapper.RadioEquInitParamTabMapper;
import com.hw.service.RadioEquInitParamService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioEquInitParamServiceImpl implements RadioEquInitParamService {

	private RadioEquInitParamTabMapper dao;

	@Override
	public Integer insert(RadioEquInitParamTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioEquInitParamTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(RadioEquInitParamTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioEquInitParamTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioEquInitParamTab bean) {
		return dao.delete(bean);
	}
}
