package com.sinosoft.controller;

import com.sinosoft.service.MingzhengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cimo on 2017/2/9.
 */
@Controller  //控制器注解
public class MingzhengController {


    @Autowired  //自动装备相关注解
    private MingzhengService mingzhengService;  //声明service服务对象

    @RequestMapping(path = "/mingzheng/{params}",method = RequestMethod.GET) //get请求注解{params}为可变参数
    @ResponseBody
    public String helloMingzheng(@PathVariable String params){
        return mingzhengService.mingzheng(params);
    }  //请求处理类,调用service服务,传入参数
}
