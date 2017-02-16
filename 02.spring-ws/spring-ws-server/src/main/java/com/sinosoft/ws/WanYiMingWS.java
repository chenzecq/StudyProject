package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by MyUser on 2017/2/14.
 * javax.jws.WebService  JAVAAPI自带的 轻量级 WebService框架
 */
@WebService //标注 该类为WebService
public interface WanYiMingWS {
    @WebMethod //暴露给服务的方法
    public  String sendMsg(@WebParam(name="msg")String msg);


}
