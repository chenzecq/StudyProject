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
 * Created by wangna on 2017-02-13.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-context.xml",
        "classpath:spring/spring-servlet.xml"
})//����Spring�����ļ�
@WebAppConfiguration  //����javaWEB�����
public class WangnanaControllerTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;//����MockMvc��MockMvc��SpringMVC�ṩ��Controller������

    @Test
    public void helloWangnana() throws Exception {
        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/wangnana/helloWord")//�����url,����ķ�����get
                        .accept(MediaType.TEXT_HTML_VALUE))     //���ݸ�ʽ
                //�ɹ���ҳ�棬�ж��Ƿ��������url���粻���׳������������½���
                .andExpect(MockMvcResultMatchers.status().isOk())
                // ��֤���Խ���Ƿ�Ϊ����ֵ"helloWord",�粻�ǣ�����Բ�ͨ��
                .andExpect(MockMvcResultMatchers.content().string("helloWord"));
    }

    @Before  //���������ÿ������ִ��֮ǰ����ִ��һ��
    public void setup(){
            this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }//��ʼ��MockMvc����



}
