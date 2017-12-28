
package com.hw.service;

import com.github.pagehelper.Page;
import com.hw.domain.po.ResNatificationTab;
import com.hw.domain.po.query.ResNatificationTabQuery;


public interface ResNatificationService{

    public Integer insert(ResNatificationTab bean);

    public Integer update(ResNatificationTab bean);

    public Page selectList(ResNatificationTabQuery query);

    public ResNatificationTab selectById(Integer id);

    public Integer delete(ResNatificationTab bean);
}
