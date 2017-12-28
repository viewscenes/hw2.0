
package com.hw.service.user;


import com.hw.domain.po.SecRoleTab;
import com.hw.domain.po.query.SecRoleTabQuery;

import java.util.List;

public interface SecRoleService{

    public Integer insert(SecRoleTab bean);

    public Integer update(SecRoleTab bean);

    public List selectList(SecRoleTabQuery query);

    public SecRoleTab selectById(Integer id);

    public Integer delete(SecRoleTab bean);
}
