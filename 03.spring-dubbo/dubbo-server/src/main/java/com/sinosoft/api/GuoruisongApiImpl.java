package com.sinosoft.api;


/**
 * Created by grs on 2017/2/15.
 */
@com.alibaba.dubbo.config.annotation.Service  //特别注意，这个注解，这是Dubbo的Service注解。
public class GuoruisongApiImpl implements GuoruisongApi {

    public String sengMsg(String str) {

        return "Server:"+str;
    }
}
