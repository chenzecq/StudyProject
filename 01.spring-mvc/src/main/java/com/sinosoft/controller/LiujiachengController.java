package com.sinosoft.controller;

import com.sinosoft.service.GuzhonghuiService;
import com.sinosoft.service.LiujiachengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ljc on 2017/2/11.
 */
@Controller   //标记LiujiachengController 是一个控制器类，负责请求转发
public class LiujiachengController {

    @Autowired  //将业务层的接口注入
    private LiujiachengService liujiachengService;

//    定义URL（get方式） 请求，当请求path（请求地址）为liujiacheng/* 时，调用helloliujc（）方法
    @RequestMapping(path = "/liujiacheng/{params}", method = RequestMethod.GET)
//    该注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，写入到Response对象的body数据区
    @ResponseBody
    public String helloliujc(@PathVariable String params) {   //绑定URI地址中的变量到方法参数
        return liujiachengService.liujiacherng(params);
    }
}
