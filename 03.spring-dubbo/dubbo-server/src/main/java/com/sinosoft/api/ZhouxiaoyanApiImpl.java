package com.sinosoft.api;

/**
 * Created by zhouxiaoyan on 2017/2/17.
 * 服务端实现api
 */
@com.alibaba.dubbo.config.annotation.Service
public class ZhouxiaoyanApiImpl implements ZhouxiaoyanApi {
    public String sendMsg(String str)
    {
        return "Server:"+str;
    }

}
