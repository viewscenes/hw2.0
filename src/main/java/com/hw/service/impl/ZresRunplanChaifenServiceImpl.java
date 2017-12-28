
package com.hw.service.impl;


import com.hw.domain.po.ZresRunplanChaifenTab;
import com.hw.domain.po.query.ZresRunplanChaifenTabQuery;
import com.hw.mapper.ZresRunplanChaifenTabMapper;
import com.hw.service.ZresRunplanChaifenService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZresRunplanChaifenServiceImpl implements ZresRunplanChaifenService {

	private ZresRunplanChaifenTabMapper dao;

	@Override
	public Integer insert(ZresRunplanChaifenTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZresRunplanChaifenTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ZresRunplanChaifenTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ZresRunplanChaifenTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZresRunplanChaifenTab bean) {
		return dao.delete(bean);
	}
}
