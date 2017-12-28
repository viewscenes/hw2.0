
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioUnifyTaskTab;
import com.hw.domain.po.query.RadioUnifyTaskTabQuery;


public interface RadioUnifyTaskTabMapper {

    public Integer insert(RadioUnifyTaskTab bean);

    public Integer update(RadioUnifyTaskTab bean);

    public Page selectList(RadioUnifyTaskTabQuery query);

    public RadioUnifyTaskTab selectById(Integer id);

    public Integer delete(RadioUnifyTaskTab bean);
}
