package com.sinosoft.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.WangqingminApi;
import org.springframework.stereotype.Service;

/**
 * Created by WQM on 2017/2/21.
 */
@Service
public class WangqingminDubboServiceImpl implements WangqingminDubboService {
    @Reference
    public WangqingminApi wangqingminApi;

    public String sendMsg(String msg) {
        return wangqingminApi.sendMsg(msg);
    }
}
