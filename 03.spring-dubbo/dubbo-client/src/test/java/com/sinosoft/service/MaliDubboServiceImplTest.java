package com.sinosoft.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.*;

/**
 * Created by mali on 2017/2/15.
 */
//加载配置文件
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class MaliDubboServiceImplTest extends AbstractJUnit4SpringContextTests{
    private final Logger logger = LogManager.getLogger(getClass());
    @Autowired
    MaliDubboService maliDubboService;

    @Test
    @Ignore
    public void sendMsg() throws Exception{
        logger.info("MaliDubboServiceImplTest:"+maliDubboService.sendMsg("dubbo"));
    }
}