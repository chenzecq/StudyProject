package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by chency on 2017/2/11.
 */
@WebService
public interface ChencaiyongWS {
    @WebMethod
    public String sendMsg(@WebParam(name="msg") String msg);
}
