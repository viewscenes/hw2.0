
package com.hw.service.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.DicEquCategoryTab;
import com.hw.domain.po.query.DicEquCategoryTabQuery;
import com.hw.mapper.DicEquCategoryTabMapper;
import com.hw.service.DicEquCategoryService;
import org.springframework.stereotype.Service;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DicEquCategoryServiceImpl implements DicEquCategoryService {

    private DicEquCategoryTabMapper dao;

    @Override
    public Integer insert(DicEquCategoryTab bean) {
        return dao.insert(bean);
    }

    @Override
    public Integer update(DicEquCategoryTab bean) {
        return dao.update(bean);
    }

    @Override
    public Page selectList(DicEquCategoryTabQuery query) {
        return dao.selectList(query);
    }

    @Override
    public DicEquCategoryTab selectById(Integer id) {
        return dao.selectById(id);
    }

    @Override
    public Integer delete(DicEquCategoryTab bean) {
        return dao.delete(bean);
    }
}
