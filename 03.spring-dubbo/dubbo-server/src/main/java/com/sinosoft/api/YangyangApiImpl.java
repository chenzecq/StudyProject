package com.sinosoft.api;

/**
 * Created by yangyang on 2017/2/16.
 */
@com.alibaba.dubbo.config.annotation.Service
public class YangyangApiImpl implements YangyangApi{

    public String setMsg(String str) {
        return "Server:"+str;
    }
}
