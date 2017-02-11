package com.sinosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.sinosoft.service.ChencaiyongService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chency on 2017/2/9.。
 */
@Controller
public class ChencaiyongController {
    //完成自动装配的工作
    @Autowired
    private ChencaiyongService chencaiyongService;

    @RequestMapping(path = "/chencaiyong/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String callChencaiyong(@PathVariable String params){
        return chencaiyongService.getName(params);
    }
}
