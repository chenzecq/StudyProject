package com.sinosoft.api;

/**
 * Created by WQM on 2017/2/27.
 */
@com.alibaba.dubbo.config.annotation.Service
public class WangqingminApiImpl implements WangqingminApi {
    public String sendMsg(String str) {

        return "Wangqingmin Server:" + str;
    }
}
