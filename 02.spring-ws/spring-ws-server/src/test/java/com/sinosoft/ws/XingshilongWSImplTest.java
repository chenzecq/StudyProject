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
 * Created by sl on 2017-2-12.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        })
@WebAppConfiguration
public class XingshilongWSImplTest extends AbstractJUnit4SpringContextTests {

    public static class SimpleServer extends AbstractBusTestServerBase {
        protected void run() {
            XingshilongWS imp = new XingshilongWSImpl();
            String address = "http://localhost:" + 8081 + "/soap/XingshilongWS";
            Endpoint.publish(address, imp);
        }

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
    @org.junit.Test
    public void sendMsg() throws Exception {
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8081/soap/XingshilongWS?wsdl");
        Object[] objects = client.invoke("sendMsg", "这是我的WS测试类");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("我接收到的消息是：这是我的WS测试类"));

    }

    @Before
    public void init() {
        launchServer(SimpleServer.class, true);
    }
}
