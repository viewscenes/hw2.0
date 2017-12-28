
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioSpectrumResultTab;
import com.hw.domain.po.query.RadioSpectrumResultTabQuery;
import com.hw.mapper.RadioSpectrumResultTabMapper;
import com.hw.service.RadioSpectrumResultService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioSpectrumResultServiceImpl implements RadioSpectrumResultService {

	private RadioSpectrumResultTabMapper dao;

	@Override
	public Integer insert(RadioSpectrumResultTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioSpectrumResultTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(RadioSpectrumResultTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioSpectrumResultTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioSpectrumResultTab bean) {
		return dao.delete(bean);
	}
}
