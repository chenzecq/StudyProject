package com.sinosoft.ws;

import com.sinosoft.service.LiujiachengService;
import com.sinosoft.service.YangmingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by liujc on 2017/2/13.
 */

//endpointInterface:服务接口全路径(传说中的SEI，不知道具体什么用)；serviceName：对外发布的服务名；name ：此属性的值包含XML Web Service的名称
@WebService(endpointInterface = "com.sinosoft.ws.LiujiachengWS",name = "LiujiachengWS",serviceName = "LiujiachengWS" )
@Service
public class LiujiachengWSImpl implements LiujiachengWS{
//自动装配，Spring 帮忙new对象
    @Autowired
    private YangmingService yangmingService;

    public String sendMsg(String msg) {
        return msg;
    }
}
