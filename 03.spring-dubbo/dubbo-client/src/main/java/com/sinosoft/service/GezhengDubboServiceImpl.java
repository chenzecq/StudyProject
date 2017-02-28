package com.sinosoft.service;

import com.sinosoft.api.GezhengApi;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GezhengDubboServiceImpl implements GezhengDubboService{

    private GezhengApi gezhengApi;

    public String sendMsg(String msg) {
        return gezhengApi.sendMsg(msg);
    }

}
