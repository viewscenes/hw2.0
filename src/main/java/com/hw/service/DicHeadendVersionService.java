
package com.hw.service;

import com.hw.domain.po.DicHeadendVersionTab;
import com.hw.domain.po.query.DicHeadendVersionTabQuery;

import java.util.List;


public interface DicHeadendVersionService{

    public Integer insert(DicHeadendVersionTab bean);

    public Integer update(DicHeadendVersionTab bean);

    public List selectList(DicHeadendVersionTabQuery query);

    public DicHeadendVersionTab selectById(Integer id);

    public Integer delete(DicHeadendVersionTab bean);
}
