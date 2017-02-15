package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.GuoruisongApi;
import org.springframework.stereotype.Service;

/**
 * Created by grs on 2017/2/15.
 */
@Service //要注意这是Spring的
public class GuoruisongDubboServiceImpl implements GuoruisongDubboService {

    @Reference
    private GuoruisongApi guoruisongApi;


    public String sendMsg(String msg) {
        return guoruisongApi.sengMsg(msg);
    }
}
