
package com.hw.service;

import com.github.pagehelper.Page;
import com.hw.domain.po.RadioEquInitParamTab;
import com.hw.domain.po.query.RadioEquInitParamTabQuery;
import com.hw.domain.vo.FtpServerVo;

import java.util.List;


public interface RadioEquInitParamService{

     Integer insert(RadioEquInitParamTab bean);

     Integer update(RadioEquInitParamTab bean);

     Integer batcheUpdateFtpServer(List<RadioEquInitParamTab> list);

     Page selectList(RadioEquInitParamTabQuery query);

     RadioEquInitParamTab selectById(Integer id);

     Integer delete(RadioEquInitParamTab bean);

     List<RadioEquInitParamTab> selectInvalidFtpList(List<FtpServerVo> list);
}
