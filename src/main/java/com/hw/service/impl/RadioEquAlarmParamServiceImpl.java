
package com.hw.service.impl;


import com.hw.domain.po.RadioEquAlarmParamTab;
import com.hw.domain.po.query.RadioEquAlarmParamTabQuery;
import com.hw.mapper.RadioEquAlarmParamTabMapper;
import com.hw.service.RadioEquAlarmParamService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioEquAlarmParamServiceImpl implements RadioEquAlarmParamService {

	private RadioEquAlarmParamTabMapper dao;

	@Override
	public Integer insert(RadioEquAlarmParamTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioEquAlarmParamTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioEquAlarmParamTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioEquAlarmParamTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioEquAlarmParamTab bean) {
		return dao.delete(bean);
	}
}
