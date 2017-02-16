package com.sinosoft.api;

/**
 * Created by pengfang on 2017/2/16.
 */
@com.alibaba.dubbo.config.annotation.Service
public class PengfangApiImpl implements PengfangApi {
    public String sengMsg(String str) {
        return "service"+str;
    }
}
