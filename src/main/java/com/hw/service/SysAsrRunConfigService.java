
package com.hw.service;


import com.hw.domain.po.SysAsrRunConfigTab;
import com.hw.domain.po.query.SysAsrRunConfigTabQuery;

import java.util.List;

public interface SysAsrRunConfigService{
    public Integer insert(SysAsrRunConfigTab bean);

    public Integer update(SysAsrRunConfigTab bean);

    public List selectList(SysAsrRunConfigTabQuery query);

    public SysAsrRunConfigTab selectById(Integer id);

    public Integer delete(SysAsrRunConfigTab bean);

}
