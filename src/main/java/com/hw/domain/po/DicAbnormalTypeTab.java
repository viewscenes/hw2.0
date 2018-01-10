
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
public class DicAbnormalTypeTab implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

    /**
     * 异态类型id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 异态类型名称       db_column: NAME 
     */	

	private String name;

}

