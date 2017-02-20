package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Theron on 2017/2/15.
 */
@WebService
public interface JialeiWS {
    @WebMethod
    public String dealMsg(@WebParam(name = "msg") String msg);
}
