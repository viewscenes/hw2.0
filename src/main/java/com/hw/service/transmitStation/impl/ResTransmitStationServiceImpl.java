
package com.hw.service.transmitStation.impl;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResTransmitStationTab;
import com.hw.domain.po.query.ResTransmitStationTabQuery;
import com.hw.mapper.ResTransmitStationTabMapper;
import com.hw.service.transmitStation.ResTransmitStationService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ResTransmitStationServiceImpl implements ResTransmitStationService {


	private ResTransmitStationTabMapper dao;

	@Override
	public Integer insert(ResTransmitStationTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(ResTransmitStationTab bean) {
		return dao.update(bean);
	}

	@Override
	public Page selectListPage(ResTransmitStationTabQuery query) {
		return dao.selectListPage(query);
	}

    @Override
    public List<ResTransmitStationTab> selectList(ResTransmitStationTabQuery query) {
        return dao.selectList(query);
    }

    @Override
	public ResTransmitStationTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(ResTransmitStationTab bean) {
		return dao.delete(bean);
	}
}
