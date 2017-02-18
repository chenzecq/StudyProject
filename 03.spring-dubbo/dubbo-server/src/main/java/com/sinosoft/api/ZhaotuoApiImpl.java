package com.sinosoft.api;

/**
 * Created by Administrator on 2017/2/17.
 */
@com.alibaba.dubbo.config.annotation.Service   //这里是dubbo的service注解
public class ZhaotuoApiImpl implements ZhaotuoApi {
    public String sengMsg(String str) {

        return "Server:"+str;
    }
}
