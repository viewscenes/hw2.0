
package com.hw.service.impl;


import com.hw.domain.po.RadioQualityRealtimeTab;
import com.hw.domain.po.query.RadioQualityRealtimeTabQuery;
import com.hw.mapper.RadioQualityRealtimeTabMapper;
import com.hw.service.RadioQualityRealtimeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioQualityRealtimeServiceImpl implements RadioQualityRealtimeService {

	private RadioQualityRealtimeTabMapper dao;

	@Override
	public Integer insert(RadioQualityRealtimeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioQualityRealtimeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioQualityRealtimeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioQualityRealtimeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioQualityRealtimeTab bean) {
		return dao.delete(bean);
	}
}
