
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.SysAsrRunConfigTab;
import com.hw.domain.po.query.SysAsrRunConfigTabQuery;


public interface SysAsrRunConfigTabMapper {
    public Integer insert(SysAsrRunConfigTab bean);

    public Integer update(SysAsrRunConfigTab bean);

    public Page selectList(SysAsrRunConfigTabQuery query);

    public SysAsrRunConfigTab selectById(Integer id);

    public Integer delete(SysAsrRunConfigTab bean);

}
