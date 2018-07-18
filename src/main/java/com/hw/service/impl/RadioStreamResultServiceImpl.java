
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioStreamResultTab;
import com.hw.domain.po.query.RadioStreamResultTabQuery;
import com.hw.mapper.RadioStreamResultTabMapper;
import com.hw.service.RadioStreamResultService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioStreamResultServiceImpl implements RadioStreamResultService {

    @Resource
	private RadioStreamResultTabMapper dao;


	@Override
	public Integer insert(RadioStreamResultTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioStreamResultTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioStreamResultTabQuery query) {
		return dao.selectList(query);
	}

    @Override
    public Page selectNotExistsStreamMark(RadioStreamResultTabQuery query) {
        return dao.selectNotExistsStreamMark(query);
    }

    @Override
	public RadioStreamResultTab selectById(Long id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioStreamResultTab bean) {
		return dao.delete(bean);
	}

	@Override
	public Date findMinRadioDate( ) {
		return dao.findMinRadioDate();
	}

	@Override
	public Integer deleteMinRadioDateData(RadioStreamResultTab bean) {
		return dao.deleteMinRadioDateData(bean);
	}
}
