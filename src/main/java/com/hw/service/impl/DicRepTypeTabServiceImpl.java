
package com.hw.service.impl;


import com.hw.domain.po.DicRepTypeTab;
import com.hw.domain.po.query.DicRepTypeTabQuery;
import com.hw.mapper.DicRepTypeTabMapper;
import com.hw.service.DicRepTypeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicRepTypeTabServiceImpl implements DicRepTypeService {


	private DicRepTypeTabMapper dao;

	@Override
	public Integer insert(DicRepTypeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicRepTypeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicRepTypeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicRepTypeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicRepTypeTab bean) {
		return dao.delete(bean);
	}
}
