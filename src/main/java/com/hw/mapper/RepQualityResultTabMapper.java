
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RepQualityResultTab;
import com.hw.domain.po.query.RepQualityResultTabQuery;


public interface RepQualityResultTabMapper {

    public Integer insert(RepQualityResultTab bean);

    public Integer update(RepQualityResultTab bean);

    public Page selectList(RepQualityResultTabQuery query);

    public RepQualityResultTab selectById(Integer id);

    public Integer delete(RepQualityResultTab bean);
}
