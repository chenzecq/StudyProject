package com.sinosoft.controller;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.*;

/**
 * Created by sinosoft.zyf on 2017/2/15.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-servlet.xml",
                "classpath:spring/spring-dubbo.xml"
        }
)
public class ZhangyafengControllerTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    ZhangyafengController zhangyafengController;

    @Test
    @Ignore
    public void testService() throws Exception {
        zhangyafengController.service("zyfMsg");
    }
}