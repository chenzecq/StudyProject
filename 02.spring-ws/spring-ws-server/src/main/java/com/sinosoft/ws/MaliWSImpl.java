package com.sinosoft.ws;

import com.sinosoft.service.MaliService;
import com.sinosoft.service.MaliServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @description：
 * @author： mali
 * @create： 2017-02-12 20:39
 **/

@WebService(endpointInterface = "com.sinosoft.ws.MaliWS",name = "MaliWS",serviceName = "MaliWS")
@Service
public class MaliWSImpl implements MaliWS {
    @Autowired
    private MaliService maliService;

    public String sendMsg(String msg) {
        if(maliService !=null){
            System.out.println("service is not null .");
            return maliService.dealMsg(msg);
        }else{
            System.out.println("service is null .");
            return new MaliServiceImpl().dealMsg(msg);
        }

    }
}
