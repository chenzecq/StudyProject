package com.sinosoft.controller;

/**
 * Created by ljc on 2017/2/11.
 */

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

@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        })
@WebAppConfiguration
public class LiujiachengControllerTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;



    @Test
    public void helloliujc() throws Exception {
        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/liujiacheng/hello")
                        .accept(MediaType.TEXT_HTML_VALUE))
                //这个是模拟浏览器客户端Http请求
                .andExpect(MockMvcResultMatchers.status().isOk())
                //打开页面的内容是hello
                .andExpect(MockMvcResultMatchers.content().string("hello"));
    }


    @Before //在执行helloliujc（）之前进行初始化
    public void init() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

}
