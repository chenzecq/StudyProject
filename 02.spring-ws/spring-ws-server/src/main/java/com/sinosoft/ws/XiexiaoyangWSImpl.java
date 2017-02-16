package com.sinosoft.ws;

import com.sinosoft.service.XiexiaoyangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by xiexiaoyang on 2017/2/15.
 */
@WebService(endpointInterface = "com.sinosoft.ws.XiexiaoyangWS", name = "XiexiaoyangWS", serviceName = "XiexiaoyangWS")
@Service
public class XiexiaoyangWSImpl implements XiexiaoyangWS{

    @Autowired
    private XiexiaoyangService xiexiaoyangService;

    public String sendMsg(String msg){return msg;}
}
