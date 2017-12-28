
package com.hw.service;



import com.github.pagehelper.Page;
import com.hw.domain.po.DicAntennaParameterTab;
import com.hw.domain.po.query.DicAntennaParameterTabQuery;

public interface DicAntennaParameterService{

    public Integer insert(DicAntennaParameterTab bean);

    public Integer update(DicAntennaParameterTab bean);

    public Page selectList(DicAntennaParameterTabQuery query);

    public DicAntennaParameterTab selectById(Integer id);

    public Integer delete(DicAntennaParameterTab bean);

}
