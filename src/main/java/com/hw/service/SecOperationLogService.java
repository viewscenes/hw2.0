
package com.hw.service;


import com.hw.domain.po.SecOperationLogTab;
import com.hw.domain.po.query.SecOperationLogTabQuery;

import java.util.List;

public interface SecOperationLogService{

    public Integer insert(SecOperationLogTab bean);

    public Integer update(SecOperationLogTab bean);

    public List selectList(SecOperationLogTabQuery query);

    public SecOperationLogTab selectById(Integer id);

    public Integer delete(SecOperationLogTab bean);
}
