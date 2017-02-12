package com.sinosoft.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by sl on 2017-2-12.
 */
@WebService(endpointInterface = "com.sinosoft.ws.XingshilongWS",name = "XingshilongWS",serviceName = "XingshilongWS" )
@Service
public class XingshilongWSImpl implements XingshilongWS {

    @Autowired
    private XingshilongWS mXingshilongWS;

    public String sendMsg(String msg) {
        return "我接收到的消息是："+msg;
    }
}
