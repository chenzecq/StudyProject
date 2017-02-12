package com.sinosoft.ws;


import com.sinosoft.service.GuoruisongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by grs on 2017/2/12.
 */
@WebService(endpointInterface = "com.sinosoft.ws.GuoruisongWS",name = "GuoruisongWS",serviceName = "GuoruisongWS" )
@Service
public class GuoruisongWSImpl implements GuoruisongWS{

    @Autowired
    private GuoruisongService guoruisongService;

    public String sendMsg(String msg) {
        return msg;
    }
}
