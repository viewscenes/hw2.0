
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.DicRepTypeTab;
import com.hw.domain.po.query.DicRepTypeTabQuery;


public interface DicRepTypeTabMapper {

    public Integer insert(DicRepTypeTab bean);

    public Integer update(DicRepTypeTab bean);

    public Page selectList(DicRepTypeTabQuery query);

    public DicRepTypeTab selectById(Integer id);

    public Integer delete(DicRepTypeTab bean);
}
