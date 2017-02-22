package com.sinosoft.api;

/**
 * Created by shenqi on 2017/2/20.
 */
@com.alibaba.dubbo.config.annotation.Service  //dubbo的service注解
public class ShenQiApiImpl implements  ShenQiApi{
    public String sendMsg(String str) {
        return "ShenQI_Server:"+str;
    }
}
