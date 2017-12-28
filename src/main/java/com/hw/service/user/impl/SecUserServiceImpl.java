
package com.hw.service.user.impl;

import com.github.pagehelper.PageInfo;
import com.hw.domain.po.SecUserTab;
import com.hw.domain.po.query.SecUserTabQuery;
import com.hw.mapper.SecUserTabMaper;
import com.hw.service.user.SecUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SecUserServiceImpl implements SecUserService {
	@Resource
	private SecUserTabMaper secUserTabMaper;
	@Override
	public Integer insert(SecUserTab bean) {
		return secUserTabMaper.insert(bean);
	}

	@Override
	public Integer update(SecUserTab bean) {
		return secUserTabMaper.update(bean);
	}

	@Override
	public PageInfo selectList(SecUserTabQuery query) {
//		Page page  = PageHelper.startPage(query.getPageNum(),query.getPageSize(),true);
//		dao.selectList(query);
		return new PageInfo();
	}

	@Override
	public SecUserTab selectById(Integer id) {
		return secUserTabMaper.selectById(id);
	}

	@Override
	public SecUserTab selectOneUser(SecUserTabQuery query) {
		return secUserTabMaper.selectOneUser(query);
	}

	@Override
	public Integer delete(SecUserTab bean) {
		return secUserTabMaper.delete(bean);
	}
}
