package com.sinosoft.ws;

import com.sinosoft.service.HeshouyouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by Administrator on 2017/2/15/015.
 */

//WebService的注解，指定提供给外界调用的接口：包名+接口 ，name是包含XML Web Service的值, serviceName是对外发布的服务名称
@WebService(endpointInterface = "com.sinosoft.ws.HeshouyouWS",name = "HeshouyouWS",serviceName = "HeshouyouWS")
//spring的服务注解
@Service
public class HeshouyouWSImpl implements HeshouyouWS {

    @Autowired
    //注入业务层的接口，用来调取业务层实现类的方法
    private HeshouyouService heshouyouService;

    //调用业务层的方法
    @Override
    public String sendMsg(String msg) {
        return msg;
    }
}
