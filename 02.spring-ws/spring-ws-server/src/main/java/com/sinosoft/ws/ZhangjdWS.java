package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Administrator on 2017/2/12.
 */
@WebService
public interface ZhangjdWS {
    @WebMethod
    public String sendMsg(@WebParam(name="zhangjdmsg") String msg);
}
