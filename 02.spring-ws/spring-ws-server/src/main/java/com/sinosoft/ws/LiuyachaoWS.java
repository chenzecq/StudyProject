package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by lyc on 2017/2/15.
 */
@WebService
public interface LiuyachaoWS {
    @WebMethod
    public String sendMsg(@WebParam(name = "msg") String msg);
}
