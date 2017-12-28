
package com.hw.service;


import com.hw.domain.po.SecUserOperationCustomTab;
import com.hw.domain.po.query.SecUserOperationCustomTabQuery;

import java.util.List;

public interface SecUserOperationCustomService{

    public Integer insert(SecUserOperationCustomTab bean);

    public Integer update(SecUserOperationCustomTab bean);

    public List selectList(SecUserOperationCustomTabQuery query);

    public SecUserOperationCustomTab selectById(Integer id);

    public Integer delete(SecUserOperationCustomTab bean);
}
