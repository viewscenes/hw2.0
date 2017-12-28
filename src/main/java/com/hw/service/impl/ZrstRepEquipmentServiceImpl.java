
package com.hw.service.impl;


import com.hw.domain.po.ZrstRepEquipmentTab;
import com.hw.domain.po.query.ZrstRepEquipmentTabQuery;
import com.hw.mapper.ZrstRepEquipmentTabMapper;
import com.hw.service.ZrstRepEquipmentService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZrstRepEquipmentServiceImpl implements ZrstRepEquipmentService{

	private ZrstRepEquipmentTabMapper dao;

	@Override
	public Integer insert(ZrstRepEquipmentTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZrstRepEquipmentTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(ZrstRepEquipmentTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ZrstRepEquipmentTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZrstRepEquipmentTab bean) {
		return dao.delete(bean);
	}
}
