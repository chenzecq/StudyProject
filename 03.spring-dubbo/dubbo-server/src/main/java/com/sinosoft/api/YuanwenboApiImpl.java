package com.sinosoft.api;

/**
 * Created by ywb02 on 2017/2/16.
 */
@com.alibaba.dubbo.config.annotation.Service
public class YuanwenboApiImpl implements YuanwenboApi {
    public String sendMsg(String Msg) {
        return "Server:"+Msg;
    }
}
