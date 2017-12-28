
package com.hw.service;

import com.hw.domain.po.DicRepTypeTab;
import com.hw.domain.po.query.DicRepTypeTabQuery;

import java.util.List;


public interface DicRepTypeService{

    public Integer insert(DicRepTypeTab bean);

    public Integer update(DicRepTypeTab bean);

    public List selectList(DicRepTypeTabQuery query);

    public DicRepTypeTab selectById(Integer id);

    public Integer delete(DicRepTypeTab bean);
}
