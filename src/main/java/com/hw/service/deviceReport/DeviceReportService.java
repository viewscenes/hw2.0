
package com.hw.service.deviceReport;



import com.hw.domain.po.DeviceReport;


public interface DeviceReportService {
     Integer insert(DeviceReport bean);

     DeviceReport selectById(Long actId);

     Integer delete(DeviceReport bean);

}
