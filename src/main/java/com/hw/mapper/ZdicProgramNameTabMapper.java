
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZdicProgramNameTab;
import com.hw.domain.po.query.ZdicProgramNameTabQuery;


public interface ZdicProgramNameTabMapper {

    public Integer insert(ZdicProgramNameTab bean);

    public Integer update(ZdicProgramNameTab bean);

    public Page selectList(ZdicProgramNameTabQuery query);

    public ZdicProgramNameTab selectById(Integer id);

    public Integer delete(ZdicProgramNameTab bean);
}
