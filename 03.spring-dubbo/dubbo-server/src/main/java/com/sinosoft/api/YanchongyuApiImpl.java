package com.sinosoft.api;


/**
 * Created by yanchongyu on 2017/2/18
 */
@com.alibaba.dubbo.config.annotation.Service  //特别注意，这个注解，这是Dubbo的Service注解。
public class YanchongyuApiImpl implements YanchongyuApi {

    public String sengMsg(String str) {

        return "Server:"+str;
    }
}
