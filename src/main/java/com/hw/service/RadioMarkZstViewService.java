
package com.hw.service;


import com.hw.domain.po.RadioMarkZstViewTab;
import com.hw.domain.po.RadioStreamResultTab;
import com.hw.domain.po.query.RadioMarkZstViewTabQuery;

import java.util.Date;
import java.util.List;


public interface RadioMarkZstViewService{

    public Integer insert(RadioMarkZstViewTab bean);

    public Integer update(RadioMarkZstViewTab bean);

    public List selectList(RadioMarkZstViewTabQuery query);

    public RadioMarkZstViewTab selectById(Integer id);

    public Integer delete(RadioMarkZstViewTab bean);


    public List<RadioMarkZstViewTab> queryList(RadioMarkZstViewTabQuery query);

    public Date findMinRadioDate( );

    public Integer deleteMinRadioDateData(RadioMarkZstViewTabQuery bean);
}
