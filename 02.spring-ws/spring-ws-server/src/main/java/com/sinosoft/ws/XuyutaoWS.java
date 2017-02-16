package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Administrator on 2017-02-16.
 */
@WebService
public interface XuyutaoWS {
    @WebMethod
    public String sendMsg(@WebParam(name = "msg") String msg);
}
