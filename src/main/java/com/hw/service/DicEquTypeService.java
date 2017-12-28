
package com.hw.service;



import com.hw.domain.po.DicEquTypeTab;
import com.hw.domain.po.query.DicEquTypeTabQuery;

import java.util.List;

public interface DicEquTypeService{
    public Integer insert(DicEquTypeTab bean);

    public Integer update(DicEquTypeTab bean);

    public List selectList(DicEquTypeTabQuery query);

    public DicEquTypeTab selectById(Integer id);

    public Integer delete(DicEquTypeTab bean);

}
