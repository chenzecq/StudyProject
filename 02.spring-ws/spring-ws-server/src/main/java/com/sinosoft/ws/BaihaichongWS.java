package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Baihaichong on 2017/2/11.
 */
@WebService
public interface BaihaichongWS {
    @WebMethod
    public String sendMsg(@WebParam(name="msg") String msg);
}
