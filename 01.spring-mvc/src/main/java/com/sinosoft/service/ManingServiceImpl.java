package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by maning on 2017/2/21.
 * SpringMVC例子的具体实现类
 */
@Service
public class ManingServiceImpl implements ManingService {

    public String getResult(String result) {
        return "The Result is :" + result;
    }
}
