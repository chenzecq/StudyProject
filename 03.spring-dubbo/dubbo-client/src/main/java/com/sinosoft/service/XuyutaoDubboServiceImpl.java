package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.XuyutaoApi;
import org.springframework.stereotype.Service;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Reference;

/**
 * Created by Administrator on 2017-02-16.
 */
//spring服务
@Service
public class XuyutaoDubboServiceImpl implements XuyutaoDubboService{

    //alibaba旗下注入服务端的接口
    @Reference
    private XuyutaoApi xuyutaoApi ;

    public String sendMsg(String msg) {
        return xuyutaoApi.sengMsg(msg);
    }
}
