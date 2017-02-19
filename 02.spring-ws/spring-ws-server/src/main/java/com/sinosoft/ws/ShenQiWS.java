package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by shenqi on 2017/2/15.
 */
@WebService
public interface ShenQiWS {
    @WebMethod
    public String sendData(@WebParam(name = "data") String data);

}
