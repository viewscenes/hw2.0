
package com.hw.service;



import com.hw.domain.po.ResImportdataTab;
import com.hw.domain.po.query.ResImportdataTabQuery;

import java.util.List;

public interface ResImportdataService{

    public Integer insert(ResImportdataTab bean);

    public Integer update(ResImportdataTab bean);

    public List selectList(ResImportdataTabQuery query);

    public ResImportdataTab selectById(Integer id);

    public Integer delete(ResImportdataTab bean);
}
