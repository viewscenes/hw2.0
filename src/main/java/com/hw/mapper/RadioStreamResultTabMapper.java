
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioStreamResultTab;
import com.hw.domain.po.query.RadioStreamResultTabQuery;
import org.apache.ibatis.annotations.Param;

import java.util.Date;


public interface RadioStreamResultTabMapper {

    public Integer insert(RadioStreamResultTab bean);

    public Integer update(RadioStreamResultTab bean);

    public Page selectList(RadioStreamResultTabQuery query);

    public RadioStreamResultTab selectById(@Param("id") Integer id);

    public Integer delete(RadioStreamResultTab bean);

    public Page selectNotExistsStreamMark(RadioStreamResultTabQuery query);

    public Date findMinRadioDate();

    public Integer deleteMinRadioDateData(RadioStreamResultTab bean);
}
