package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by zhanglipo on 2017/2/16.
 */
@WebService
public interface ZhanglipoWS {
    @WebMethod
    public String sendMsg(@WebParam(name="msg") String msg);
}
