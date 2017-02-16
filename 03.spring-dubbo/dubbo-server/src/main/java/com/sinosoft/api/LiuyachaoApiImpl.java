package com.sinosoft.api;

/**
 * Created by lyc on 2017/2/16.
 */
@com.alibaba.dubbo.config.annotation.Service  //copy过来的
public class LiuyachaoApiImpl implements  LiuyachaoApi {

    public String sendMsg(String str) {
        return "TEST:"+str;
    }
}
