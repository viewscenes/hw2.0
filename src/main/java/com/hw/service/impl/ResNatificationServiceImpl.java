
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResNatificationTab;
import com.hw.domain.po.query.ResNatificationTabQuery;
import com.hw.mapper.ResNatificationTabMapper;
import com.hw.service.ResNatificationService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ResNatificationServiceImpl implements ResNatificationService {

	private ResNatificationTabMapper dao;

	@Override
	public Integer insert(ResNatificationTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ResNatificationTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(ResNatificationTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ResNatificationTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ResNatificationTab bean) {
		return dao.delete(bean);
	}
}
