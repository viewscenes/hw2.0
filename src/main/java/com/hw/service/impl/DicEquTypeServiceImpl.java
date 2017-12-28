
package com.hw.service.impl;


import com.hw.domain.po.DicEquTypeTab;
import com.hw.domain.po.query.DicEquTypeTabQuery;
import com.hw.mapper.DicEquTypeTabMapper;
import com.hw.service.DicEquTypeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicEquTypeServiceImpl implements DicEquTypeService{


	private DicEquTypeTabMapper dao;

	@Override
	public Integer insert(DicEquTypeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicEquTypeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicEquTypeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicEquTypeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicEquTypeTab bean) {
		return dao.delete(bean);
	}
}
