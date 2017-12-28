
package com.hw.service.module.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.SecOperationTab;
import com.hw.domain.po.query.SecOperationTabQuery;
import com.hw.mapper.SecOperationTabMapper;
import com.hw.service.module.SecOperationService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SecOperationServiceImpl implements SecOperationService {

	private SecOperationTabMapper dao;

	@Override
	public Integer insert(SecOperationTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(SecOperationTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(SecOperationTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public SecOperationTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(SecOperationTab bean) {
		return dao.delete(bean);
	}

    @Override
    public List<SecOperationTab> getChildrenByQueryParamter(SecOperationTabQuery query) {
        return dao.getChildrenByQueryParamter(query);
    }

    @Override
    public List<SecOperationTab> getAllOperationByBroadcastType(Integer broadcastType) {
        return dao.getAllOperationByBroadcastType(broadcastType);
    }
}
