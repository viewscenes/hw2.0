
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZresRunplanDisturbTab;
import com.hw.domain.po.query.ZresRunplanDisturbTabQuery;
import com.hw.mapper.ZresRunplanDisturbTabMapper;
import com.hw.service.ZresRunplanDisturbService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZresRunplanDisturbServiceImpl implements ZresRunplanDisturbService {

	private ZresRunplanDisturbTabMapper dao;

	@Override
	public Integer insert(ZresRunplanDisturbTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZresRunplanDisturbTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectPage(ZresRunplanDisturbTabQuery query) {
		return dao.selectPage(query);
	}

    @Override
    public List<ZresRunplanDisturbTab> selectList(ZresRunplanDisturbTabQuery query) {
        return dao.selectList(query);
    }

    @Override
	public ZresRunplanDisturbTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZresRunplanDisturbTab bean) {
		return dao.delete(bean);
	}
}
