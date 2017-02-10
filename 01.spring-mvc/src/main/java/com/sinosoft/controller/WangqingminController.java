package com.sinosoft.controller;

import com.sinosoft.service.WangqingminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WQM on 2017/2/10.
 */
@Controller//控制层注解
public class WangqingminController {
    @Autowired//注入接口
    private WangqingminService wangqingminService;

    @RequestMapping(path = "/wangqingmin/{params}", method = RequestMethod.GET)//处理请求地址映射
    @ResponseBody//将控制层对象写入到Response对象的body数据区
    public String helloWangqingmin(@PathVariable String params) {
        return wangqingminService.wangqingmin(params);
    }
}
