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
 * Created by cao on 2017/2/13.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)

@WebAppConfiguration
public class CaonianControllerTest extends AbstractJUnit4SpringContextTests
{
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;
    @Test
    public void helloCaonian() throws Exception {
        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/caonian/hello")
                        .accept(MediaType.TEXT_HTML_VALUE))
                //�ɹ���ҳ��
                .andExpect(MockMvcResultMatchers.status().isOk())
                //��ҳ���������hello
                .andExpect(MockMvcResultMatchers.content().string("hello"));
    }

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
}
