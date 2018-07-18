
package com.hw.service;


import com.hw.domain.po.RadioMarkRelTab;

import java.util.List;


public interface RadioMarkRelService {


     Integer update(RadioMarkRelTab bean);

     List<RadioMarkRelTab> getNotMark();

     Integer delete(RadioMarkRelTab bean);

}
