
package com.hw.service;


import com.hw.domain.po.SecOperationDetailTab;
import com.hw.domain.po.query.SecOperationDetailTabQuery;

import java.util.List;

public interface SecOperationDetailService{

    public Integer insert(SecOperationDetailTab bean);

    public Integer update(SecOperationDetailTab bean);

    public List selectList(SecOperationDetailTabQuery query);

    public SecOperationDetailTab selectById(Integer id);

    public Integer delete(SecOperationDetailTab bean);
}
