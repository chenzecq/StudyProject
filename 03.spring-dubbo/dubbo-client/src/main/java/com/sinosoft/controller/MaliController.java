package com.sinosoft.controller;

import com.sinosoft.service.MaliDubboService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description： 调用dubbo服务端的controller
 * @author： mali
 * @create： 2017-02-15 22:10
 **/
//spirng controller注解，扫描时识别controller bean对象
@Controller
public class MaliController {
    private final Logger logger = LogManager.getLogger(getClass());
    //spring注解，注入调用dubbo服务端对应客户端的bean
    @Autowired
    private MaliDubboService maliDubboService;
    //controller对应的访问路径，使用动态路径（URI）
    @RequestMapping(value = "/MaliDubbo/{param}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable(name = "param") String str){
        if(maliDubboService == null){
            logger.error("MaliDubboService is null .");
            return null;
        }else{
            return maliDubboService.sendMsg(str);
        }
    }
}
