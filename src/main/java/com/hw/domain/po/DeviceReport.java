package com.hw.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by liubin11 on 2017/12/21.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceReport  implements java.io.Serializable{
    private static final long serialVersionUID = 5454155825314635342L;
    //主键
    private Long id;
    //相应id
    private Long actId;
    //相应msg
    private String msg;
    //是否消费过 1消费国 0 未消费过
    private int yn;

}
