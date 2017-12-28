
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResDatainputTab;
import com.hw.domain.po.query.ResDatainputTabQuery;


public interface ResDatainputTabMapper {
    public Integer insert(ResDatainputTab bean);

    public Integer update(ResDatainputTab bean);

    public Page selectList(ResDatainputTabQuery query);

    public ResDatainputTab selectById(Integer id);

    public Integer delete(ResDatainputTab bean);

}
