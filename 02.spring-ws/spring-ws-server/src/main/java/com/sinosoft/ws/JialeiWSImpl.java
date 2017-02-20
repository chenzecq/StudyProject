package com.sinosoft.ws;

import com.sinosoft.service.JialeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.WebServiceClient;

/**
 * Created by Theron on 2017/2/15.
 */

@WebService(endpointInterface = "com.sinosoft.ws.JialeiWS",name = "JialeiWS",serviceName = "JialeiWS")
@Service
public class JialeiWSImpl implements JialeiWS {

    @Autowired
    private JialeiService jialeiService;

    public String dealMsg(String msg) {
        return msg;
    }
}
