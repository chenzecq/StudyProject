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
import static org.junit.Assert.assertTrue;

/**
 * Created by henrykuo on 17-2-12.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        })

@WebAppConfiguration
public class GuohongyueWSImplTest extends AbstractJUnit4SpringContextTests {
    public static class SimpleServce extends AbstractBusTestServerBase {

        protected void run() {
            Object implementor = new GuohongyueWSImpl();
            String address = "http://localhost:"+8080+"/soap/GuohongyueWS";
            Endpoint.publish(address,implementor);
        }

        public static void main(String[] args) {
            try {
                SimpleServce simpleServce = new SimpleServce();
                simpleServce.start();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Test
    public void sendMessage() throws Exception{
        JaxWsDynamicClientFactory dynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClientFactory.createClient("http://localhost:8080/soap/GuohongyueWS?wsdl");
        Object[] objects = client.invoke("sendMessage","1111");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue("wired null".equals(objects[0]));

    }


    @Before
    public void init(){
        launchServer(SimpleServce.class,true);
    }


}
