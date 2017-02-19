package com.sinosoft.ws;
import org.junit.Test;
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
 * Created by xiexiaoyang on 2017/2/15.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        })
@WebAppConfiguration
public class XiexiaoyangWSImplTest extends AbstractJUnit4SpringContextTests{

    @Test
    public void sendMsg() throws Exception{
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8090/soap/XiexiaoyangWS?wsdl");
        Object[] objects = client.invoke("sendMsg","0204");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("0204"));
    }

    public static class SimpleServer extends AbstractBusTestServerBase{
        protected void run(){
            Object implementor = new XiexiaoyangWSImpl();
            String address = "http://localhost:" + 8090 + "/soap/XiexiaoyangWS";
            Endpoint.publish(address,implementor);
        }

        public static void main(String[] args){
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


    @Before
    public void init(){
        launchServer(SimpleServer.class,true);
    }
}









