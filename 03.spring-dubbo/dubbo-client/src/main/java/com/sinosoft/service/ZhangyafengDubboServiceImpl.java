package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.ZhangyafengApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sinosoft.zyf on 2017/2/15.
 */
@Service    //Spring组件
public class ZhangyafengDubboServiceImpl implements ZhangyafengDubboService{

    @Reference
    ZhangyafengApi zhangyafengApi;

    public String sendMsg(String msg) {
        return zhangyafengApi.sendMsg(msg);
    }
}
