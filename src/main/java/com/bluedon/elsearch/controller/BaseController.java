package com.bluedon.elsearch.controller;

import com.bluedon.elsearch.exception.ElasicException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/12/15.
 */
@Controller
public class BaseController {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handlerException(Exception exception){
        if(exception instanceof ElasicException){
            ElasicException exException = (ElasicException) exception;
            HashMap<String,String> payload = new HashMap<String,String>();
            payload.put("exCode",exException.getExCode());
            payload.put("exMsg",exException.getExMsg());
            return payload;
        }
        return null;
    }
}
