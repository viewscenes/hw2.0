
package com.hw.service.impl;


import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.po.query.ResHeadendTabQuery;
import com.hw.mapper.ResHeadendTabMapper;
import com.hw.service.ResHeadendService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ResHeadendServiceImpl implements ResHeadendService{

	private ResHeadendTabMapper dao;

	@Override
	public Integer insert(ResHeadendTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ResHeadendTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectHeadendPage(ResHeadendTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ResHeadendTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ResHeadendTab bean) {
		return dao.delete(bean);
	}

    @Override
    public List<ResHeadendTab> selectHeadendList(ResHeadendTabQuery query) {
        return dao.selectHeadendList(query);
    }

    @Override
    public List<ResHeadendTab> selectDistinctHeadendList(ResHeadendTabQuery query) {
        return dao.selectDistinctHeadendList(query);
    }
}
