package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by wei on 2017/2/15.
 */
@WebService
public interface WeijianWS {
    @WebMethod
    String sendMsg(@WebParam(name="msg") String msg);
}
