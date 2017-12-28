
package com.hw.service.impl;


import com.hw.domain.po.ResHeadendAlarmTab;
import com.hw.domain.po.query.ResHeadendAlarmTabQuery;
import com.hw.mapper.ResHeadendAlarmTabMapper;
import com.hw.service.ResHeadendAlarmService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ResHeadendAlarmServiceImpl implements ResHeadendAlarmService {

	private ResHeadendAlarmTabMapper dao;

	@Override
	public Integer insert(ResHeadendAlarmTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ResHeadendAlarmTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ResHeadendAlarmTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ResHeadendAlarmTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ResHeadendAlarmTab bean) {
		return dao.delete(bean);
	}
}
