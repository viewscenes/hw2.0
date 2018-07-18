
package com.hw.mapper;


import com.hw.domain.po.ResCityTab;
import com.hw.domain.po.query.ResCityTabQuery;
import java.util.List;


public interface RadioMarkRelTabMapper {


     Integer update(ResCityTab bean);

     List getNotMark(ResCityTabQuery query);


     Integer delete(ResCityTab bean);

}
