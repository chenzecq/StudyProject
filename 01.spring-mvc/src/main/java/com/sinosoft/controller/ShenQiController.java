package com.sinosoft.controller;

import com.sinosoft.service.ShenQiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shenqi on 2017/2/12.
 */
@Controller
public class ShenQiController {
    /** 声明服务对象*/
    @Autowired
    private ShenQiService mShenQiServive;

    @RequestMapping(path = "/shenqi/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String testShenQi(@PathVariable String params){
        return mShenQiServive.shenqi(params);
    }

}
