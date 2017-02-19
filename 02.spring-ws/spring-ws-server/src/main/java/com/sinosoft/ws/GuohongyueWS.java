package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by henrykuo on 17-2-12.
 */
@WebService
public interface GuohongyueWS {
    @WebMethod
    String sendMsg(@WebParam(name = "msg") String msg);
}
