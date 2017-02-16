package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Zhoucg.  on 2017/2/15.
 */
@WebService
public interface ZhouChaoGuangWS {
    @WebMethod
    public String sendMsg(@WebParam(name="msg") String msg);
}
