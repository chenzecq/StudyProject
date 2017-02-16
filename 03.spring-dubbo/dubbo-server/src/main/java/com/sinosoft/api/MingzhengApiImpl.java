package com.sinosoft.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by mingzheng on 17/2/15.
 */
@Service
public class MingzhengApiImpl implements MingzhengApi{
    public String sendMsg(String msg){
        return "Server 返回内容:"+msg;
    }
}
