package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by hss on 2017-02-15.
 */
@WebService
public interface HanshashaWS {
    @WebMethod
    public String sendMsg(@WebParam(name="msg") String msg);
}
