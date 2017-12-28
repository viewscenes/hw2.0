
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResCityTab;
import com.hw.domain.po.query.ResCityTabQuery;
import com.hw.mapper.ResCityTabMapper;
import com.hw.service.ResCityService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ResCityServiceImpl implements ResCityService {

	private ResCityTabMapper dao;

	@Override
	public Integer insert(ResCityTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ResCityTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(ResCityTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ResCityTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ResCityTab bean) {
		return dao.delete(bean);
	}

    @Override
    public List<ResCityTab> getAllContryList() {
        return dao.getAllContryList();
    }

    @Override
    public List<ResCityTab> getCityByCountry(ResCityTabQuery query) {
        return dao.getCityByCountry(query);
    }
}
