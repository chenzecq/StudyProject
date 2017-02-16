package com.sinosoft.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @description： dubbo服务类，服务提供方
 * @author： mali
 * @create： 2017-02-15 18:31
 **/
//dubbo服务注解，spring根据这个注解扫描到dubbo服务
@Service
public class MaliApiImpl implements MaliApi{
    public String sendMsg(String str) {
        return "Service:"+str;
    }
}
