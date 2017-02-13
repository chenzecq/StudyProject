package com.sinosoft.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.testutil.common.AbstractBusTestServerBase;
import org.junit.Before;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.xml.ws.Endpoint;

import static org.apache.cxf.testutil.common.AbstractClientServerTestBase.launchServer;
import static org.junit.Assert.assertTrue;

/**
 * Created by zhouxiaoyan on 2017/2/13.
 * 测试WS
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        })
@WebAppConfiguration
public class ZhouxiaoyanWSImplTest extends AbstractJUnit4SpringContextTests {

    public static class SimpleServer extends AbstractBusTestServerBase{
        protected void run() {
            Object implementor = new ZhouxiaoyanWSImpl();
            String address = "http://localhost:" + 8080 + "/soap/ZhouxiaoyanWS";
            Endpoint.publish(address, implementor);
        }

        /**
         * http://localhost:8080/soap/ZhouxiaoyanWS?wsdl(浏览器输入)
         * @param args
         */
        public static void main(String[] args) {
            try {
                SimpleServer s = new SimpleServer();
                s.start();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.exit(-1);
            } finally {
                System.out.println("done!");
            }
        }
    }

    /**
     * junit.Test 直接创建链接 Coverage均显示100%
     * @throws Exception
     */
    @org.junit.Test
    public void sendMsg() throws Exception {
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8080/soap/ZhouxiaoyanWS?wsdl");
        Object[] objects = client.invoke("sendMsg", "0204");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("0204"));

    }

    @Before
    public void init() {
        launchServer(SimpleServer.class, true);
    }
}
