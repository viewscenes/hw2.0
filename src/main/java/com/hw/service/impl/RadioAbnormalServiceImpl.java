
package com.hw.service.impl;


import com.hw.domain.po.RadioAbnormalTab;
import com.hw.domain.po.query.RadioAbnormalTabQuery;
import com.hw.mapper.RadioAbnormalTabMapper;
import com.hw.service.RadioAbnormalService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioAbnormalServiceImpl implements RadioAbnormalService {

	private RadioAbnormalTabMapper dao;

	@Override
	public Integer insert(RadioAbnormalTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioAbnormalTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioAbnormalTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioAbnormalTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioAbnormalTab bean) {
		return dao.delete(bean);
	}
}
