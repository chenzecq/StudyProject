package com.sinosoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Project ask
 * Created by Sun on 16.
 * <pre>
 * 林花谢了春红，太匆匆，无奈朝来寒雨晚来风。
 * 胭脂泪，相留醉，几时重，自是人生长恨水长东。
 *
 * --翼羽水淼起辰月，秋山红日望紫枫--
 * </pre>
 */

@WebService(endpointInterface = "com.sinosoft.ws.SundongboWS", name = "SundongboWSName", serviceName = "SundongboWSSName")
public interface SundongboWS {
    @WebMethod
//            (operationName = "sendMsgFunName",action = "sendMsgAction")
    //webParamd的Name值必须与参数名相同
    public String sendMsg(@WebParam(name = "msg") String msg);
}
