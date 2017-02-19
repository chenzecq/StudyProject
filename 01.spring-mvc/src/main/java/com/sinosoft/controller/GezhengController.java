package com.sinosoft.controller;

import com.sinosoft.service.GezhengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/2/19.
 */
@Controller
public class GezhengController {
    @Autowired
    private GezhengService gezhengService ;


    //path为请求地址 method为请求的方法类型
    @RequestMapping(path = "/gezheng/{params}",method = RequestMethod.GET)
    //将http请求正文转为所需要类型对象的消息转化器对象
    @ResponseBody
     public String helloGezheng(@PathVariable String params){
        return gezhengService.gezheng(params);
    }

}
