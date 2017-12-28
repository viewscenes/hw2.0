
package com.hw.service.impl;


import com.hw.domain.po.SecUserOperationCustomTab;
import com.hw.domain.po.query.SecUserOperationCustomTabQuery;
import com.hw.mapper.SecUserOperationCustomTabMapper;
import com.hw.service.SecUserOperationCustomService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SecUserOperationCustomServiceImpl implements SecUserOperationCustomService {

	private SecUserOperationCustomTabMapper dao;

	@Override
	public Integer insert(SecUserOperationCustomTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(SecUserOperationCustomTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(SecUserOperationCustomTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public SecUserOperationCustomTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(SecUserOperationCustomTab bean) {
		return dao.delete(bean);
	}
}
