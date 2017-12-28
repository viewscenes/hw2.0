
package com.hw.service.impl;


import com.hw.domain.po.DicReportTypeTab;
import com.hw.domain.po.query.DicReportTypeTabQuery;
import com.hw.mapper.DicReportTypeTabMapper;
import com.hw.service.DicReportTypeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicReportTypeServiceImpl implements DicReportTypeService {

	private DicReportTypeTabMapper dao;

	@Override
	public Integer insert(DicReportTypeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicReportTypeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicReportTypeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicReportTypeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicReportTypeTab bean) {
		return dao.delete(bean);
	}
}
