
package com.hw.service.impl;


import com.hw.domain.po.ResAntennaTab;
import com.hw.domain.po.query.ResAntennaTabQuery;
import com.hw.mapper.ResAntennaTabMapper;
import com.hw.service.ResAntennaService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ResAntennaServiceImpl implements ResAntennaService {


	private ResAntennaTabMapper dao;

	@Override
	public Integer insert(ResAntennaTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ResAntennaTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ResAntennaTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ResAntennaTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ResAntennaTab bean) {
		return dao.delete(bean);
	}
}
