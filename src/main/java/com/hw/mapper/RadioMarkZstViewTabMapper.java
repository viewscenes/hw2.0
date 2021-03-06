
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.RadioMarkZstViewTab;
import com.hw.domain.po.RadioStreamResultTab;
import com.hw.domain.po.query.RadioMarkZstViewTabQuery;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;


public interface RadioMarkZstViewTabMapper {

    public Integer insert(RadioMarkZstViewTab bean);

    public Integer update(RadioMarkZstViewTab bean);

    public Page selectList(RadioMarkZstViewTabQuery query);

    public RadioMarkZstViewTab selectById(Integer id);

    public Integer delete(RadioMarkZstViewTab bean);

    public List<RadioMarkZstViewTab> queryList(RadioMarkZstViewTabQuery query);

    public Date findMinRadioDate( );

    public Integer deleteMinRadioDateData(RadioMarkZstViewTabQuery bean);

    RadioMarkZstViewTab selectByFileName(@Param("fileName") String fileName);
}
