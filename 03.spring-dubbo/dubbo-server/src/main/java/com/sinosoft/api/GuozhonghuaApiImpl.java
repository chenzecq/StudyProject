package com.sinosoft.api;


/**
 * Created by guozhonghua on 2017/2/16.
 */
@com.alibaba.dubbo.config.annotation.Service  //特别注意，这个注解，这是Dubbo的Service注解。
public class GuozhonghuaApiImpl implements GuozhonghuaApi {

    public String sengMsg(String str) {
        System.out.println("===进入server的impl===");
        return "Server:"+str;
    }
}
