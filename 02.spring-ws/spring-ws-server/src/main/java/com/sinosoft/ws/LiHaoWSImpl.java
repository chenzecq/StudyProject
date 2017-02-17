package com.sinosoft.ws;

import com.sinosoft.service.LiHaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by lihao on 2017/2/16.
 */
@WebService(endpointInterface = "com.sinosoft.ws.LiHaoWS",name = "LiHaoWS",serviceName = "LiHaoWS" )
@Service
public class LiHaoWSImpl implements LiHaoWS{

    @Autowired
    private LiHaoService lihaoService;

    public String sendMsg(String msg) {
        return msg;
    }
}
