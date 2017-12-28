
package com.hw.service.impl;


import com.hw.domain.po.RadioOffsetResultTab;
import com.hw.domain.po.query.RadioOffsetResultTabQuery;
import com.hw.mapper.RadioOffsetResultTabMapper;
import com.hw.service.RadioOffsetResultService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service

public class RadioOffsetResultServiceImpl implements RadioOffsetResultService {

	private RadioOffsetResultTabMapper dao;

	@Override
	public Integer insert(RadioOffsetResultTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioOffsetResultTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioOffsetResultTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioOffsetResultTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioOffsetResultTab bean) {
		return dao.delete(bean);
	}
}
