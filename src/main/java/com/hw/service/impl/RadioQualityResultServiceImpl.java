
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioQualityResultTab;
import com.hw.domain.po.query.RadioQualityResultTabQuery;
import com.hw.mapper.RadioQualityResultTabMapper;
import com.hw.service.RadioQualityResultService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service

public class RadioQualityResultServiceImpl implements RadioQualityResultService {

	private RadioQualityResultTabMapper dao;

	@Override
	public Integer insert(RadioQualityResultTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioQualityResultTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(RadioQualityResultTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioQualityResultTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioQualityResultTab bean) {
		return dao.delete(bean);
	}
}
