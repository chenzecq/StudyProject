package com.sinosoft.controller;

import com.sinosoft.service.WangnanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangna on 2017-02-10.
 */
@Controller //用于标注控制层组件
public class WangnanaController {
    @Autowired //对成员变量进行标注，完成自动装配（根据类型进行自动装配，如需要根据名称，则需配合@Qualifier使用）
    private WangnanaService tWangnanaService;

    @RequestMapping(path = "/wangnana/{params}", method = RequestMethod.GET)
    //請求參數注解,path为请求的url路径，{params}为请求参数列表，将对应到处理方法中的PathVariable中
    //method为请求的method类型，可为GET POST等

    @ResponseBody
    public String helloWangnana(@PathVariable String params){
        return tWangnanaService.getInputString(params);
    }//处理方法，根据传入参数自动匹配处理方法


}
