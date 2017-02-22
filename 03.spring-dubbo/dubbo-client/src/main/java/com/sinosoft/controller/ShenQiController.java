package com.sinosoft.controller;

import com.sinosoft.service.ShenQiDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shenqi on 2017/2/20.
 */
@Controller
public class ShenQiController {
    @Autowired
    private ShenQiDubboService mShenQiDubboService;


    @RequestMapping(value = "/ShenQiDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){

        return mShenQiDubboService.sendMsg(params);
    }


}
