package com.sinosoft.controller;

import com.sinosoft.service.WanYiMingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by MyUser on 2017/2/12.
 */
@Controller  //将此类 定义为已Controller  Spring中的控制器
public class WanYiMingController {

    @Autowired  //自动装配 或者说注入 此组件
    private WanYiMingService wanYiMingService;

    //注解  请求映射   在这里映射url请求地址  以及请求参数
    @RequestMapping(path = "/wanyiming/{params}",method = RequestMethod.GET)
    @ResponseBody //将返回结果写入  返回视图对象中
    public String  helloWanYiMing(@PathVariable String params){ //将  params请求参数 绑定为这个方法的参数，
        return  wanYiMingService.wanYiMing(params);
    }
}
