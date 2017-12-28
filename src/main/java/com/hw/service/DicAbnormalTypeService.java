
package com.hw.service;

import com.hw.domain.po.DicAbnormalTypeTab;
import com.hw.domain.po.query.DicAbnormalTypeTabQuery;

import java.util.List;


public interface DicAbnormalTypeService{



    public Integer insert(DicAbnormalTypeTab bean);

    public Integer update(DicAbnormalTypeTab bean);

    public List selectList(DicAbnormalTypeTabQuery query);

    public DicAbnormalTypeTab selectById(Integer id);

    public Integer delete(DicAbnormalTypeTab bean);
   

 
   

}
