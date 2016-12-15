package com.bluedon.elsearch.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xyy on 2016/12/15.
 */
@Controller
class HomeController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    @ResponseBody
    public Object index(){
        String str = "the elasitcsearch service is already ...";
        System.out.print(str);
        return str;
    }
}
