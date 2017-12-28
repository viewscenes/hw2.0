
package com.hw.service;


import com.hw.domain.po.RadioUnifyTaskTab;
import com.hw.domain.po.query.RadioUnifyTaskTabQuery;

import java.util.List;

public interface RadioUnifyTaskService{

    public Integer insert(RadioUnifyTaskTab bean);

    public Integer update(RadioUnifyTaskTab bean);

    public List selectList(RadioUnifyTaskTabQuery query);

    public RadioUnifyTaskTab selectById(Integer id);

    public Integer delete(RadioUnifyTaskTab bean);
}
