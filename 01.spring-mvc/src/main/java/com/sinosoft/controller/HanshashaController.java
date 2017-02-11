package com.sinosoft.controller;

import com.sinosoft.service.HanshashaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hss on 2017-02-10.
 * Controller控制器
 */
@Controller
public class HanshashaController {
    @Autowired
    private HanshashaService hanshashaService;

    //请求路径和请求方式
    @RequestMapping(path = "/hanshasha/{params}",method = RequestMethod.GET)

    @ResponseBody
    public String helloHanshasha(@PathVariable String params){
        return hanshashaService.Hanshasha(params);
    }

}
