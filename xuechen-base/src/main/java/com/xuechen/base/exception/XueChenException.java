package com.xuechen.base.exception;

public class XueChenException extends RuntimeException{
    private String errMessage;

    public XueChenException() {
        super();
    }

    public XueChenException(String errMessage) {
        super(errMessage);
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public static void cast(CommonError commonError){
        throw new XueChenException(commonError.getErrMessage());
    }
    public static void cast(String errMessage){
        throw new XueChenException(errMessage);
    }
}
