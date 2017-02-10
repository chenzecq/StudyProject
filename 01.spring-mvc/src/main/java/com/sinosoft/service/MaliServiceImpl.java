package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * @description：
 * @author： mali
 * @create： 2017-02-10 17:50
 **/
@Service
public class MaliServiceImpl implements MaliService {
    public String helloSomebody(String userName) {
        return "Hello "+userName;
    }
}
