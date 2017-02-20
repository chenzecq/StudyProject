package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by WQM on 2017/2/17.
 */
@WebService//WebService注解
public interface WangqingminWS {
    @WebMethod//服务方法
    public String sendMsg(@WebParam(name = "msg") String msg);
}
