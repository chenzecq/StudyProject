package com.sinosoft.controller;

import com.sinosoft.service.LiujiachengDubboService;
import com.sinosoft.service.YangmingDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liujc on 2017/2/15.
 */
//标记为控制器 ，请求转发
@Controller
public class LiujiachengController {
//自动装配
    @Autowired
    private LiujiachengDubboService liujiachengDubboservice;


    @RequestMapping(value = "/LiujiachengDubbo/{params}",method = RequestMethod.GET)
    //用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，写入到Response对象的body数据区
    //PathVariable:标记一个controller的处理方法参数，表示该参数的值将使用URL模板中对应的变量的值赋值   把LiujiachengDubbo/{params} 中的 params给@PathVariable("params" 中的 params
    @ResponseBody
    public String service(@PathVariable("params") String params){

        return liujiachengDubboservice.sendMsg(params);
    }
}
