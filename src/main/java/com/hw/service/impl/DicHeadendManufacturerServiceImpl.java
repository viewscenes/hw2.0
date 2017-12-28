
package com.hw.service.impl;


import com.hw.domain.po.DicHeadendManufacturerTab;
import com.hw.domain.po.query.DicHeadendManufacturerTabQuery;
import com.hw.mapper.DicHeadendManufacturerTabMapper;
import com.hw.service.DicHeadendManufacturerService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicHeadendManufacturerServiceImpl implements DicHeadendManufacturerService{

	private DicHeadendManufacturerTabMapper dao;

	@Override
	public Integer insert(DicHeadendManufacturerTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicHeadendManufacturerTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicHeadendManufacturerTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicHeadendManufacturerTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicHeadendManufacturerTab bean) {
		return dao.delete(bean);
	}
}
