package com.sinosoft.ws;

import com.sinosoft.service.HanshashaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by hss on 2017-02-15.
 */
@WebService(endpointInterface = "com.sinosoft.ws.HanshashaWS",name = "HanshashaWS",serviceName = "HanshashaWS" )

@Service
public class HanshashaWSImpl implements HanshashaWS{

    @Autowired
    private HanshashaService hanshashaService;

    public String sendMsg(String msg) {
        return msg;
    }
}
