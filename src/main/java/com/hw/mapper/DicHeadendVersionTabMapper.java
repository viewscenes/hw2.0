
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.DicHeadendVersionTab;
import com.hw.domain.po.query.DicHeadendVersionTabQuery;


public interface DicHeadendVersionTabMapper{

    public Integer insert(DicHeadendVersionTab bean);

    public Integer update(DicHeadendVersionTab bean);

    public Page selectList(DicHeadendVersionTabQuery query);

    public DicHeadendVersionTab selectById(Integer id);

    public Integer delete(DicHeadendVersionTab bean);
}
