
package com.hw.service.impl;


import com.hw.domain.po.DicAbnormalTypeTab;
import com.hw.domain.po.query.DicAbnormalTypeTabQuery;
import com.hw.mapper.DicAbnormalTypeTabMapper;
import com.hw.service.DicAbnormalTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicAbnormalTypeTabServiceImpl implements DicAbnormalTypeService {


	private DicAbnormalTypeTabMapper dao;


	@Override
	public Integer insert(DicAbnormalTypeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicAbnormalTypeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicAbnormalTypeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicAbnormalTypeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicAbnormalTypeTab bean) {
		return dao.delete(bean);
	}
}
