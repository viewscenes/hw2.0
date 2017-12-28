
package com.hw.service.impl;


import com.hw.domain.po.DicHeadendVersionTab;
import com.hw.domain.po.query.DicHeadendVersionTabQuery;
import com.hw.mapper.DicHeadendVersionTabMapper;
import com.hw.service.DicHeadendVersionService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicHeadendVersionServiceImpl implements DicHeadendVersionService {


	private DicHeadendVersionTabMapper dao;

	@Override
	public Integer insert(DicHeadendVersionTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicHeadendVersionTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicHeadendVersionTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicHeadendVersionTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicHeadendVersionTab bean) {
		return dao.delete(bean);
	}
}
