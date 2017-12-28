
package com.hw.service;

import com.github.pagehelper.Page;
import com.hw.domain.po.DicRunplanTypeTab;
import com.hw.domain.po.query.DicRunplanTypeTabQuery;


public interface DicRunplanTypeService{

    public Integer insert(DicRunplanTypeTab bean);

    public Integer update(DicRunplanTypeTab bean);

    public Page selectList(DicRunplanTypeTabQuery query);

    public DicRunplanTypeTab selectById(Integer id);

    public Integer delete(DicRunplanTypeTab bean);
}
