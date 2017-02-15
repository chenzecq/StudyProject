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
 * Created by wei on 2017/2/14.
 */
@ContextConfiguration (
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)

@WebAppConfiguration
public class WeijianControllerTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Test
    public void helloWeijian() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/weijian/hello").accept(MediaType.TEXT_HTML_VALUE))
                .andExpect(MockMvcResultMatchers.status().isOk())//成功打开页面
                .andExpect(MockMvcResultMatchers.content().string("hello"));//如果页面内容是hello
    }

    @Before
    public void setup () {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

}
