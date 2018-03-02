
package com.hw.service;



import com.github.pagehelper.Page;
import com.hw.domain.po.RadioStreamResultTab;
import com.hw.domain.po.query.RadioStreamResultTabQuery;

import java.util.Date;
import java.util.List;

public interface RadioStreamResultService{

    public Integer insert(RadioStreamResultTab bean);

    public Integer update(RadioStreamResultTab bean);

    public List selectList(RadioStreamResultTabQuery query);

    public Page selectNotExistsStreamMark(RadioStreamResultTabQuery query);

    public RadioStreamResultTab selectById(Integer id);

    public Integer delete(RadioStreamResultTab bean);

    public Date findMinRadioDate( );

    public Integer deleteMinRadioDateData(RadioStreamResultTab bean);
}
