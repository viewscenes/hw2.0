
package com.hw.service.impl;


import com.hw.domain.po.RadioEquInstallTab;
import com.hw.domain.po.query.RadioEquInstallTabQuery;
import com.hw.mapper.RadioEquInstallTabMapper;
import com.hw.service.RadioEquInstallService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioEquInstallServiceImpl implements RadioEquInstallService{


	private RadioEquInstallTabMapper dao;

	@Override
	public Integer insert(RadioEquInstallTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioEquInstallTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioEquInstallTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioEquInstallTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioEquInstallTab bean) {
		return dao.delete(bean);
	}
}
