
package com.hw.mapper;


import com.hw.domain.po.SecUserTab;
import com.hw.domain.po.query.SecUserTabQuery;

import java.util.List;


public interface SecUserTabMaper  {

     Integer insert(SecUserTab bean);

     Integer update(SecUserTab bean);

     List selectList(SecUserTabQuery query);

     SecUserTab selectById(Integer id);

     Integer delete(SecUserTab bean);

     SecUserTab selectOneUser(SecUserTabQuery query);
}
