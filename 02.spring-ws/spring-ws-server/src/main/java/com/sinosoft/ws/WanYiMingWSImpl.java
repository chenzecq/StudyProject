package com.sinosoft.ws;

import com.sinosoft.service.WanYiMingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by MyUser on 2017/2/14.
 * 该类 为  WanYiMingWS 接口的实现类
 */
/**
 *endpointInterface 服务端接口名称
  name  端口名
  serviceName  服务名
  */

@WebService(endpointInterface ="com.sinosoft.ws.WanYiMingWS" ,name="WanYiMingWS" , serviceName="WanYiMingWS")
@Service
public class WanYiMingWSImpl implements WanYiMingWS{

    //注入 wanYiMingService
    @Autowired
    private WanYiMingService wanYiMingService;

    public String sendMsg(String msg) {
        return msg;
}
}
