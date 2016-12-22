package com.bluedon.elsearch.controller;

import com.bluedon.elsearch.constant.ExceptionDefinition;
import com.bluedon.elsearch.constant.Response;
import com.bluedon.elsearch.exception.ElasicException;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/12/15.
 */
@Controller
public class BaseController {
    private static Logger logger = Logger.getLogger(BaseController.class);

    /**
     * 参数校验
     * @param params
     */
    public void validateParams(String params){
        if(StringUtils.isEmpty(params)){
            logger.error(String.format("参数异常,传递参数:params=%s",params));
            throw new ElasicException(ExceptionDefinition.PARAM_EX,ExceptionDefinition.PARAM_EXMSG);
        }
    }

    /**
     * 异常处理
     * @param exception
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handlerException(Exception exception){
        if(exception instanceof ElasicException){
            ElasicException exException = (ElasicException) exception;
            Response response = new Response();
            response.setExCode(exException.getExCode());
            response.setExMsg(exException.getExMsg());
            return response;
        }
        return null;
    }
}
