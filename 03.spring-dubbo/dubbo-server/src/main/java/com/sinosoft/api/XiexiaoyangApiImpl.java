package com.sinosoft.api;

/**
 * Created by apple-pc on 2017/2/16.
 */
@com.alibaba.dubbo.config.annotation.Service  //特别注意，这个注解，这是Dubbo的Service注解。
public class XiexiaoyangApiImpl implements XiexiaoyangApi{
    public String sengMsg(String str) {

        return "Server:"+str;
    }
}
