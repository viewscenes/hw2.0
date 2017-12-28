
package com.hw.service.impl;


import com.hw.domain.po.DicStationCityRelTab;
import com.hw.domain.po.query.DicStationCityRelTabQuery;
import com.hw.mapper.DicStationCityRelTabMapper;
import com.hw.service.DicStationCityRelService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicStationCityRelServiceImpl implements DicStationCityRelService{

	private DicStationCityRelTabMapper dao;

	@Override
	public Integer insert(DicStationCityRelTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicStationCityRelTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicStationCityRelTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicStationCityRelTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicStationCityRelTab bean) {
		return dao.delete(bean);
	}
}
