package com.sinosoft.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.testutil.common.AbstractBusTestServerBase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.xml.ws.Endpoint;

import static org.apache.cxf.testutil.common.AbstractClientServerTestBase.launchServer;
import static org.junit.Assert.*;

/**
 * Created by mali on 2017/2/12.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        })
@WebAppConfiguration
public class MaliWSImplTest extends AbstractJUnit4SpringContextTests {

    public static class SimpleServer extends AbstractBusTestServerBase {
        protected void run() {
            Object implementor = new MaliWSImpl();
            String address = "http://localhost:" + 8080 + "/soap/MaliWS";
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

    @Test
    public void sendMsg() throws Exception {
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8080/soap/MaliWS?wsdl");
        Object[] objects = client.invoke("sendMsg", "here");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("here"));

    }

    @Before
    public void setUp() {
        launchServer(SimpleServer.class, true);
    }
}