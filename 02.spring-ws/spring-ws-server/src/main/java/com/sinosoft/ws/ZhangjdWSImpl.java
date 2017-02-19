package com.sinosoft.ws;

import com.sinosoft.service.ZhangjdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by Administrator on 2017/2/13.
 */
@WebService(endpointInterface = "com.sinosoft.ws.ZhangjdWS",name = "ZhangjdWS",serviceName = "ZhangjdWS" )
@Service
public class ZhangjdWSImpl implements  ZhangjdWS  {
    @Autowired
    private ZhangjdService zhangjdService;
    public String sendMsg(String msg) {
        return msg;
    }
}
