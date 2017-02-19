package com.sinosoft.ws;

import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by ywb on 2017/2/12.
 */
@WebService(endpointInterface = "com.sinosoft.ws.YuanwenboWS",name = "YuanwenboWS",serviceName = "YuanwenboWS" )
@Service
public class YuanwenboWSImpl implements YuanwenboWS{

    public String sendMsg(String msg) {
        return msg;
    }
}
