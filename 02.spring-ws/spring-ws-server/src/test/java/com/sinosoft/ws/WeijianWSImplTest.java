package com.sinosoft.ws;

import com.sinosoft.service.WeijianServiceImpl;
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
import static org.junit.Assert.assertTrue;

/**
 * Created by wei on 2017/2/15.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        }
)
@WebAppConfiguration
public class WeijianWSImplTest extends AbstractJUnit4SpringContextTests {

    @Test
    public void sendMsg() throws Exception{
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8080/soap/WeijianWS?wsdl");
        Object[] objects = client.invoke("sendMsg", "art");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("art"));
    }

    public static class SimpleServer extends AbstractBusTestServerBase {
        protected void run() {
            Object implementor = new WeijianWSImpl();
            String address = "http://localhost:" + 8080 + "/soap/WeijianWS";
            Endpoint.publish(address, implementor);
        }

        public static void main(String[] args) {
            try{
                SimpleServer simpleServer = new SimpleServer();
                simpleServer.start();
            }catch (Exception ex) {
                System.exit(-1);
            } finally {
                System.out.println("done");
            }
        }
    }

    @Before
    public void init () {
        launchServer(SimpleServer.class, true);
    }

}
