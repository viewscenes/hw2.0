
package com.hw.service.impl;


import com.hw.domain.po.RadioMessageReportTab;
import com.hw.domain.po.query.RadioMessageReportTabQuery;
import com.hw.mapper.RadioMessageReportTabMapper;
import com.hw.service.RadioMessageReportService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioMessageReportServiceImpl implements RadioMessageReportService {

	private RadioMessageReportTabMapper dao;

	@Override
	public Integer insert(RadioMessageReportTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioMessageReportTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioMessageReportTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioMessageReportTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioMessageReportTab bean) {
		return dao.delete(bean);
	}
}

