package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by gzh on 2017/2/12 0012.
 */
@WebService   //实现WebService对外接口
public interface GuzhonghuiWS {
    @WebMethod
    public String sendMsg(@WebParam(name="msg") String msg);

}
