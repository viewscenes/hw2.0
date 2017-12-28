
package com.hw.service.impl;


import com.hw.domain.po.ZresRunplanHistoryTab;
import com.hw.domain.po.query.ZresRunplanHistoryTabQuery;
import com.hw.mapper.ZresRunplanHistoryTabMapper;
import com.hw.service.ZresRunplanHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZresRunplanHistoryServiceImpl implements ZresRunplanHistoryService {

	private ZresRunplanHistoryTabMapper dao;

	@Override
	public Integer insert(ZresRunplanHistoryTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZresRunplanHistoryTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ZresRunplanHistoryTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ZresRunplanHistoryTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZresRunplanHistoryTab bean) {
		return dao.delete(bean);
	}
}
