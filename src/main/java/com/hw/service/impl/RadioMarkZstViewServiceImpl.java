
package com.hw.service.impl;


import com.hw.domain.po.RadioMarkZstViewTab;
import com.hw.domain.po.RadioStreamResultTab;
import com.hw.domain.po.query.RadioMarkZstViewTabQuery;
import com.hw.mapper.RadioMarkZstViewTabMapper;
import com.hw.service.RadioMarkZstViewService;
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
public class RadioMarkZstViewServiceImpl implements RadioMarkZstViewService {

    @Resource
    private RadioMarkZstViewTabMapper dao;
    @Override
    public Integer insert(RadioMarkZstViewTab bean) {
        return dao.insert(bean);
    }

    @Override
    public Integer update(RadioMarkZstViewTab bean) {
        return dao.update(bean);
    }

    @Override
    public List selectList(RadioMarkZstViewTabQuery query) {
        return dao.selectList(query);
    }

    @Override
    public RadioMarkZstViewTab selectById(Integer id) {
        return dao.selectById(id);
    }

    @Override
    public Integer delete(RadioMarkZstViewTab bean) {
        return dao.delete(bean);
    }

    @Override
    public List<RadioMarkZstViewTab> queryList(RadioMarkZstViewTabQuery query) {
        return dao.queryList(query);
    }

    @Override
    public Date findMinRadioDate() {
        return dao.findMinRadioDate();
    }

    @Override
    public Integer deleteMinRadioDateData(RadioMarkZstViewTabQuery bean) {
        return dao.deleteMinRadioDateData(bean);
    }
}
