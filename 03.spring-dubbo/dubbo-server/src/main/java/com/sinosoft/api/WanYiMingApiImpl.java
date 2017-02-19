package com.sinosoft.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by MyUser on 2017/2/16.
 */
@com.alibaba.dubbo.config.annotation.Service  //特别注意，这个注解，这是Dubbo的Service注解。
public class WanYiMingApiImpl implements WanYiMingApi{
    public String sengMsg(String str) {
        return "dubbo_WanYiMingServer："+ str;
    }
}
