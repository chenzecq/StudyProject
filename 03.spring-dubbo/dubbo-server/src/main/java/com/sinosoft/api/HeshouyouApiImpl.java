package com.sinosoft.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by Administrator on 2017/2/16/016.
 */

//这个service的注解是Dubbo的注解，不是常用sping的注解
//在生产者（提供者）provider中，只要实现Api就可以
@Service
public class HeshouyouApiImpl implements HeshouyouApi {

    @Override
    public String sendMsg(String msg) {
        return "Server:"+msg;
    }
}
