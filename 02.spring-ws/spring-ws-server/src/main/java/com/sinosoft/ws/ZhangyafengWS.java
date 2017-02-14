package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by sinosoft.zyf on 2017/2/11.
 */
@WebService
public interface ZhangyafengWS {
    @WebMethod
    // 这个注解对外公开方法,这个注解和下面的参数注解也可以写在实现类中，两个注解可以分散在接口和实现类
    String sendMsg(@WebParam(name="msg") String msg);

}
