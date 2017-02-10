package com.sinosoft.controller;

import com.sinosoft.service.SundongboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project ask
 * Created by Sun on 10.
 * <pre>
 * 林花谢了春红，太匆匆，无奈朝来寒雨晚来风。
 * 胭脂泪，相留醉，几时重，自是人生长恨水长东。
 *
 * --翼羽水淼起辰月，秋山红日望紫枫--
 * </pre>
 */
@Controller
public class SundongboController {
    @Autowired
    private SundongboService sundongboService;

    @RequestMapping(path = "/sundongbo/{question}",method = RequestMethod.GET)
    @ResponseBody
    public String helloSundongbo(@PathVariable String question){
        return sundongboService.askQ(question);
    }
}
