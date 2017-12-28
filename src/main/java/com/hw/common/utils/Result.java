package com.hw.common.utils;

/**
 * 请求结果
 */
public class Result {

    // 操作结果
    private boolean state = true;

    // 错误信息
    private String message;

    // 附属对象
    private Object object;

    public Result(boolean state, String message) {
        super();
        this.state = state;
        this.message = message;
    }

    public Result(boolean state, String message, Object object) {
        super();
        this.state = state;
        this.message = message;
        this.object = object;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}

