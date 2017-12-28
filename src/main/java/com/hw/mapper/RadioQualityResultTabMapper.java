
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioQualityResultTab;
import com.hw.domain.po.query.RadioQualityResultTabQuery;


public interface RadioQualityResultTabMapper {

    public Integer insert(RadioQualityResultTab bean);

    public Integer update(RadioQualityResultTab bean);

    public Page selectList(RadioQualityResultTabQuery query);

    public RadioQualityResultTab selectById(Integer id);

    public Integer delete(RadioQualityResultTab bean);
}
