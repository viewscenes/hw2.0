
package com.hw.service.impl;


import com.hw.domain.po.RadioUnifyTaskTab;
import com.hw.domain.po.query.RadioUnifyTaskTabQuery;
import com.hw.mapper.RadioUnifyTaskTabMapper;
import com.hw.service.RadioUnifyTaskService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class RadioUnifyTaskServiceImpl implements RadioUnifyTaskService {


	private RadioUnifyTaskTabMapper dao;

	@Override
	public Integer insert(RadioUnifyTaskTab bean) {
		return dao.insert(bean);
	}

	@Override
	public Integer update(RadioUnifyTaskTab bean) {
		return dao.update(bean);
	}

	@Override
	public List selectList(RadioUnifyTaskTabQuery query) {
		return dao.selectList(query);
	}

	@Override
	public RadioUnifyTaskTab selectById(Integer id) {
		return dao.selectById(id);
	}

	@Override
	public Integer delete(RadioUnifyTaskTab bean) {
		return dao.delete(bean);
	}
}
