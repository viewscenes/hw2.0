
package com.hw.service.user.impl;


import com.hw.domain.po.SecUserRoleRelTab;
import com.hw.domain.po.query.SecUserRoleRelTabQuery;
import com.hw.mapper.SecUserRoleRelTabMapper;
import com.hw.service.user.SecUserRoleRelService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SecUserRoleRelServiceImpl implements SecUserRoleRelService {


	private SecUserRoleRelTabMapper dao;

	@Override
	public Integer insert(SecUserRoleRelTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(SecUserRoleRelTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(SecUserRoleRelTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public SecUserRoleRelTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(SecUserRoleRelTab bean) {
		return dao.delete(bean);
	}

    @Override
    public List<SecUserRoleRelTab> selectByUserId(Integer userId) {
        return dao.selectByUserId(userId);
    }
}
