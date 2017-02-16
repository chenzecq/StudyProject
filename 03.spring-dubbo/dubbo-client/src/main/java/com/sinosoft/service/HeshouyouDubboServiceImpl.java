package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.HeshouyouApi;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/16/016.
 */

//客户端的业务层里面使用的是spring的注解
@Service
public class HeshouyouDubboServiceImpl implements HeshouyouDubboService {

    //通过这个注解，指向提供的接口，可以直接调用服务器的实现方法
    @Reference
    private HeshouyouApi heshouyouApi;

    @Override
    public String sendMsg(String msg) {
        return heshouyouApi.sendMsg(msg);
    }
}
