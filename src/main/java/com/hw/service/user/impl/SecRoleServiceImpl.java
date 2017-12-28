
package com.hw.service.user.impl;


import com.hw.domain.po.SecRoleTab;
import com.hw.domain.po.query.SecRoleTabQuery;
import com.hw.mapper.SecRoleTabMapper;
import com.hw.service.user.SecRoleService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SecRoleServiceImpl implements SecRoleService{

	private SecRoleTabMapper dao;

	@Override
	public Integer insert(SecRoleTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(SecRoleTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(SecRoleTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public SecRoleTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(SecRoleTab bean) {
		return dao.delete(bean);
	}
}
