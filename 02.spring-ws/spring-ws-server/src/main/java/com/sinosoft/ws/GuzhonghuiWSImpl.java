package com.sinosoft.ws;

import com.sinosoft.service.GuzhonghuiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by gzh on 2017/2/12 0012.
 */
@WebService(endpointInterface = "com.sinosoft.ws.GuzhonghuiWS",name="GuzhonghuiWS",
serviceName = "GuzhonghuiWS")
@Service
public class GuzhonghuiWSImpl implements GuzhonghuiWS {
    @Autowired
    private static GuzhonghuiService guzhonghuiService;
    public String sendMsg(String msg) {
       return msg;
    }
}
