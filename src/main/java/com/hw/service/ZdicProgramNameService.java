
package com.hw.service;


import com.hw.domain.po.ZdicProgramNameTab;
import com.hw.domain.po.query.ZdicProgramNameTabQuery;

import java.util.List;

public interface ZdicProgramNameService{

    public Integer insert(ZdicProgramNameTab bean);

    public Integer update(ZdicProgramNameTab bean);

    public List selectList(ZdicProgramNameTabQuery query);

    public ZdicProgramNameTab selectById(Integer id);

    public Integer delete(ZdicProgramNameTab bean);
}
