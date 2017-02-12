package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by shenqi on 2017/2/12.
 */
@Service
public class ShenQiServiceImpl implements ShenQiService{//接口实现类，接收参数并返回
    public String shenqi(String  data){
        return data;
    }
}
