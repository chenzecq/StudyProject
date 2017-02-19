package com.sinosoft.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by Theron on 2017/2/16.
 */
@Service
public class JialeiApiImpl implements  JialeiApi{

    @Override
    public String sendMsg(String msg) {
        return "server" + msg ;
    }
}
