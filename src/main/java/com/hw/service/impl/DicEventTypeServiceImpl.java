
package com.hw.service.impl;


import com.hw.domain.po.DicEventTypeTab;
import com.hw.domain.po.query.DicEventTypeTabQuery;
import com.hw.mapper.DicEventTypeTabMapper;
import com.hw.service.DicEventTypeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicEventTypeServiceImpl implements DicEventTypeService {


	private DicEventTypeTabMapper dao;

	@Override
	public Integer insert(DicEventTypeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicEventTypeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicEventTypeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicEventTypeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicEventTypeTab bean) {
		return dao.delete(bean);
	}
}
