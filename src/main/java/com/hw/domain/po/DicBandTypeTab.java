
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
public class DicBandTypeTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	//columns START
    /**
     * 波段id       db_column: BAND_ID 
     */	
	
	private Long bandId;
    /**
     * 波段名称       db_column: BAND_NAME 
     */	

	private String bandName;
	//columns END


}

