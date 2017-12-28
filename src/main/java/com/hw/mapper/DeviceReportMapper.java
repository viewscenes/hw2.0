
package com.hw.mapper;


import com.hw.domain.po.DeviceReport;



public interface DeviceReportMapper {
     Integer insert(DeviceReport bean);

     DeviceReport selectById(Long actId);

     Integer delete(DeviceReport bean);

}
