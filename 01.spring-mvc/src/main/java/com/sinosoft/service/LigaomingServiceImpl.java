package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by ligm on 2017/2/9.
 */
@Service
public class LigaomingServiceImpl implements LigaomingService {
    public String test(String a,String b){
        return a + b;
    }
}
