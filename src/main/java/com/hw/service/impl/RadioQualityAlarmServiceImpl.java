
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioQualityAlarmTab;
import com.hw.domain.po.query.RadioQualityAlarmTabQuery;
import com.hw.mapper.RadioQualityAlarmTabMapper;
import com.hw.service.RadioQualityAlarmService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioQualityAlarmServiceImpl implements RadioQualityAlarmService {


	private RadioQualityAlarmTabMapper dao;

	@Override
	public Integer insert(RadioQualityAlarmTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioQualityAlarmTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(RadioQualityAlarmTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioQualityAlarmTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioQualityAlarmTab bean) {
		return dao.delete(bean);
	}
}
