package com.sinosoft.ws;

import com.sinosoft.service.YangmingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by yangming on 2017/2/10.
 */
@WebService(endpointInterface = "com.sinosoft.ws.YangmingWS",name = "YangmingWS",serviceName = "YangmingWS" )
@Service
public class YangmingWSImpl implements YangmingWS{

    @Autowired
    private YangmingService yangmingService;

    public String sendMsg(String msg) {
        return msg;
    }
}
