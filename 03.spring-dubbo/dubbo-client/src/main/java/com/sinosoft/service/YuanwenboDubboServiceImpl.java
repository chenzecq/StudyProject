package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.YuanwenboApi;
import org.springframework.stereotype.Service;

/**
 * Created by ywb on 2017/2/16.
 */
@Service
public class YuanwenboDubboServiceImpl implements YuanwenboDubboService {
    @Reference
    private YuanwenboApi yuanwenboApi;


    public String sendMsg(String Msg) {
        return yuanwenboApi.sendMsg(Msg);
    }
}
