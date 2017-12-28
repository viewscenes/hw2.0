
package com.hw.service;

import com.hw.domain.po.DicRedisseminatorsTab;
import com.hw.domain.po.query.DicRedisseminatorsTabQuery;

import java.util.List;


public interface DicRedisseminatorsService{

    public Integer insert(DicRedisseminatorsTab bean);

    public Integer update(DicRedisseminatorsTab bean);

    public List selectList(DicRedisseminatorsTabQuery query);

    public DicRedisseminatorsTab selectById(Integer id);

    public Integer delete(DicRedisseminatorsTab bean);
}
