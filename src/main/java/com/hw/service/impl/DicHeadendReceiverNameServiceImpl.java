
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.DicHeadendReceiverNameTab;
import com.hw.domain.po.query.DicHeadendReceiverNameTabQuery;
import com.hw.mapper.DicHeadendReceiverNameTabMapper;
import com.hw.service.DicHeadendReceiverNameService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicHeadendReceiverNameServiceImpl implements DicHeadendReceiverNameService {


	private DicHeadendReceiverNameTabMapper dao;

	@Override
	public Integer insert(DicHeadendReceiverNameTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicHeadendReceiverNameTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectList(DicHeadendReceiverNameTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicHeadendReceiverNameTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicHeadendReceiverNameTab bean) {
		return dao.delete(bean);
	}
}
