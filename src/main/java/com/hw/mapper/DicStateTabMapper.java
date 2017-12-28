
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.DicStateTab;
import com.hw.domain.po.query.DicStateTabQuery;


public interface DicStateTabMapper {

    public Integer insert(DicStateTab bean);

    public Integer update(DicStateTab bean);

    public Page selectList(DicStateTabQuery query);

    public DicStateTab selectById(Integer id);

    public Integer delete(DicStateTab bean);
}
