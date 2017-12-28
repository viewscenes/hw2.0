
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.SecRoleTab;
import com.hw.domain.po.query.SecRoleTabQuery;


public interface SecRoleTabMapper {

    public Integer insert(SecRoleTab bean);

    public Integer update(SecRoleTab bean);

    public Page selectList(SecRoleTabQuery query);

    public SecRoleTab selectById(Integer id);

    public Integer delete(SecRoleTab bean);
}
