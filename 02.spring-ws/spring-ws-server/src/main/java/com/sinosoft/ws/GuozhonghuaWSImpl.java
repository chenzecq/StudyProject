package com.sinosoft.ws;

import com.sinosoft.service.GuozhonghuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by guozhonghua on 2017/2/12.
 */
@WebService(endpointInterface = "com.sinosoft.ws.GuozhonghuaWS",name = "GuozhonghuaWS",serviceName = "GuozhonghuaWS" )
@Service
public class GuozhonghuaWSImpl implements GuozhonghuaWS{

    @Autowired
    private GuozhonghuaService guozhonghuaService;

    public String sendMsg(String msg) {
        return msg;
    }
}
