package com.sinosoft.service;

import com.sinosoft.api.YangmingApi;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.*;

/**
 * Created by yangming on 2017/2/13.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class YangmingDubboServiceImplTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private YangmingDubboService yangmingDubboService;

    @Test
    @Ignore
    public void sendMsg() throws Exception {

        System.out.println(yangmingDubboService.sendMsg("sdf"));
    }

}