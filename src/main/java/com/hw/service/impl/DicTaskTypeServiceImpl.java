
package com.hw.service.impl;


import com.hw.domain.po.DicTaskTypeTab;
import com.hw.domain.po.query.DicTaskTypeTabQuery;
import com.hw.mapper.DicTaskTypeTabMapper;
import com.hw.service.DicTaskTypeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicTaskTypeServiceImpl implements DicTaskTypeService {


	private DicTaskTypeTabMapper dao;

	@Override
	public Integer insert(DicTaskTypeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicTaskTypeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicTaskTypeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicTaskTypeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicTaskTypeTab bean) {
		return dao.delete(bean);
	}
}
