package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by xiexiaoyang on 2017/2/15.
 */
@WebService
public interface XiexiaoyangWS {
    @WebMethod
    public String sendMsg(@WebParam(name = "msg") String msg);
}
