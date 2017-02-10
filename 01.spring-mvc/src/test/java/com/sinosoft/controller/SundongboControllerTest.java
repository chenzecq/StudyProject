package com.sinosoft.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Project ask
 * Created by Sun on 10.
 * <pre>
 * 林花谢了春红，太匆匆，无奈朝来寒雨晚来风。
 * 胭脂泪，相留醉，几时重，自是人生长恨水长东。
 *
 * --翼羽水淼起辰月，秋山红日望紫枫--
 * </pre>
 */


@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class SundongboControllerTest {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Test
    public void askSundongbo() throws Exception {
        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/sundongbo/hello")
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
