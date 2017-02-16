package com.sinosoft.controller;

import com.sinosoft.service.LiuyachaoDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lyc on 2017/2/16.
 */
@Controller
public class LiuyachaoController {
    @Autowired
    private LiuyachaoDubboService liuyachaoDubboService;

    @RequestMapping(value = "/LiuyachaoDubbo/{params}",method = RequestMethod.GET)

    @ResponseBody
    public  String service(@PathVariable("params") String str){
        return  liuyachaoDubboService.sendMsg(str);
    }
}
