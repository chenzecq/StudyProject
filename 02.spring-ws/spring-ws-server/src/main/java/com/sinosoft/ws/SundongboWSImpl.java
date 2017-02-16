package com.sinosoft.ws;

import com.sinosoft.service.SundongboService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.WebParam;

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
//@DependsOn("remedy") //保证remedy先被加载并初始化
//@Component

/**
 * targetNamespace：指定命名空间
 * name：portType类型
 * portName：port名称
 * serviceName：服务名称
 * endpointInterface：SEI接口地址，如果一个服务类实现了多个接口，只需要发布一个接口的方法，可通过此注解指定要发布服务的接口。使用不多
 */
@Service
public class SundongboWSImpl implements SundongboWS {

    @Resource
    private SundongboService sundongboService;

    public String sendMsg(String msgParam) {
        System.out.println("msg = " + msgParam);
        System.out.println("sundongboService = " + sundongboService);
        return sundongboService.dealMsg(msgParam);
    }
}
