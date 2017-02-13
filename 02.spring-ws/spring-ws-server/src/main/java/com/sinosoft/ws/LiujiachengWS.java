package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by liujc on 2017/2/13.
 */
//定义一个webservice
@WebService
public interface LiujiachengWS {
//    注释表示作为一项 Web Service 操作的方法
    @WebMethod
//    注释用于定制从单个参数至 Web Service 消息部件和 XML 元素的映射  ????
    public String sendMsg(@WebParam(name = "msg") String msg);
}
