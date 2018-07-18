
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioStreamResultTab;
import com.hw.domain.po.query.RadioStreamResultTabQuery;

import java.util.Date;


public interface RadioStreamResultTabMapper {

    public Integer insert(RadioStreamResultTab bean);

    public Integer update(RadioStreamResultTab bean);

    public Page selectList(RadioStreamResultTabQuery query);

    public RadioStreamResultTab selectById(Long id);

    public Integer delete(RadioStreamResultTab bean);

    public Page selectNotExistsStreamMark(RadioStreamResultTabQuery query);

    public Date findMinRadioDate();

    public Integer deleteMinRadioDateData(RadioStreamResultTab bean);
}
