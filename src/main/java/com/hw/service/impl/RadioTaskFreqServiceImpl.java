
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioTaskFreqTab;
import com.hw.domain.po.query.RadioTaskFreqTabQuery;
import com.hw.mapper.RadioTaskFreqTabMapper;
import com.hw.service.RadioTaskFreqService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioTaskFreqServiceImpl implements RadioTaskFreqService {

	private RadioTaskFreqTabMapper dao;

	@Override
	public Integer insert(RadioTaskFreqTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioTaskFreqTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(RadioTaskFreqTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioTaskFreqTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioTaskFreqTab bean) {
		return dao.delete(bean);
	}
}
