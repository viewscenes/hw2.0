
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.DicStateTab;
import com.hw.domain.po.query.DicStateTabQuery;
import com.hw.mapper.DicStateTabMapper;
import com.hw.service.DicStateService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicStateServiceImpl implements DicStateService {

	private DicStateTabMapper dao;

	@Override
	public Integer insert(DicStateTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicStateTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(DicStateTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicStateTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicStateTab bean) {
		return dao.delete(bean);
	}
}
