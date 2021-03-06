
package com.hw.service;

import com.github.pagehelper.Page;
import com.hw.domain.po.DicServicesareaTab;
import com.hw.domain.po.query.DicServicesareaTabQuery;


public interface DicServicesareaService{

    public Integer insert(DicServicesareaTab bean);

    public Integer update(DicServicesareaTab bean);

    public Page selectList(DicServicesareaTabQuery query);

    public DicServicesareaTab selectById(Integer id);

    public Integer delete(DicServicesareaTab bean);
}
