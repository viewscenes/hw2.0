
package com.hw.mapper;


import org.apache.ibatis.annotations.Param;


public interface SequenceMapper {
     Integer  getNextSequence(@Param("sequence") String  sequence);
}
