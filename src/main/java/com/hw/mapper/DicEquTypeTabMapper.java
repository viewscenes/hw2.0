
package com.hw.mapper;


import com.hw.domain.po.DicEquTypeTab;
import com.hw.domain.po.query.DicEquTypeTabQuery;

import java.util.List;


public interface DicEquTypeTabMapper{
     Integer insert(DicEquTypeTab bean);

     Integer update(DicEquTypeTab bean);

     List selectList(DicEquTypeTabQuery query);

     DicEquTypeTab selectById(Integer id);

     Integer delete(DicEquTypeTab bean);

}
