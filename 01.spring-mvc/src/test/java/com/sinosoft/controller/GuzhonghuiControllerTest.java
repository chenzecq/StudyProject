package com.sinosoft.controller;

/**
 * Created by gzh on 2017/2/10.
 */

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

@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        })
@WebAppConfiguration
public class GuzhonghuiControllerTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    //这个是模拟浏览器客户端
    //junit测试的方法  首先会执行 @Before之后执行@test方法
    @Before
    public void init() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void helloGuzhonghui() throws Exception {
        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/guzhonghui/hello")
                        .accept(MediaType.TEXT_HTML_VALUE))
                //这个是模拟浏览器客户端Http请求
                .andExpect(MockMvcResultMatchers.status().isOk())
                //打开页面的内容是hello
                .andExpect(MockMvcResultMatchers.content().string("hello"));
    }


}
