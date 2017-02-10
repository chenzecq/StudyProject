package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by pengfang on 2017/2/10.
 */
@Service
public class PengFangServiceImpl implements PengFangService{
    public String pengFang(String name){
        return name ;
    }
}
