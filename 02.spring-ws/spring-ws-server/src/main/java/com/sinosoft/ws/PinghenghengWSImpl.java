package com.sinosoft.ws;

import com.sinosoft.service.PinghenghengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.jws.WebService;

/**
 * Created by pinghengheng on 2017/2/18.
 * 这是WebService层接口的实现类。
 */
@WebService(endpointInterface = "com.sinosoft.ws.PinghenghengWS",name = "PinghenghengWS",serviceName = "PinghenghengWS")
@Service
public class PinghenghengWSImpl implements PinghenghengWS{

    @Autowired
    private PinghenghengService pinghenghengService;

    public String sendMsg(String msg){
        return msg;
    }
}
