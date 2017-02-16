package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Administrator on 2017/2/15/015.
 */

//WebService提供给外部调用的接口
@WebService
public interface HeshouyouWS {
    //WebService操作的方法，就是对外提供的方法
    @WebMethod
    //WebParam是WebService下调用该方法，需要传递的参数
    public String sendMsg(@WebParam(name = "msg") String msg);
}
