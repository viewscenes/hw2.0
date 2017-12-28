
package com.hw.service.impl;


import com.hw.domain.po.SmsSendstateTab;
import com.hw.domain.po.query.SmsSendstateTabQuery;
import com.hw.mapper.SmsSendstateTabMapper;
import com.hw.service.SmsSendstateService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SmsSendstateServiceImpl implements SmsSendstateService{

	private SmsSendstateTabMapper dao;

	@Override
	public Integer insert(SmsSendstateTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(SmsSendstateTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(SmsSendstateTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public SmsSendstateTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(SmsSendstateTab bean) {
		return dao.delete(bean);
	}
}
