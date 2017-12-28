package com.hw.domain.po;

/**
 * Created by liubin11 on 2017/12/21.
 */
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActId() {
        return actId;
    }

    public void setActId(Long actId) {
        this.actId = actId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getYn() {
        return yn;
    }

    public void setYn(int yn) {
        this.yn = yn;
    }
}
