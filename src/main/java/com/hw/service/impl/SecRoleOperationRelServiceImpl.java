
package com.hw.service.impl;


import com.hw.domain.po.SecRoleOperationRelTab;
import com.hw.domain.po.query.SecRoleOperationRelTabQuery;
import com.hw.mapper.SecRoleOperationRelTabMapper;
import com.hw.service.SecRoleOperationRelService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SecRoleOperationRelServiceImpl implements SecRoleOperationRelService{

	private SecRoleOperationRelTabMapper dao;

	@Override
	public Integer insert(SecRoleOperationRelTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(SecRoleOperationRelTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(SecRoleOperationRelTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public SecRoleOperationRelTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(SecRoleOperationRelTab bean) {
		return dao.delete(bean);
	}
}
