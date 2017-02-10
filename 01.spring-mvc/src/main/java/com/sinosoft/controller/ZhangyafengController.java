package com.sinosoft.controller;

import com.sinosoft.service.ZhangyafengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * Created by sinosoft.zyf on 2017/2/10.
 */
// 组件声明注解，controller组件
@Controller
public class ZhangyafengController {

    // 注入（by type)
    @Autowired
    ZhangyafengService zhangyafengService;

    // 请求路径,变量使用{}包裹
    @RequestMapping(path = "/zhangyafeng/{params}/{id}",method = RequestMethod.GET)
    // 将结果生成响应体的内容（非html)
    @ResponseBody
    //获取请求路径上的变量:注解参数和路径上的变量名称相同或者变量名称与路径上的变量名称相同
    public String helloZhangyafeng(@PathVariable("params") String as,@PathVariable String id){
        System.out.println("params="+as+"\nid="+id);
        return zhangyafengService.zhangyafeng(as);
    }
}
