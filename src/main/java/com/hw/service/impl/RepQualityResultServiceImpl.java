
package com.hw.service.impl;


import com.hw.domain.po.RepQualityResultTab;
import com.hw.domain.po.query.RepQualityResultTabQuery;
import com.hw.mapper.RepQualityResultTabMapper;
import com.hw.service.RepQualityResultService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RepQualityResultServiceImpl implements RepQualityResultService {

	private RepQualityResultTabMapper dao;

	@Override
	public Integer insert(RepQualityResultTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RepQualityResultTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RepQualityResultTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RepQualityResultTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RepQualityResultTab bean) {
		return dao.delete(bean);
	}
}
