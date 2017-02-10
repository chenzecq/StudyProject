package com.sinosoft.controller;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;

/**
 * Created by zhanglipo on 2017/2/10.
 */

/**
 * 加载配置文件
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)
/**
 * 测试环境使用，用来表示测试环境使用的ApplicationContext将是WebApplicationContext类型的
 */
@WebAppConfiguration
public class ZhanglipoControllerTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    //junit模拟浏览器测试：先通过“@Before”执行一段逻辑，然后通过“@Test”实现测试
    @Test
    public void helloZhanglipo() throws Exception {


        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/zhanglipo/hello")
                        .accept(MediaType.TEXT_HTML_VALUE))
                //成功打开页面
                .andExpect(MockMvcResultMatchers.status().isOk())
                        //打开页面的内容是hello
                .andExpect(MockMvcResultMatchers.content().string("hello"));
    }

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
}
