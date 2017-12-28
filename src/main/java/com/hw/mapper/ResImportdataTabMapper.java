
package com.hw.mapper;



import com.github.pagehelper.Page;
import com.hw.domain.po.ResImportdataTab;
import com.hw.domain.po.query.ResImportdataTabQuery;


public interface ResImportdataTabMapper {

    public Integer insert(ResImportdataTab bean);

    public Integer update(ResImportdataTab bean);

    public Page selectList(ResImportdataTabQuery query);

    public ResImportdataTab selectById(Integer id);

    public Integer delete(ResImportdataTab bean);
}
