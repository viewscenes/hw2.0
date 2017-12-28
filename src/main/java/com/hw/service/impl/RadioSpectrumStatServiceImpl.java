
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioSpectrumStatTab;
import com.hw.domain.po.query.RadioSpectrumStatTabQuery;
import com.hw.mapper.RadioSpectrumStatTabMapper;
import com.hw.service.RadioSpectrumStatService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioSpectrumStatServiceImpl implements RadioSpectrumStatService {

	private RadioSpectrumStatTabMapper dao;

	@Override
	public Integer insert(RadioSpectrumStatTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioSpectrumStatTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(RadioSpectrumStatTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioSpectrumStatTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioSpectrumStatTab bean) {
		return dao.delete(bean);
	}
}
