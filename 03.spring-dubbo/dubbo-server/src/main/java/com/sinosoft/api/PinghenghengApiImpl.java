package com.sinosoft.api;

/**
 * Created by pinghengheng on 2017/2/19.
 * 实现api层中的接口。
 */
//注意区分这是Dubbo的注解。
@com.alibaba.dubbo.config.annotation.Service
public class PinghenghengApiImpl implements PinghenghengApi{

    public String sengMsg(String str){
        return "Server:" + str;
    }

}
