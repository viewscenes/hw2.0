
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioEquAlarmTab;
import com.hw.domain.po.query.RadioEquAlarmTabQuery;
import com.hw.mapper.RadioEquAlarmTabMapper;
import com.hw.service.RadioEquAlarmService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioEquAlarmServiceImpl implements RadioEquAlarmService {

	private RadioEquAlarmTabMapper dao;

	@Override
	public Integer insert(RadioEquAlarmTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioEquAlarmTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(RadioEquAlarmTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioEquAlarmTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioEquAlarmTab bean) {
		return dao.delete(bean);
	}
}
