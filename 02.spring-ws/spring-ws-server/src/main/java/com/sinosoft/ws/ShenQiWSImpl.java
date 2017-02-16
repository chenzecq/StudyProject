package com.sinosoft.ws;

import com.sinosoft.service.ShenQiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by shenqi on 2017/2/15.
 */
@WebService(endpointInterface = "com.sinosoft.ws.ShenQiWS",name = "ShenQiWS",serviceName = "ShenQiWS" )
@Service
public class ShenQiWSImpl implements ShenQiWS{

    @Autowired
    private ShenQiService mShenQiService;

    public String sendData(String data) {
        return data;
    }
}
