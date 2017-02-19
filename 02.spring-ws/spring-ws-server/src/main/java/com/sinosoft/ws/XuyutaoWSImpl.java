package com.sinosoft.ws;

import com.sinosoft.service.XuyutaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by Administrator on 2017-02-16.
 */
@WebService(endpointInterface = "com.sinosoft.ws.XuyutaoWS",name = "XuyutaoWS",serviceName = "XuyutaoWS" )
@Service
public class XuyutaoWSImpl implements  XuyutaoWS{
    @Autowired
    private XuyutaoService xuyutaoService ;

    public String sendMsg(String msg) {
        return msg;
    }
}
