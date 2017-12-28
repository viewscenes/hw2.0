
package com.hw.service.impl;


import com.hw.domain.po.ResHeadendMonitorRuleTab;
import com.hw.domain.po.query.ResHeadendMonitorRuleTabQuery;
import com.hw.mapper.ResHeadendMonitorRuleTabMapper;
import com.hw.service.ResHeadendMonitorRuleService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ResHeadendMonitorRuleServiceImpl implements ResHeadendMonitorRuleService {

	private ResHeadendMonitorRuleTabMapper dao;

	@Override
	public Integer insert(ResHeadendMonitorRuleTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ResHeadendMonitorRuleTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ResHeadendMonitorRuleTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ResHeadendMonitorRuleTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ResHeadendMonitorRuleTab bean) {
		return dao.delete(bean);
	}
}
