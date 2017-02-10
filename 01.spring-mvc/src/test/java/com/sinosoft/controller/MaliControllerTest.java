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

import static org.junit.Assert.*;

/**
 * Created by mali on 2017/2/10.
 */
//加载spring的配置信息（初始化bean）
@ContextConfiguration(
        locations =  {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)
@WebAppConfiguration
public class MaliControllerTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Test
    public void helloSomebodyTest() throws Exception {
        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/users/mali")
                        .accept(MediaType.TEXT_HTML_VALUE))
                //成功打开页面
                .andExpect(MockMvcResultMatchers.status().isOk())
                //判断打开页面的内容
                .andExpect(MockMvcResultMatchers.content().string("Hello mali"));
    }
    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }
}