package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * @description：Controller test
 * @author： guozhonghua
 * @create： 2017-02-11 10:30
 **/
@Service
public class GuozhonghuaServiceImpl implements GuozhonghuaService{

    public String helloSpringMvc(String z ){
        return z;
    }
}
