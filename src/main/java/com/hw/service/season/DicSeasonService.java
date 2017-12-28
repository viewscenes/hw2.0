
package com.hw.service.season;

import com.github.pagehelper.Page;
import com.hw.domain.po.DicSeasonTab;
import com.hw.domain.po.query.DicSeasonTabQuery;

import java.util.List;


public interface DicSeasonService {

    public Integer insert(DicSeasonTab bean);

    public Integer update(DicSeasonTab bean);

    public Page selectListPage(DicSeasonTabQuery query);

    public List<DicSeasonTab> selectSeasonList(DicSeasonTabQuery query);

    public DicSeasonTab selectById(Integer id);

    public Integer delete(DicSeasonTab bean);
}
