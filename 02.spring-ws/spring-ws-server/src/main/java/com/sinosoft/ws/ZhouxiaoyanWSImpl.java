package com.sinosoft.ws;

import com.sinosoft.service.ZhouxiaoyanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by zhouxiaoyan on 2017/2/13.
 */
@WebService(endpointInterface = "com.sinosoft.ws.ZhouxiaoyanWS",name = "ZhouxiaoyanWS",serviceName = "ZhouxiaoyanWS" )
@Service
public class ZhouxiaoyanWSImpl implements ZhouxiaoyanWS{

    @Autowired
    private ZhouxiaoyanService zhouxiaoyanService;

    public String sendMsg(String msg) {
        return msg;
    }
}
