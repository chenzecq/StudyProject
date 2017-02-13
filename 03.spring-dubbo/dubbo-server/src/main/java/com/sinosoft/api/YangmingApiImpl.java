package com.sinosoft.api;


/**
 * Created by yangming on 2017/2/11.
 */
@com.alibaba.dubbo.config.annotation.Service  //特别注意，这个注解，这是Dubbo的Service注解。
public class YangmingApiImpl implements YangmingApi {


    public String sengMsg(String str) {
        return "Server:"+str;
    }
}
