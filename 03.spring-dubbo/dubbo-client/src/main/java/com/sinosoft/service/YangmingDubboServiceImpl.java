package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.YangmingApi;
import org.springframework.stereotype.Component;

/**
 * Created by yangming on 2017/2/12.
 */
@Component //要注意这是Spring的
public class YangmingDubboServiceImpl implements YangmingDubboService {

    @Reference
    private YangmingApi yangmingApi;


    public String sendMsg(String msg) {
        return yangmingApi.sengMsg(msg);
    }
}
