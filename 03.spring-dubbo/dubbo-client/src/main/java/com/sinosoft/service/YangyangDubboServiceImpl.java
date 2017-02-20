package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.YangyangApi;
import org.springframework.stereotype.Service;

/**
 * Created by yangyang on 2017/2/16.
 */
@Service //要注意这是Spring的
public class YangyangDubboServiceImpl implements YangyangDubboService{
    @Reference
    private YangyangApi yangyangApi;

    public String sendMsg(String msg) {
        return yangyangApi.setMsg(msg);
    }
}
