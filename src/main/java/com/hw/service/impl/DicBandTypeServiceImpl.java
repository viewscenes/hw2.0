
package com.hw.service.impl;


import com.hw.domain.po.DicBandTypeTab;
import com.hw.domain.po.query.DicBandTypeTabQuery;
import com.hw.mapper.DicBandTypeTabMapper;
import com.hw.service.DicBandTypeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicBandTypeServiceImpl implements DicBandTypeService {



	private DicBandTypeTabMapper dao;

	@Override
	public Integer insert(DicBandTypeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicBandTypeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicBandTypeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicBandTypeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicBandTypeTab bean) {
		return dao.delete(bean);
	}
}
