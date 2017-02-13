package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by zhouxiaoyan on 2017/2/13.
 */
@WebService
public interface ZhouxiaoyanWS {
    @WebMethod
    public String sendMsg(@WebParam(name = "msg") String msg);
}
