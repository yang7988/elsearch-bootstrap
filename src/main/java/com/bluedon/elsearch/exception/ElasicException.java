package com.bluedon.elsearch.exception;

/**
 * Created by xyy on 2016/12/15.
 */
public class ElasicException extends RuntimeException{
    private String exCode;
    private String exMsg;

    public ElasicException() {}

    public ElasicException(String exMsg) {
        super(exMsg);
    }
    public ElasicException(String exCode,String exMsg) {
        super(exMsg);
        this.exCode = exCode;
        this.exMsg = exMsg;
    }

    public String getExCode() {
        return exCode;
    }

    public void setExCode(String exCode) {
        this.exCode = exCode;
    }

    public String getExMsg() {
        return exMsg;
    }

    public void setExMsg(String exMsg) {
        this.exMsg = exMsg;
    }
}
