package com.sinosoft.service;/**
 * Created by mali on 2017/2/15.
 */


import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.MaliApi;
import com.sinosoft.api.YangmingApi;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * @description：
 * @author： mali
 * @create： 2017-02-15 21:03
 **/
//Spring的注解，扫描时识别bean对象的
@Service
public class MaliDubboServiceImpl implements MaliDubboService {
    private final Logger logger = LogManager.getLogger(getClass());
    //dubbo注解，注入dubbo服务
    @Reference
    MaliApi maliApi;
    public String sendMsg(String str) {
        if(maliApi == null){
            logger.error("MaliApi is null .");
            return null;
        }else{
            return maliApi.sendMsg(str);
        }
    }
}
