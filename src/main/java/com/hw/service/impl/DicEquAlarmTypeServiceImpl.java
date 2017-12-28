
package com.hw.service.impl;


import com.hw.domain.po.DicEquAlarmTypeTab;
import com.hw.domain.po.query.DicEquAlarmTypeTabQuery;
import com.hw.mapper.DicEquAlarmTypeTabMapper;
import com.hw.service.DicEquAlarmTypeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicEquAlarmTypeServiceImpl implements DicEquAlarmTypeService {



	private DicEquAlarmTypeTabMapper dao;

	@Override
	public Integer insert(DicEquAlarmTypeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicEquAlarmTypeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicEquAlarmTypeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicEquAlarmTypeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicEquAlarmTypeTab bean) {
		return dao.delete(bean);
	}
}
