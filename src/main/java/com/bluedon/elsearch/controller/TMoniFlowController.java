package com.bluedon.elsearch.controller;


import com.bluedon.elsearch.service.TMoniFlowService;
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
public class TMoniFlowController extends BaseController {
    @Autowired
    private TMoniFlowService tMoniFlowService;

    @RequestMapping(value = "/createIndex", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object createIndex(String params) {
        return tMoniFlowService.createIndex(params);
    }

    @RequestMapping(value = "/indexData", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object searchData(String params) {
        return tMoniFlowService.searchIndex(params);
    }
}
