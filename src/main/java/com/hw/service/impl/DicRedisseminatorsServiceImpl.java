
package com.hw.service.impl;


import com.hw.domain.po.DicRedisseminatorsTab;
import com.hw.domain.po.query.DicRedisseminatorsTabQuery;
import com.hw.mapper.DicRedisseminatorsTabMapper;
import com.hw.service.DicRedisseminatorsService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicRedisseminatorsServiceImpl implements DicRedisseminatorsService {

	private DicRedisseminatorsTabMapper dao;

	@Override
	public Integer insert(DicRedisseminatorsTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicRedisseminatorsTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicRedisseminatorsTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicRedisseminatorsTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicRedisseminatorsTab bean) {
		return dao.delete(bean);
	}
}
