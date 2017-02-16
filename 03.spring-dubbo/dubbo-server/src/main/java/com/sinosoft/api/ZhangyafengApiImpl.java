package com.sinosoft.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by sinosoft.zyf on 2017/2/15.
 */
@Service //dubbo的service注解
public class ZhangyafengApiImpl implements ZhangyafengApi {
    public String sendMsg(String msg) {
        return "Server:"+msg;
    }
}
