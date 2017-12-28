
package com.hw.service.module;

import com.github.pagehelper.Page;
import com.hw.domain.po.SecOperationTab;
import com.hw.domain.po.query.SecOperationTabQuery;

import java.util.List;


public interface SecOperationService{
    public Integer insert(SecOperationTab bean);

    public Integer update(SecOperationTab bean);

    public Page selectList(SecOperationTabQuery query);

    public SecOperationTab selectById(Integer id);

    public Integer delete(SecOperationTab bean);

    public List<SecOperationTab> getChildrenByQueryParamter(SecOperationTabQuery query);

    public List<SecOperationTab> getAllOperationByBroadcastType(Integer broadcastType);


}
