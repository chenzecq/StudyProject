package com.sinosoft.ws;

import com.sinosoft.service.WeijianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by wei on 2017/2/15.
 */
@WebService(endpointInterface = "com.sinosoft.ws.WeijianWS", name="WeijianWS", serviceName = "WeijianWS")
@Service
public class WeijianWSImpl implements WeijianWS {

    @Autowired
    private WeijianService weijianService;
    public String sendMsg(String msg) {
        //weijianService.dealMsg(msg);
        return msg;
    }

}
