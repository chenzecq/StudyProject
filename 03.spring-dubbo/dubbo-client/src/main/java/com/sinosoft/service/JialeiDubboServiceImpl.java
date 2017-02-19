package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.JialeiApi;
import org.springframework.stereotype.Service;



/**
 * Created by Theron on 2017/2/16.
 */
@Service
public class JialeiDubboServiceImpl implements JialeiDubboService{

    @Reference//引用，注意是dubbo的
    private JialeiApi jialeiApi;

    public String sendMsg(String msg) {
        return jialeiApi.sendMsg(msg);
    }
}
