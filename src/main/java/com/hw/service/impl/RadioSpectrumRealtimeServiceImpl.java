
package com.hw.service.impl;


import com.hw.domain.po.RadioSpectrumRealtimeTab;
import com.hw.domain.po.query.RadioSpectrumRealtimeTabQuery;
import com.hw.mapper.RadioSpectrumRealtimeTabMapper;
import com.hw.service.RadioSpectrumRealtimeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioSpectrumRealtimeServiceImpl implements RadioSpectrumRealtimeService {

	private RadioSpectrumRealtimeTabMapper dao;

	@Override
	public Integer insert(RadioSpectrumRealtimeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioSpectrumRealtimeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioSpectrumRealtimeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioSpectrumRealtimeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioSpectrumRealtimeTab bean) {
		return dao.delete(bean);
	}
}
