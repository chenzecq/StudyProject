package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by yangming on 2017/2/10.
 */
@WebService
public interface YangmingWS {
    @WebMethod
    public String sendMsg(@WebParam(name="msg") String msg);
}
