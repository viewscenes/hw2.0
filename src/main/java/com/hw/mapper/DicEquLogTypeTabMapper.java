
package com.hw.mapper;


import com.hw.domain.po.DicEquLogTypeTab;
import com.hw.domain.po.query.DicEquLogTypeTabQuery;

import java.util.List;


public interface DicEquLogTypeTabMapper{

    public Integer insert(DicEquLogTypeTab bean);

    public Integer update(DicEquLogTypeTab bean);

    public List selectList(DicEquLogTypeTabQuery query);

    public DicEquLogTypeTab selectById(Integer id);

    public Integer delete(DicEquLogTypeTab bean);
}
