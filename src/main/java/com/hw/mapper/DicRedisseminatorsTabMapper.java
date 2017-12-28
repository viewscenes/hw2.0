
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.DicRedisseminatorsTab;
import com.hw.domain.po.query.DicRedisseminatorsTabQuery;


public interface DicRedisseminatorsTabMapper {

    public Integer insert(DicRedisseminatorsTab bean);

    public Integer update(DicRedisseminatorsTab bean);

    public Page selectList(DicRedisseminatorsTabQuery query);

    public DicRedisseminatorsTab selectById(Integer id);

    public Integer delete(DicRedisseminatorsTab bean);
}
