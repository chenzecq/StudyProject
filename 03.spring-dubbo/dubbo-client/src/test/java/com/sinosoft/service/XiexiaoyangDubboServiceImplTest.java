package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by apple-pc on 2017/2/16.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class XiexiaoyangDubboServiceImplTest {
    @Autowired
    private XiexiaoyangDubboService xiexiaoyangDubboService;

    @Test
    @Ignore
    public void sendMsg() throws Exception {

        System.out.println(xiexiaoyangDubboService.sendMsg("sdf"));
    }
}
