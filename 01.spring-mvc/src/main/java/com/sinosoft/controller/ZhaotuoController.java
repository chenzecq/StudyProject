package com.sinosoft.controller;

import com.sinosoft.service.ZhaotuoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/2/10.
 */
@Controller//控制层注解
public class ZhaotuoController {
    @Autowired//依赖注入
    private ZhaotuoServiceImpl service;
    @RequestMapping(path = "/zhaotuo/{params}",method = RequestMethod.GET)//浏览器的请求路径匹配这里的路径执行这个方法
    @ResponseBody
    public String hello(@PathVariable String params){//path中的params是什么，就会传到这个方法中作为参数
        return service.zt(params);
    }
}
