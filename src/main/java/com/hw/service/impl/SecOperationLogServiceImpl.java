
package com.hw.service.impl;


import com.hw.domain.po.SecOperationLogTab;
import com.hw.domain.po.query.SecOperationLogTabQuery;
import com.hw.mapper.SecOperationLogTabMapper;
import com.hw.service.SecOperationLogService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SecOperationLogServiceImpl implements SecOperationLogService {

	private SecOperationLogTabMapper dao;

	@Override
	public Integer insert(SecOperationLogTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(SecOperationLogTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(SecOperationLogTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public SecOperationLogTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(SecOperationLogTab bean) {
		return dao.delete(bean);
	}
}
