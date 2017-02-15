package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.BaihaichongApi;
import org.springframework.stereotype.Service;

/**
 * Created by baihc on 2017/2/15.
 */
@Service
public class BaihaichongDubboServiceImpl implements BaihaichongDubboService {
    @Reference
    BaihaichongApi baihaichongApi;

    public String sendMsg(String msg) {
        if(baihaichongApi!=null){
            System.out.println("BaihaichongDubboServiceImpl(客户端):"+msg);
            return baihaichongApi.sendMsg(msg);//调用dubbo服务
        }
        return null;
    }
}
