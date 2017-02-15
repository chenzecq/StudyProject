package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.sinosoft.api.YangmingApi;

/**
 * Created by yangming on 2017/2/12.
 */
public interface YangmingDubboService {

    public String sendMsg(String msg);

}
