package com.sinosoft.ws;

import com.sinosoft.service.MingzhengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by cimo on 2017/2/12.
 */
@WebService(endpointInterface = "com.sinosoft.ws.MingzhengWS",name = "MingzhengWS",serviceName = "MingzhengWS" )
@Service
public class MingzhengWSImpl implements MingzhengWS{

    @Autowired
    private MingzhengService mingzhengService;

    public String sendMsg(String msg) {
        System.out.println("*****msg*****:"+msg); return msg;
    }
}
