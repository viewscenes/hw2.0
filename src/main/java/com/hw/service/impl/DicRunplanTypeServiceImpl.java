
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.DicRunplanTypeTab;
import com.hw.domain.po.query.DicRunplanTypeTabQuery;
import com.hw.mapper.DicRunplanTypeTabMapper;
import com.hw.service.DicRunplanTypeService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicRunplanTypeServiceImpl implements DicRunplanTypeService {

	private DicRunplanTypeTabMapper dao;

	@Override
	public Integer insert(DicRunplanTypeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicRunplanTypeTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(DicRunplanTypeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicRunplanTypeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicRunplanTypeTab bean) {
		return dao.delete(bean);
	}
}
