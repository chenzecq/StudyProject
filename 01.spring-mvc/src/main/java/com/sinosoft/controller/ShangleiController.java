package com.sinosoft.controller;

import com.sinosoft.service.ShangleiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/2/10.
 */
@Controller  //控制器注解
public class ShangleiController {
    @Autowired //注入shangleiService
    private ShangleiService shangleiService;
    @RequestMapping(path = "/shanglei/{params}",method = RequestMethod.GET)//请求映射  path 路径  method 以get方式请求
    @ResponseBody //用于请求处理
    public String helloShanglei(@PathVariable String params){
        return shangleiService.shanglei(params);
    }
}
