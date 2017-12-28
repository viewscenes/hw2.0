
package com.hw.service;


import com.hw.domain.po.ResTaskUnitTab;
import com.hw.domain.po.query.ResTaskUnitTabQuery;

import java.util.List;

public interface ResTaskUnitService{

    public Integer insert(ResTaskUnitTab bean);

    public Integer update(ResTaskUnitTab bean);

    public List selectList(ResTaskUnitTabQuery query);

    public ResTaskUnitTab selectById(Integer id);

    public Integer delete(ResTaskUnitTab bean);
}
