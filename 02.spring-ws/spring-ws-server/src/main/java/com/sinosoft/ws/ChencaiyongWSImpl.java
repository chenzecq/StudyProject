package com.sinosoft.ws;

import com.sinosoft.service.YangmingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import com.sinosoft.service.ChencaiyongService;
/**
 * Created by chency on 2017/2/11.
 */
@WebService(endpointInterface = "com.sinosoft.ws.ChencaiyongWS",name = "ChencaiyongWS",serviceName = "ChencaiyongWS" )
@Service
public class ChencaiyongWSImpl implements ChencaiyongWS {

    @Autowired
    private ChencaiyongService  chencaiyongService;
    public String sendMsg(String pMsg) {return pMsg;}
}
