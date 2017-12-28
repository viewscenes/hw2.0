
package com.hw.service.impl;


import com.hw.domain.po.DicSunspotTab;
import com.hw.domain.po.query.DicSunspotTabQuery;
import com.hw.mapper.DicSunspotTabMapper;
import com.hw.service.DicSunspotService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicSunspotServiceImpl implements DicSunspotService {


	private DicSunspotTabMapper dao;

	@Override
	public Integer insert(DicSunspotTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicSunspotTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicSunspotTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicSunspotTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicSunspotTab bean) {
		return dao.delete(bean);
	}
}
