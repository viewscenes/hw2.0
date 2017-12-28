
package com.hw.service;


import com.hw.domain.po.SysConfigurationTab;
import com.hw.domain.po.query.SysConfigurationTabQuery;

import java.util.List;

public interface SysConfigurationService{

     Integer insert(SysConfigurationTab bean);

     Integer update(SysConfigurationTab bean);

     List selectList(SysConfigurationTabQuery query);

     SysConfigurationTab selectById(Integer id);

     Integer delete(SysConfigurationTab bean);

     Integer checkDB();
}
