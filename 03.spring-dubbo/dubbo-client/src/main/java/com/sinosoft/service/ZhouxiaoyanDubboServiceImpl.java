package com.sinosoft.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.ZhouxiaoyanApi;
import org.springframework.stereotype.Service;

/**
 * Created by zhouxiaoyan on 2017/2/17.
 * 接口服务实现类-业务类
 */

@Service
public class ZhouxiaoyanDubboServiceImpl implements ZhouxiaoyanDubboService{
    @Reference
    private ZhouxiaoyanApi zhouxiaoyanApi;
    public String sendMsg(String msg)
    {
        return zhouxiaoyanApi.sendMsg(msg);

    }
}
