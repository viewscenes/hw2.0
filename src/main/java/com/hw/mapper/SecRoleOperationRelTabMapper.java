
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.SecRoleOperationRelTab;
import com.hw.domain.po.query.SecRoleOperationRelTabQuery;


public interface SecRoleOperationRelTabMapper {
    public Integer insert(SecRoleOperationRelTab bean);

    public Integer update(SecRoleOperationRelTab bean);

    public Page selectList(SecRoleOperationRelTabQuery query);

    public SecRoleOperationRelTab selectById(Integer id);

    public Integer delete(SecRoleOperationRelTab bean);

}
