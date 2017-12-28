package com.hw.common.utils;


public class ResultFactory {
    public static Result ERROR_RESULT ;
    public static Result SUCCESS_RESULT;

    /**
     * 带错误信息错误信息相应体
     * @param message
     * @return
     */
    public static Result getErrorResult(String message){
        if (ERROR_RESULT == null){
            ERROR_RESULT = new Result(false,message);
        }else{
            ERROR_RESULT.setMessage(message);
        }
        return ERROR_RESULT;
    }

    /**
     * 不带参数错误信息相应体
     * 默认为错误信息为操作失败
     * @return
     */
    public static Result getErrorResult(){
        return getErrorResult("操作失败！！！");
    }

    /**
     * 带参数正确的实体相应题
     * @param message
     * @return
     */
    public static Result getSuccessResult(String message){
        if (SUCCESS_RESULT == null){
            SUCCESS_RESULT = new Result(true,message);
        }else{
            SUCCESS_RESULT.setMessage(message);
        }
        return SUCCESS_RESULT;
    }

    /**
     * 不带参数正确的信息相应体
     * 默认为错误信息为操作成功
     * @return
     */
    public static Result getSuccessResult(){
        return getSuccessResult("操作成功！！！");
    }

}
