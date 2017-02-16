package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.GuozhonghuaApi;
import org.springframework.stereotype.Service;

/**
 * Created by guozhonghua on 2017/2/16.
 */
@Service //要注意这是Spring的
public class GuozhonghuaDubboServiceImpl implements GuozhonghuaDubboService {

    @Reference
    private GuozhonghuaApi guozhonghuaApi;


    public String sendMsg(String msg) {
        System.out.println("===进入client的impl===");
        return guozhonghuaApi.sengMsg(msg);
    }
}
