package com.sinosoft.controller;

import com.sinosoft.service.XiexiaoyangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiexiaoyang on 2017/2/11.
 */
@Controller //定义一个控制器类
public class XiexiaoyangController {

    @Autowired //完成自动化装配
    private XiexiaoyangService xiexiaoyangService;

    //映射URI到控制器类，并在URI中定义一个变量，然后在映射时动态给变量赋值
    @RequestMapping(path = "/xiexiaoyang/{params}", method = RequestMethod.GET)
    //通过HttpMessageConverter转换为特定格式后，写入Response对象的body数据区
    @ResponseBody
    //@PathVariable标记一个controller处理方法参数，表示该参数值将使用URI模板中对应的变量值来赋值
    public String helloXiexiaoyang(@PathVariable String params){
        return xiexiaoyangService.xiexiaoyang(params);
    }
}
