
package com.hw.mapper;


import com.hw.domain.po.RadioMarkRelTab;
import java.util.List;


public interface RadioMarkRelTabMapper {


     Integer update(RadioMarkRelTab bean);

     List<RadioMarkRelTab> getNotMark();

     Integer delete(RadioMarkRelTab bean);

}
