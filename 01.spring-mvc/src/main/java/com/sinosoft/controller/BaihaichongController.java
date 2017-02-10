package com.sinosoft.controller;

import com.sinosoft.service.BaihaichongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by baihc on 2017/2/10.
 */
@Controller
public class BaihaichongController {
    @Autowired
    BaihaichongService baihaichongService;

    @RequestMapping(path="/baihaichong/{params}",method = RequestMethod.GET)//注解为控制器指定可以处理哪些 URL 请求
    @ResponseBody//该注解用于将Controller的方法返回的对象写入到Response对象的body数据区
    public String helloBai(@PathVariable String params){return baihaichongService.baihaichong(params);}

}
