package com.sinosoft.ws;

import com.sinosoft.service.WangqingminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by WQM on 2017/2/17.
 * 实现类，
 */
@WebService(endpointInterface = "com.sinosoft.ws.WangqingminWS", name = "WangqingminWS", serviceName = "WangqingminWS")
@Service
public class WangqingminWSImpl implements WangqingminWS {
    @Autowired
    public WangqingminService wangqingminService;

    public String sendMsg(String msg) {
        return msg;
    }
}
