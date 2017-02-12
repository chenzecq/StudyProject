package com.sinosoft.ws;

import com.sinosoft.service.BaihaichongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by Baihaichong on 2017/2/11.
 */
@WebService(endpointInterface = "com.sinosoft.ws.BaihaichongWS", serviceName = "BaihaichongWS",name = "BaihaichongWS")
@Service
public class BaihaichongWSImpl implements BaihaichongWS {
    @Autowired
    private BaihaichongService baihaichongService;
    public String sendMsg(String msg) {
        System.out.println("BaihaichongWSImpl:"+msg);
        return msg;
    }
}
