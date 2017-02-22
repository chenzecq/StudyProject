package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.ShenQiApi;
import org.springframework.stereotype.Service;

/**
 * Created by shenqi on 2017/2/20.
 */
@Service
public class ShenQiDubboServiceImpl implements ShenQiDubboService{
    @Reference
    private ShenQiApi mShenQiApi;

    public String sendMsg(String msg) {
        return mShenQiApi.sendMsg(msg);
    }
}
