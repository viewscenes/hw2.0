
package com.hw.service.impl;


import com.hw.domain.po.DicQualityAlarmTypeTab;
import com.hw.domain.po.query.DicQualityAlarmTypeTabQuery;
import com.hw.mapper.DicQualityAlarmTypeTabMapper;
import com.hw.service.DicQualityAlarmTypeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicQualityAlarmTypeServiceImpl implements DicQualityAlarmTypeService {


	private DicQualityAlarmTypeTabMapper dao;

	@Override
	public Integer insert(DicQualityAlarmTypeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicQualityAlarmTypeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicQualityAlarmTypeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicQualityAlarmTypeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicQualityAlarmTypeTab bean) {
		return dao.delete(bean);
	}
}
