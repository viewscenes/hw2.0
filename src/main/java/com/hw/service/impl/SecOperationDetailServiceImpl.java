
package com.hw.service.impl;


import com.hw.domain.po.SecOperationDetailTab;
import com.hw.domain.po.query.SecOperationDetailTabQuery;
import com.hw.mapper.SecOperationDetailTabMapper;
import com.hw.service.SecOperationDetailService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SecOperationDetailServiceImpl implements SecOperationDetailService {

	private SecOperationDetailTabMapper dao;

	@Override
	public Integer insert(SecOperationDetailTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(SecOperationDetailTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(SecOperationDetailTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public SecOperationDetailTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(SecOperationDetailTab bean) {
		return dao.delete(bean);
	}
}
