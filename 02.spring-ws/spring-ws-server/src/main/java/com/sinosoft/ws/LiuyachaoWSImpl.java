package com.sinosoft.ws;

import com.sinosoft.service.LiuyachaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by lyc on 2017/2/15.
 */
@WebService(endpointInterface = "com.sinosoft.ws.LiuyachaoWS",name = "LiuyachaoWS",serviceName = "LiuyachaoWS" )
@Service
public class LiuyachaoWSImpl implements LiuyachaoWS {
    @Autowired
    private LiuyachaoService liuyachaoService;

    public String sendMsg(String msg) {
        return msg;
    }
}
