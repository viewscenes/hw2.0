
package com.hw.service.language.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZdicLanguageTab;
import com.hw.domain.po.query.ZdicLanguageTabQuery;
import com.hw.mapper.ZdicLanguageTabMapper;
import com.hw.service.language.ZdicLanguageService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ZdicLanguageServiceImpl implements ZdicLanguageService {

	private ZdicLanguageTabMapper dao;

	@Override
	public Integer insert(ZdicLanguageTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ZdicLanguageTab bean) {
		return dao.update(bean);
	}

    @Override
    public Page selectPage(ZdicLanguageTabQuery query) {
        return dao.selectPage(query);
    }

    @Override
	public List<ZdicLanguageTab> selectList(ZdicLanguageTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public ZdicLanguageTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ZdicLanguageTab bean) {
		return dao.delete(bean);
	}

    @Override
    public List<ZdicLanguageTab> selectLanguageList(ZdicLanguageTabQuery query) {
        return dao.selectLanguageList(query);
    }
}
