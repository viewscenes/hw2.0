
package com.hw.service.impl;


import com.hw.domain.po.DicHeadendReceiverCodeTab;
import com.hw.domain.po.query.DicHeadendReceiverCodeTabQuery;
import com.hw.mapper.DicHeadendReceiverCodeTabMapper;
import com.hw.service.DicHeadendReceiverCodeService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicHeadendReceiverCodeServiceImpl implements DicHeadendReceiverCodeService {

	private DicHeadendReceiverCodeTabMapper dao;

	@Override
	public Integer insert(DicHeadendReceiverCodeTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(DicHeadendReceiverCodeTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(DicHeadendReceiverCodeTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public DicHeadendReceiverCodeTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(DicHeadendReceiverCodeTab bean) {
		return dao.delete(bean);
	}
}
