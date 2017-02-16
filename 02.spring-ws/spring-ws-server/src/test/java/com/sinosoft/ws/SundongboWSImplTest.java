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
 * Project ask
 * Created by Sun on 16.
 * <pre>
 * 林花谢了春红，太匆匆，无奈朝来寒雨晚来风。
 * 胭脂泪，相留醉，几时重，自是人生长恨水长东。
 *
 * --翼羽水淼起辰月，秋山红日望紫枫--
 * </pre>
 */
@ContextConfiguration(
        locations = {"classpath:spring/spring-context.xml"}
)
@WebAppConfiguration
public class SundongboWSImplTest extends AbstractJUnit4SpringContextTests {

    public static class WSServer extends AbstractBusTestServerBase {
        protected void run() {
            Object implementor = new SundongboWSImpl();
            String address = "http://localhost:" + 8080 + "/soap/SundongboWS";
            Endpoint.publish(address, implementor);
        }

        public static void main(String[] args) {
            WSServer server = new WSServer();
            server.start();
        }
    }

    @Before
    public void init() {
        launchServer(WSServer.class, true);
    }

    @org.junit.Test
    public void sendMsg() throws Exception {
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8080/soap/SundongboWS?wsdl");
        Object[] objects = client.invoke("sendMsg", "0204");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("Hello 0204"));

    }


}
