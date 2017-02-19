package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.ZhaotuoApi;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/17.
 */
@Service
public class ZhaotuoDubboServiceImpl implements ZhaotuoDubboService{
    @Reference
    private ZhaotuoApi zhaotuoApi;
    public String sendMsg(String msg) {
        return zhaotuoApi.sengMsg(msg);
    }
}
