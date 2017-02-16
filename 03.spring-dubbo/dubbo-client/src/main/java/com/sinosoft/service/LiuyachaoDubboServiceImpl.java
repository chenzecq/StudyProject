package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.LiuyachaoApi;
import org.springframework.stereotype.Service;

/**
 * Created by lyc on 2017/2/16.
 */
@Service
public class LiuyachaoDubboServiceImpl implements LiuyachaoDubboService
{
    @Reference
    private LiuyachaoApi liuyachaoApi;

    public String sendMsg(String str) {
        return (liuyachaoApi.sendMsg(str));
    }
}
