package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.MingzhengApi;
import org.springframework.stereotype.Service;

/**
 * Created by mingzheng on 17/2/15.
 */
@Service
public class MingzhengDubboServiceImpl implements MingzhengDubboService {
    @Reference
    private MingzhengApi mingzhengApi;
    public String sendMsg(String msg){return mingzhengApi.sendMsg(msg);}
}
