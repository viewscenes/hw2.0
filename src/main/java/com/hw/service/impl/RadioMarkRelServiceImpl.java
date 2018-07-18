
package com.hw.service.impl;


import com.hw.domain.po.RadioMarkRelTab;
import com.hw.mapper.RadioMarkRelTabMapper;
import com.hw.service.RadioMarkRelService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioMarkRelServiceImpl implements RadioMarkRelService {

	@Resource
	private RadioMarkRelTabMapper dao;


	@Override
	@Transactional
	public Integer update(RadioMarkRelTab bean) {
		return dao.update(bean);
	}

	@Override
	public List<RadioMarkRelTab> getNotMark() {
		return dao.getNotMark();
	}

	@Override
	@Transactional
	public Integer delete(RadioMarkRelTab bean) {
		return dao.delete(bean);
	}
}
