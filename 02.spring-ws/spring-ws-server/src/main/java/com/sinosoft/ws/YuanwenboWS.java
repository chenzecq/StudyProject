package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by ywb on 2017/2/12.
 */
@WebService
public interface YuanwenboWS {
    @WebMethod
    public String sendMsg(@WebParam(name="msg") String msg);
}
