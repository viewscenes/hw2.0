
package com.hw.service.impl;


import com.hw.domain.po.RadioQualityAlarmTabLog;
import com.hw.domain.po.query.RadioQualityAlarmTabLogQuery;
import com.hw.mapper.RadioQualityAlarmTabLogMapper;
import com.hw.service.RadioQualityAlarmTabLogService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioQualityAlarmLogServiceImpl implements RadioQualityAlarmTabLogService{


	private RadioQualityAlarmTabLogMapper dao;

	@Override
	public Integer insert(RadioQualityAlarmTabLog bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioQualityAlarmTabLog bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioQualityAlarmTabLogQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioQualityAlarmTabLog selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioQualityAlarmTabLog bean) {
		return dao.delete(bean);
	}
}
