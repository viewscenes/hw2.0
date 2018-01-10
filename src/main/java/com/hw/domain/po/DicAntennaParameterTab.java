
package com.hw.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DicAntennaParameterTab implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

    /**
     * 天线程式       db_column: ANTENNA_MODE 
     */	

	private String antennaMode;
    /**
     * 主瓣宽度       db_column: ANTENNA_WIDTH 
     */	
	
	private Long antennaWidth;
    /**
     * 仰角       db_column: ELEVATION_ANGLE 
     */	
	
	private Long elevationAngle;
    /**
     * 增益       db_column: GAIN 
     */	
	
	private Long gain;
	//columns END

}

