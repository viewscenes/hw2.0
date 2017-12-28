
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResShiftLogTab;
import com.hw.domain.po.query.ResShiftLogTabQuery;


public interface ResShiftLogTabMapper {
    public Integer insert(ResShiftLogTab bean);

    public Integer update(ResShiftLogTab bean);

    public Page selectList(ResShiftLogTabQuery query);

    public ResShiftLogTab selectById(Integer id);

    public Integer delete(ResShiftLogTab bean);

}
