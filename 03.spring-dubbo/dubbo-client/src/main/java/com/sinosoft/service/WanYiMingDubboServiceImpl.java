package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.WanYiMingApi;
import org.springframework.stereotype.Service;

/**
 * Created by WanYiMing on 2017/2/19.
 */
@Service
public class WanYiMingDubboServiceImpl  implements  WanYiMingDubboService  {

    @Reference
    private WanYiMingApi wanYiMingApi;

    public String sendMsg(String msg) {

        return wanYiMingApi.sengMsg(msg);
    }
}
