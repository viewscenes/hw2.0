
package com.hw.service.impl;


import com.hw.domain.po.SysAsrRunConfigTab;
import com.hw.domain.po.query.SysAsrRunConfigTabQuery;
import com.hw.mapper.SysAsrRunConfigTabMapper;
import com.hw.service.SysAsrRunConfigService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SysAsrRunConfigServiceImpl implements SysAsrRunConfigService {

	private SysAsrRunConfigTabMapper dao;

	@Override
	public Integer insert(SysAsrRunConfigTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(SysAsrRunConfigTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(SysAsrRunConfigTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public SysAsrRunConfigTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(SysAsrRunConfigTab bean) {
		return dao.delete(bean);
	}
}
