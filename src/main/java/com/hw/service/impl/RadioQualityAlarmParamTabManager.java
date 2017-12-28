
package com.hw.service.impl;


import com.hw.domain.po.RadioQualityAlarmParamTab;
import com.hw.domain.po.query.RadioQualityAlarmParamTabQuery;
import com.hw.mapper.RadioQualityAlarmParamTabMapper;
import com.hw.service.RadioQualityAlarmParamService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioQualityAlarmParamTabManager implements RadioQualityAlarmParamService{


	private RadioQualityAlarmParamTabMapper dao;

	@Override
	public Integer insert(RadioQualityAlarmParamTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioQualityAlarmParamTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioQualityAlarmParamTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioQualityAlarmParamTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioQualityAlarmParamTab bean) {
		return dao.delete(bean);
	}
}
