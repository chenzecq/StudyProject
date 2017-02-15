package com.sinosoft.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by baihc on 2017/2/15.
 */
@Service//服务端实现类,dubbo注释
public class BaihaichongApiImpl implements BaihaichongApi {

    public String sendMsg(String str) {
        System.out.println("BaihaichongApiImpl(服务端):"+str);
        return "Server:"+str;
    }
}
