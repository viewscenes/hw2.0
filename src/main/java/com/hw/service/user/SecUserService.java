
package com.hw.service.user;



import com.github.pagehelper.PageInfo;
import com.hw.domain.po.SecUserTab;
import com.hw.domain.po.query.SecUserTabQuery;

public interface SecUserService{

     Integer insert(SecUserTab bean);

     Integer update(SecUserTab bean);

     PageInfo selectList(SecUserTabQuery query);

     SecUserTab selectById(Integer id);

     SecUserTab selectOneUser(SecUserTabQuery query);

     Integer delete(SecUserTab bean);
}
