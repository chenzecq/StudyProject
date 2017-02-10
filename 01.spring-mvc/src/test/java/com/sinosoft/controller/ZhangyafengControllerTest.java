package com.sinosoft.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.net.URLEncoder;

import static org.junit.Assert.*;

/**
 * Created by sinosoft.zyf on 2017/2/10.
 */

// 加载Spring的配置文件
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)
@WebAppConfiguration
public class ZhangyafengControllerTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    WebApplicationContext context;
    // MockMvc实现了对Http请求的模拟
    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
    }

    @Test
    public void testHelloZhangyafeng() throws Exception {
        // mockMvc调用perform，调用controller的业务处理逻辑，
        // perform返回ResultActions,返回操作结果，通过ResultActions,提供了统一的验证方式
        this.mockMvc.perform(MockMvcRequestBuilders.get("/zhangyafeng/hello/zyf").accept(MediaType.TEXT_HTML_VALUE))
                // 使用StatusResultMatchers对请求结果进行验证
                .andExpect(MockMvcResultMatchers.status().isOk())
                // 使用ContentResultMatchers对请求返回的内容进行验证，请求返回的内容是否包含了 “hello” 字符串
                .andExpect(MockMvcResultMatchers.content().string("hello"));
    }
}