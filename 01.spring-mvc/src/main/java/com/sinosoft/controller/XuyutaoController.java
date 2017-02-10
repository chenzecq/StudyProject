package com.sinosoft.controller;

import com.sinosoft.service.XuyutaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xyt on 2017/2/10.
 */
//标记此类为控制类
@Controller
public class XuyutaoController {
    //说明此变量为自动装配，可以标注在变量、方法、和构造函数
    @Autowired
    private XuyutaoService xuyutaoService ;
    //处理请求地址映射的注解，path：请求的实际地址({params}为可变参数)，method：指定请求的方法类型，
    @RequestMapping(path = "/xuyutao/{params}",method = RequestMethod.GET)
    //将http请求正文转为所需要类型对象的消息转化器对象
    @ResponseBody
    //@PathVariable:将请求地址url中的参数绑定到控制器处理方法的入参中，注意：如果url中的参数名称和处理方法的入参名称不一致，需要通过@PathVariable("url中参数名称(params)")进行绑定处理方法的入参中
    //此处常用有：@RequestParam把请求参数传递给请求方法的入参中 @RequestHeader将消息头绑定到请求方法的入参中、@CookieValue将coolie中的值绑定到请求方法的入参中
    public String helloXuyutao(@PathVariable String params){
        return xuyutaoService.xuyutao(params);
    }
}
