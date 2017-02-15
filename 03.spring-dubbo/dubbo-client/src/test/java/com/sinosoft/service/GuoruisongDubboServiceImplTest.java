package com.sinosoft.service;

import org.junit.Before;
import org.junit.Ignore;
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
 * Created by grs on 2017/2/15.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml",
        "classpath:spring/spring-servlet.xml"
})
@WebAppConfiguration
public class GuoruisongDubboServiceImplTest extends AbstractJUnit4SpringContextTests{

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }


    @Test
    public void helloDubbo() throws Exception {


        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/GuoruisongDubbo/hellodubbo")
                        .accept(MediaType.TEXT_HTML_VALUE))
                //成功打开页面
                .andExpect(MockMvcResultMatchers.status().isOk())
                //打开页面的内容是Server:hellodubbo
                .andExpect(MockMvcResultMatchers.content().string("Server:hellodubbo"));
    }
}