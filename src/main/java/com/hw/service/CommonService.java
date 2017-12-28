
package com.hw.service;

import java.util.Map;

/**
 * 提供公共基础查询服务，调用其他service实现；
 */
public interface CommonService {


    /**
     * 查询所有前端
     * @return
     */
    public Map getHeadendMap_headcodeAndheadname();

}
