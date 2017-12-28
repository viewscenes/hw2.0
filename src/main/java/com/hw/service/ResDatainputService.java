
package com.hw.service;



import com.hw.domain.po.ResDatainputTab;
import com.hw.domain.po.query.ResDatainputTabQuery;

import java.util.List;

public interface ResDatainputService{
    public Integer insert(ResDatainputTab bean);

    public Integer update(ResDatainputTab bean);

    public List selectList(ResDatainputTabQuery query);

    public ResDatainputTab selectById(Integer id);

    public Integer delete(ResDatainputTab bean);

}
