package com.sinosoft.ws;

import com.sinosoft.service.GuohongyueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.jws.WebService;

/**
 * Created by henrykuo on 17-2-12.
 */
@WebService(endpointInterface = "com.sinosoft.ws.GuohongyueWS",name = "GuohongyueWS",serviceName = "GuohongyueWS")
@Service
public class GuohongyueWSImpl implements GuohongyueWS {

    @Autowired
    private GuohongyueService guohongyueService;

    public String sendMsg(String msg) {
        if(guohongyueService==null){
            return "wired null";
        }

        try {
//            return guohongyueService.dealMessage(msg);
            return msg;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
