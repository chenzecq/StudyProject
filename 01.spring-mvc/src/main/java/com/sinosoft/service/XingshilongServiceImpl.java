package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by sl on 2017-2-12.
 */
@Service
public class XingshilongServiceImpl implements  XingshilongService {
    public String xingshilong(String str) {
        return "my name is "+str;
    }
}
