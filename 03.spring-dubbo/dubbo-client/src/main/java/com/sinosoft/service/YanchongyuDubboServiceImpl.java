package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.YanchongyuApi;
import org.springframework.stereotype.Service;

/**
 * Created by yanchongyu on 2017/2/18.
 */
@Service
public class YanchongyuDubboServiceImpl implements YanchongyuDubboService {

    @Reference
    private YanchongyuApi yanchongyuApi;


    public String sendMsg(String msg) {
        return yanchongyuApi.sengMsg(msg);
    }
}
