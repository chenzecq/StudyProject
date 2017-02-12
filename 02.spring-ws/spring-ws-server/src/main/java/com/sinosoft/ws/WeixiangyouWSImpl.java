package com.sinosoft.ws;

import com.sinosoft.service.WeixiangyouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by wei on 2017/2/12.
 */
@WebService(endpointInterface = "com.sinosoft.ws.WeixiangyouWS",name = "WeixiangyouWS",serviceName = "WeixiangyouWS" )
@Service
public class WeixiangyouWSImpl implements WeixiangyouWS {

    @Autowired
    private WeixiangyouService WeixiangyouService;
    public String sendMsg(String pMsg) {return pMsg;}
}
