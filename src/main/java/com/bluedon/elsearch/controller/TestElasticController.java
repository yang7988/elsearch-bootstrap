package com.bluedon.elsearch.controller;

import com.bluedon.elsearch.constant.ExceptionDefinition;
import com.bluedon.elsearch.exception.ElasicException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/12/15.
 */
@Controller
@RequestMapping(value = "/elastic")
public class TestElasticController extends BaseController{

    @RequestMapping(value = "createIndex",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Object createIndex(String params){
        if(StringUtils.isEmpty(params)){
            throw new ElasicException(ExceptionDefinition.PARAM_EX,ExceptionDefinition.PARAM_EXMSG);
        }
        return null;
    }
}
