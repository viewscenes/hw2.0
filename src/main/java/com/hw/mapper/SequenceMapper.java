
package com.hw.mapper;


import org.apache.ibatis.annotations.Param;


public interface SequenceMapper {
     Long  getNextSequence(@Param("sequence") String  sequence);
}
