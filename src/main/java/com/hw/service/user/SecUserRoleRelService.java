
package com.hw.service.user;



import com.hw.domain.po.SecUserRoleRelTab;
import com.hw.domain.po.query.SecUserRoleRelTabQuery;

import java.util.List;

public interface SecUserRoleRelService{

    public Integer insert(SecUserRoleRelTab bean);

    public Integer update(SecUserRoleRelTab bean);

    public List selectList(SecUserRoleRelTabQuery query);

    public SecUserRoleRelTab selectById(Integer id);

    public Integer delete(SecUserRoleRelTab bean);

    public List<SecUserRoleRelTab> selectByUserId(Integer userId);
}
