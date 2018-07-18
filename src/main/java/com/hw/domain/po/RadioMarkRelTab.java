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
public class RadioMarkRelTab implements java.io.Serializable{
    private static final long serialVersionUID = 5454155825314635342L;
    //主键
    private Long id;
    //录音id
    private Long resultId;
    //打分id
    private Long markId;
    //是否消费过 1打过分 0 未打过分 2不再打分
    private int state;

}
