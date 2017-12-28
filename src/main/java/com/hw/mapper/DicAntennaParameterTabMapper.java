
package com.hw.mapper;

import com.hw.domain.po.DicAntennaParameterTab;
import com.hw.domain.po.query.DicAntennaParameterTabQuery;

import java.util.List;


public interface DicAntennaParameterTabMapper {

     Integer insert(DicAntennaParameterTab bean);

     Integer update(DicAntennaParameterTab bean);

     List selectList(DicAntennaParameterTabQuery query);

     DicAntennaParameterTab selectById(Integer id);

     Integer delete(DicAntennaParameterTab bean);
}
