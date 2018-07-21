
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.SysConfigurationTab;
import com.hw.domain.po.query.SysConfigurationTabQuery;


public interface SysConfigurationTabMapper {

     Integer insert(SysConfigurationTab bean);

     Integer update(SysConfigurationTab bean);

     Page selectList(SysConfigurationTabQuery query);

     SysConfigurationTab selectById(Integer id);

     Integer delete(SysConfigurationTab bean);

     Integer checkDB();

     String getLocVideoUrl();

     String getLocVideoLocation();
}
