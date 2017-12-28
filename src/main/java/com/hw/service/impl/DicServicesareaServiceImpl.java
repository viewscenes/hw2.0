
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.DicServicesareaTab;
import com.hw.domain.po.query.DicServicesareaTabQuery;
import com.hw.mapper.DicServicesareaTabMapper;
import com.hw.service.DicServicesareaService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service

public class DicServicesareaServiceImpl implements DicServicesareaService {

	private DicServicesareaTabMapper dao;

	@Override
	public Integer insert(DicServicesareaTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicServicesareaTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(DicServicesareaTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicServicesareaTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicServicesareaTab bean) {
		return dao.delete(bean);
	}
}
