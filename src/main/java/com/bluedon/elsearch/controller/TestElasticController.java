package com.bluedon.elsearch.controller;

import com.bluedon.elsearch.constant.ExceptionDefinition;
import com.bluedon.elsearch.exception.ElasicException;
import com.bluedon.elsearch.service.ElasticService;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by xyy on 2016/12/15.
 */
@Controller
@RequestMapping(value = "/elastic")
public class TestElasticController extends BaseController{
    @Autowired
    private ElasticService elasticService;
    @RequestMapping(value = "/createIndex",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Object createIndex(String params) {
        return elasticService.createIndex(params);
    }

}
