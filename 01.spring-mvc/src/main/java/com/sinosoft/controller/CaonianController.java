package com.sinosoft.controller;

import com.sinosoft.service.CaonianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cao on 2017/2/13.
 */
@Controller
public class CaonianController  {
    @Autowired
    private CaonianService mCaonianService;

    @RequestMapping(path = "/caonian/{tParams1}", method = RequestMethod.GET)
    @ResponseBody
    public String helloCaonian(@PathVariable String tParams1)
    {
        return mCaonianService.getMsg(tParams1);
    }
}
