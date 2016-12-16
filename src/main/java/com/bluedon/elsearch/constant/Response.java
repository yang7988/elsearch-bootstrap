package com.bluedon.elsearch.constant;

/**
 * Created by Administrator on 2016/12/16.
 * 响应报文
 */
public class Response {
    private String exCode;
    private String exMsg;
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
