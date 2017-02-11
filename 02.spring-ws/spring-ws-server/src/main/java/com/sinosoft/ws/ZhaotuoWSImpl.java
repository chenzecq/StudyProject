package com.sinosoft.ws;

import com.sinosoft.service.YangmingService;
import com.sinosoft.service.ZhatuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by Administrator on 2017/2/11.
 */
//类和名字映射关系，通过名字可以找到这个ws类
@WebService(endpointInterface = "com.sinosoft.ws.ZhaotuoWS",name = "ZhaotuoWS",serviceName = "ZhaotuoWS" )
@Service
public class ZhaotuoWSImpl implements ZhaotuoWS {
    //这里注入这个对象干啥使啊？是不是例子没用到，但是以后会通过这种形式，让服务层去进行处理过来的数据吧。。。
    /*@Autowired
    private ZhatuoService zhaotuoService;*/
    public String sendMsg(String s) {
        return s;
    }
}
