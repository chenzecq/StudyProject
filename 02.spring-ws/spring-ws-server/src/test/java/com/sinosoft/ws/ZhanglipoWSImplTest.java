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
 * Created by zhanglipo on 2017/2/16.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        })
@WebAppConfiguration
public class ZhanglipoWSImplTest extends AbstractJUnit4SpringContextTests {

    public static class SimpleServer extends AbstractBusTestServerBase {
        protected void run() {
            Object implementor = new ZhanglipoWSImpl();
            String address = "http://localhost:" + 8080 + "/soap/ZhanglipoWS";
            Endpoint.publish(address, implementor);
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
        Client client = dynamicClient.createClient("http://localhost:8080/soap/ZhanglipoWS?wsdl");
        Object[] objects = client.invoke("sendMsg", "0666");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("0666"));

    }

    @Before
    public void init() {
        launchServer(SimpleServer.class, true);
    }
}