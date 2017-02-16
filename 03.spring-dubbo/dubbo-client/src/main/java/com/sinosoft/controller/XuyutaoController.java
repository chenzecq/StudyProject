package com.sinosoft.controller;

import com.sinosoft.service.XuyutaoDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017-02-16.
 */
@Controller
public class XuyutaoController {
    @Autowired
    private XuyutaoDubboService xuyutaoDubboService ;

    @RequestMapping(value = "/XuyutaoDubbo/{paramas}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("paramas") String paramas){
        return xuyutaoDubboService.sendMsg(paramas) ;
    }
}
