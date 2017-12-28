
package com.hw.service;

import com.hw.domain.po.DicBandTypeTab;
import com.hw.domain.po.query.DicBandTypeTabQuery;

import java.util.List;


public interface DicBandTypeService{

    public Integer insert(DicBandTypeTab bean);

    public Integer update(DicBandTypeTab bean);

    public List selectList(DicBandTypeTabQuery query);

    public DicBandTypeTab selectById(Integer id);

    public Integer delete(DicBandTypeTab bean);
}
