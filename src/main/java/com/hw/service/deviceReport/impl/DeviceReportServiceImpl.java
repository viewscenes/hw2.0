
package com.hw.service.deviceReport.impl;


import com.hw.domain.po.DeviceReport;
import com.hw.mapper.DeviceReportMapper;
import com.hw.service.deviceReport.DeviceReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class DeviceReportServiceImpl implements DeviceReportService {

    @Resource
	private DeviceReportMapper dao;


	@Override
	public Integer insert(DeviceReport bean) {
		return dao.insert(bean);
	}

	@Override
	public DeviceReport selectById(Long actId) {
		return dao.selectById(actId);
	}

	@Override
	public Integer delete(DeviceReport bean) {
		return dao.delete(bean);
	}
}
