
package com.hw.service;


import com.hw.domain.po.SecRoleOperationRelTab;
import com.hw.domain.po.query.SecRoleOperationRelTabQuery;

import java.util.List;

public interface SecRoleOperationRelService{
    public Integer insert(SecRoleOperationRelTab bean);

    public Integer update(SecRoleOperationRelTab bean);

    public List selectList(SecRoleOperationRelTabQuery query);

    public SecRoleOperationRelTab selectById(Integer id);

    public Integer delete(SecRoleOperationRelTab bean);

}
