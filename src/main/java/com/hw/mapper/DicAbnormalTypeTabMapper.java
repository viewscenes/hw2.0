
package com.hw.mapper;

import com.hw.domain.po.DicAbnormalTypeTab;
import com.hw.domain.po.query.DicAbnormalTypeTabQuery;

import java.util.List;


public interface DicAbnormalTypeTabMapper {

     Integer insert(DicAbnormalTypeTab bean);

     Integer update(DicAbnormalTypeTab bean);

     List selectList(DicAbnormalTypeTabQuery query);

     DicAbnormalTypeTab selectById(Integer id);

     Integer delete(DicAbnormalTypeTab bean);

}
