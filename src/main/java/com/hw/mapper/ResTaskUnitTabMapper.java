
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResTaskUnitTab;
import com.hw.domain.po.query.ResTaskUnitTabQuery;


public interface ResTaskUnitTabMapper {

    public Integer insert(ResTaskUnitTab bean);

    public Integer update(ResTaskUnitTab bean);

    public Page selectList(ResTaskUnitTabQuery query);

    public ResTaskUnitTab selectById(Integer id);

    public Integer delete(ResTaskUnitTab bean);
}
