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


/**
 * Created by WQM on 2017/2/10.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)
@WebAppConfiguration
public class WangqingminControllerTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Test//junit测试
    public void helloWangqingmin() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/wangqingmin/hello")
                        .accept(MediaType.TEXT_HTML_VALUE)
                //成功打开页面
        ).andExpect(MockMvcResultMatchers.status().isOk())
                //页面的内容显示为hello
                .andExpect(MockMvcResultMatchers.content().string("hello"));
    }

    @Before//Test之后执行
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
}
