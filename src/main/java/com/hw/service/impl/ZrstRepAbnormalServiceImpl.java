
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepAbnormalTab;
import com.hw.domain.po.query.ZrstRepAbnormalTabQuery;
import com.hw.mapper.ZrstRepAbnormalTabMapper;
import com.hw.service.ZrstRepAbnormalService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZrstRepAbnormalServiceImpl implements ZrstRepAbnormalService {

	private ZrstRepAbnormalTabMapper dao;

	@Override
	public Integer insert(ZrstRepAbnormalTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZrstRepAbnormalTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(ZrstRepAbnormalTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ZrstRepAbnormalTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZrstRepAbnormalTab bean) {
		return dao.delete(bean);
	}
}
