
package com.hw.service.impl;


import com.hw.domain.po.ResImportdataTab;
import com.hw.domain.po.query.ResImportdataTabQuery;
import com.hw.mapper.ResImportdataTabMapper;
import com.hw.service.ResImportdataService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ResImportdataServiceImpl implements ResImportdataService {

	private ResImportdataTabMapper dao;

	@Override
	public Integer insert(ResImportdataTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ResImportdataTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ResImportdataTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ResImportdataTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ResImportdataTab bean) {
		return dao.delete(bean);
	}
}
