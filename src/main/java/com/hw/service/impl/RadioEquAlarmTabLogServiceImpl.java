
package com.hw.service.impl;


import com.hw.domain.po.RadioEquAlarmTabLog;
import com.hw.domain.po.query.RadioEquAlarmTabLogQuery;
import com.hw.mapper.RadioEquAlarmTabLogMapper;
import com.hw.service.RadioEquAlarmTabLogService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioEquAlarmTabLogServiceImpl implements RadioEquAlarmTabLogService {

	private RadioEquAlarmTabLogMapper dao;

	@Override
	public Integer insert(RadioEquAlarmTabLog bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioEquAlarmTabLog bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioEquAlarmTabLogQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioEquAlarmTabLog selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioEquAlarmTabLog bean) {
		return dao.delete(bean);
	}
}
