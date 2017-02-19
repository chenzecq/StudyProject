package com.sinosoft.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.testutil.common.AbstractBusTestServerBase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.xml.ws.Endpoint;

import static org.apache.cxf.testutil.common.AbstractClientServerTestBase.launchServer;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017-02-16.
 */
@ContextConfiguration(

        locations = {
                "classpath:spring/spring-context.xml"
        }
)
//测试环境使用，用来表示测试环境使用的ApplicationContext将是WebApplicationContext类型的
@WebAppConfiguration
public class XuyutaoServiceImplTest extends AbstractJUnit4SpringContextTests {
    public static class SimpleServer extends AbstractBusTestServerBase {
        protected void run() {
            Object xuyutaoWS = new XuyutaoWSImpl() ;
            String address = "http://localhost:" + 8080 + "/soap/XuyutaoWS";
            Endpoint.publish(address, xuyutaoWS);
        }
        public static void main(String[] args) {
            try {
                XuyutaoServiceImplTest.SimpleServer s = new XuyutaoServiceImplTest.SimpleServer();
                s.start();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.exit(-1);
            } finally {
                System.out.println("done!");
            }
        }
    }
    @Before
    public void init() {
        launchServer(XuyutaoServiceImplTest.SimpleServer.class, true);
    }//发布ws服务端

    @Test
    public void dealMsg() throws Exception {
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8080/soap/XuyutaoWS?wsdl");
        Object[] objects = client.invoke("sendMsg", "xyt");//调用ws的sendMsg("0204")方法
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("xyt"));
    }


}