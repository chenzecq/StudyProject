package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.PinghenghengApi;
import org.springframework.stereotype.Service;

/**
 * Created by pinghengheng on 2017/2/19.
 * 该类会引用Api层的接口。
 */
//这个是Spring的注解。
@Service
public class PinghenghengDubboServiceImpl implements PinghenghengDubboService{

    @Reference
    private PinghenghengApi pinghenghengApi;

    public String sendMsg(String msg){
        return pinghenghengApi.sengMsg(msg);
    }

}
