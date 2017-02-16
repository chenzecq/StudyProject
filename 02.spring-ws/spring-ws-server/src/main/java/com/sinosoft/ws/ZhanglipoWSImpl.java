package com.sinosoft.ws;

import com.sinosoft.service.ZhanglipoService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

/**
 * Created by zhanglipo on 2017/2/16.
 */
@WebService(endpointInterface="com.sinosoft.ws.ZhanglipoWS",name="ZhanglipoWS",serviceName = "ZhanglipoWS")
public class ZhanglipoWSImpl implements ZhanglipoWS{

    @Autowired
    ZhanglipoService zhanglipoService;

    @Override
    public String sendMsg(String msg) {
        return msg;
    }
}
