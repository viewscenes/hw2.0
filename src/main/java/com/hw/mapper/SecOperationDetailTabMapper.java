
package com.hw.mapper;



import com.github.pagehelper.Page;
import com.hw.domain.po.SecOperationDetailTab;
import com.hw.domain.po.query.SecOperationDetailTabQuery;


public interface SecOperationDetailTabMapper {

    public Integer insert(SecOperationDetailTab bean);

    public Integer update(SecOperationDetailTab bean);

    public Page selectList(SecOperationDetailTabQuery query);

    public SecOperationDetailTab selectById(Integer id);

    public Integer delete(SecOperationDetailTab bean);
}
