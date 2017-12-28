
package com.hw.service.impl;


import com.hw.domain.po.DicEquLogTypeTab;
import com.hw.domain.po.query.DicEquLogTypeTabQuery;
import com.hw.mapper.DicEquLogTypeTabMapper;
import com.hw.service.DicEquLogTypeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicEquLogTypeServiceImpl implements DicEquLogTypeService {
	private DicEquLogTypeTabMapper dao;

	@Override
	public Integer insert(DicEquLogTypeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicEquLogTypeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicEquLogTypeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicEquLogTypeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicEquLogTypeTab bean) {
		return dao.delete(bean);
	}
}
