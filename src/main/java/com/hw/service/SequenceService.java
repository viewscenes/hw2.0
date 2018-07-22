
package com.hw.service;


/**
 * 提供公共基础查询服务，调用其他service实现；
 */
public interface SequenceService {

    Integer  getNextSequence(String  sequence);
}
