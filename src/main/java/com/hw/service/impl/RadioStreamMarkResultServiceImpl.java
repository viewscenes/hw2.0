
package com.hw.service.impl;


import com.hw.domain.po.RadioStreamMarkResultTab;
import com.hw.domain.po.query.RadioStreamMarkResultTabQuery;
import com.hw.mapper.RadioStreamMarkResultTabMapper;
import com.hw.service.RadioStreamMarkResultService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioStreamMarkResultServiceImpl implements RadioStreamMarkResultService {

	private RadioStreamMarkResultTabMapper dao;


    @Override
    public Integer insert(RadioStreamMarkResultTab bean) {
        return dao.insert(bean);
    }

    @Override
    public Integer update(RadioStreamMarkResultTab bean) {
        return dao.update(bean);
    }

    @Override
    public List  selectPage(RadioStreamMarkResultTabQuery query) {
        return dao.selectPage(query);
    }

    @Override
    public List<RadioStreamMarkResultTab> selectList(RadioStreamMarkResultTabQuery query) {
        return dao.selectList(query);
    }

    @Override
    public RadioStreamMarkResultTab selectById(Integer id) {
        return dao.selectById(id);
    }

    @Override
    public Integer delete(RadioStreamMarkResultTab bean) {
        return dao.delete(bean);
    }

    @Override
    public Integer batchInsert(List<RadioStreamMarkResultTab> list) {
        return dao.batchInsert(list);
    }
}
