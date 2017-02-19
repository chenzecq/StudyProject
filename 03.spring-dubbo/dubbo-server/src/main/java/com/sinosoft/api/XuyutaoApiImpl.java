package com.sinosoft.api;

/**
 * Created by Administrator on 2017-02-16.
 */
//alibaba的服务
@com.alibaba.dubbo.config.annotation.Service
public class XuyutaoApiImpl implements XuyutaoApi {
    public String sengMsg(String str) {
        return "xuyutaoServer:"+str ;
    }
}
