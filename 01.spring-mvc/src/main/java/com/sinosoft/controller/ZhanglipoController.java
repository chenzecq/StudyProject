package com.sinosoft.controller;

import com.sinosoft.service.ZhanglipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhanglipo on 2017/2/10.
 */
@Controller
//标注控制层组件
public class ZhanglipoController {

    //自动装配service层bean
    @Autowired
    private ZhanglipoService zhanglipoService;

    //用rest风格来传递含可变参数的url，请求方式为GET
    @RequestMapping(path= "/zhanglipo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloZhanglipo(@PathVariable String params){
        return zhanglipoService.zhanglipo(params);
    }
}
