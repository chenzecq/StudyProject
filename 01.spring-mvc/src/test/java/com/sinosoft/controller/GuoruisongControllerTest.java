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
 * Created by grs on 2017/2/10.
 */
//加载配置文件信息
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)
@WebAppConfiguration//使用这个Annotate会在跑单元测试的时候真实的启一个web服务，然后开始调用Controller的Rest API，待单元测试跑完之后再将web服务停掉
public class GuoruisongControllerTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;//实现了对Http请求的模拟，能够直接使用网络的形式，转换到Controller的调用
    @Test
    public void helloGuoruisong() throws Exception {


        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/guoruisong/helloworld")//相当于在浏览器地址栏中输入请求地址
                        .accept(MediaType.TEXT_HTML_VALUE))
                //成功打开页面
                .andExpect(MockMvcResultMatchers.status().isOk())
                //打开页面的内容是hello
                .andExpect(MockMvcResultMatchers.content().string("helloworld"));//判断访问服务后返回的内容是否是 helloworld,如果不一致，测试的时候回报错
    }

    //在执行测试方法helloGuoruisong前，首先要创建MockMvc
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

}