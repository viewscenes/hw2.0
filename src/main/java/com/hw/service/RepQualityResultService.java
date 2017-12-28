
package com.hw.service;


import com.hw.domain.po.RepQualityResultTab;
import com.hw.domain.po.query.RepQualityResultTabQuery;

import java.util.List;

public interface RepQualityResultService{

    public Integer insert(RepQualityResultTab bean);

    public Integer update(RepQualityResultTab bean);

    public List selectList(RepQualityResultTabQuery query);

    public RepQualityResultTab selectById(Integer id);

    public Integer delete(RepQualityResultTab bean);
}
