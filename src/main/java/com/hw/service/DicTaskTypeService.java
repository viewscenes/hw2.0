
package com.hw.service;

import com.hw.domain.po.DicTaskTypeTab;
import com.hw.domain.po.query.DicTaskTypeTabQuery;

import java.util.List;


public interface DicTaskTypeService{

    public Integer insert(DicTaskTypeTab bean);

    public Integer update(DicTaskTypeTab bean);

    public List selectList(DicTaskTypeTabQuery query);

    public DicTaskTypeTab selectById(Integer id);

    public Integer delete(DicTaskTypeTab bean);
}
