package com.sinosoft.ws;

import com.sinosoft.service.ZhangyafengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by sinosoft.zyf on 2017/2/11.
 */
@WebService(
        endpointInterface = "com.sinosoft.ws.ZhangyafengWS",
        name = "ZhangyafengWS",
        serviceName = "ZhangyafengWS"
)
@Service
public class ZhangyafengWSImpl implements ZhangyafengWS {

    @Autowired
    ZhangyafengService service;

    public String sendMsg(String msg) {
        /*if(service2 == null){
            System.out.println("service is null!");
            return msg;
        }
        return service.dealMsg(msg);*/
        return msg;
    }

}
