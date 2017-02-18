package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by pinghengheng on 2017/2/18.
 * 这是WebService层的接口。
 */
@WebService
public interface PinghenghengWS {
    @WebMethod
    public String sendMsg(@WebParam(name = "msg") String msg);
}
