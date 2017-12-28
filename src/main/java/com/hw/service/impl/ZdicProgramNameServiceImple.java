
package com.hw.service.impl;


import com.hw.domain.po.ZdicProgramNameTab;
import com.hw.domain.po.query.ZdicProgramNameTabQuery;
import com.hw.mapper.ZdicProgramNameTabMapper;
import com.hw.service.ZdicProgramNameService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZdicProgramNameServiceImple implements ZdicProgramNameService {

	private ZdicProgramNameTabMapper dao;

	@Override
	public Integer insert(ZdicProgramNameTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZdicProgramNameTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ZdicProgramNameTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ZdicProgramNameTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZdicProgramNameTab bean) {
		return dao.delete(bean);
	}
}
