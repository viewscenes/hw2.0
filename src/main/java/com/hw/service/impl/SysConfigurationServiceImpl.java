
package com.hw.service.impl;


import com.hw.domain.po.SysConfigurationTab;
import com.hw.domain.po.query.SysConfigurationTabQuery;
import com.hw.mapper.SysConfigurationTabMapper;
import com.hw.service.SysConfigurationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SysConfigurationServiceImpl
		implements SysConfigurationService{
    @Resource
	private SysConfigurationTabMapper dao;

	@Override
	public Integer insert(SysConfigurationTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(SysConfigurationTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(SysConfigurationTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public SysConfigurationTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(SysConfigurationTab bean) {
		return dao.delete(bean);
	}

	@Override
	public Integer checkDB() {
		return dao.checkDB();
	}

	@Override
	public String getLocVideoUrl() {
		return dao.getLocVideoUrl();
	}

	@Override
	public String getLocVideoLocation() {
		return dao.getLocVideoLocation();
	}
}
