
package com.hw.mapper;

import com.hw.domain.po.DicBandTypeTab;
import com.hw.domain.po.query.DicBandTypeTabQuery;

import java.util.List;


public interface DicBandTypeTabMapper{

     Integer insert(DicBandTypeTab bean);

     Integer update(DicBandTypeTab bean);

     List selectList(DicBandTypeTabQuery query);

     DicBandTypeTab selectById(Integer id);

     Integer delete(DicBandTypeTab bean);
}
