
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.SecUserOperationCustomTab;
import com.hw.domain.po.query.SecUserOperationCustomTabQuery;


public interface SecUserOperationCustomTabMapper {

    public Integer insert(SecUserOperationCustomTab bean);

    public Integer update(SecUserOperationCustomTab bean);

    public Page selectList(SecUserOperationCustomTabQuery query);

    public SecUserOperationCustomTab selectById(Integer id);

    public Integer delete(SecUserOperationCustomTab bean);
}
