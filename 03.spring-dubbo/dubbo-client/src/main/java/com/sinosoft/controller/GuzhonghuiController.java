package com.sinosoft.controller;

import com.sinosoft.service.GuzhonghuiDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.io.IOException;

/**
 * @Author: by guzhonghui
 * @Date: Created in 13:32 2017/2/15
 * @Description:
 */
@Controller   //这是Spring注解和@Service作用一样    为了标示是控制层因此用Controller
public class GuzhonghuiController {
    @Autowired//通过spring的自动注入  将业务层接口注入
    private GuzhonghuiDubboService guzhonghuiDubboService;

    @RequestMapping(value = "/GuzhonghuiDubbo/{params}", method = RequestMethod.GET)
    @ResponseBody
    public Object service(@PathVariable("params") String params) throws IOException {

        return guzhonghuiDubboService.sendMsg(params);
    }

}
