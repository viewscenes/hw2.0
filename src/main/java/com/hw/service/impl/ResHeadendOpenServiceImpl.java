
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResHeadendOpenTab;
import com.hw.domain.po.query.ResHeadendOpenTabQuery;
import com.hw.mapper.ResHeadendOpenTabMapper;
import com.hw.service.ResHeadendOpenService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ResHeadendOpenServiceImpl implements ResHeadendOpenService {

	private ResHeadendOpenTabMapper dao;

	@Override
	public Integer insert(ResHeadendOpenTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ResHeadendOpenTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(ResHeadendOpenTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ResHeadendOpenTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ResHeadendOpenTab bean) {
		return dao.delete(bean);
	}
}
