/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.hw.mapper;


import com.hw.domain.po.SecUserRoleRelTab;
import com.hw.domain.po.query.SecUserRoleRelTabQuery;

import java.util.List;


public interface SecUserRoleRelTabMapper {

    public Integer insert(SecUserRoleRelTab bean);

    public Integer update(SecUserRoleRelTab bean);

    public List selectList(SecUserRoleRelTabQuery query);

    public SecUserRoleRelTab selectById(Integer id);

    public Integer delete(SecUserRoleRelTab bean);

    public List<SecUserRoleRelTab> selectByUserId(Integer userId);
}
