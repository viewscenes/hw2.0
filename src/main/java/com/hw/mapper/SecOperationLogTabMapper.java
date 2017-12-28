
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.SecOperationLogTab;
import com.hw.domain.po.query.SecOperationLogTabQuery;


public interface SecOperationLogTabMapper {

    public Integer insert(SecOperationLogTab bean);

    public Integer update(SecOperationLogTab bean);

    public Page selectList(SecOperationLogTabQuery query);

    public SecOperationLogTab selectById(Integer id);

    public Integer delete(SecOperationLogTab bean);
}
