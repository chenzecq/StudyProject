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
 * Created by Administrator on 2017/2/12 0012.
 */
@ContextConfiguration(
        locations = {

                "classpath:spring/spring-context.xml"

        }
)
@WebAppConfiguration
public class GuzhonghuiWSImplTest extends AbstractJUnit4SpringContextTests{
    /*WebService服务端 发布服务*/
    public static class SimpleServer extends AbstractBusTestServerBase{
        @Override
        protected void run() {
            Object object=new GuzhonghuiWSImpl();
            String address="http://localhost:"+8080+"/soap/GuzhonghuiWS";
            javax.xml.ws.Endpoint.publish(address, object);
        }
        public static void main(String[] arg){
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
    @org.junit.Test
    public void sendMsg() throws Exception{

        JaxWsDynamicClientFactory jaxWsDynamicClientFactory=JaxWsDynamicClientFactory.newInstance();
        Client client=jaxWsDynamicClientFactory.createClient("http://localhost:8080/soap/GuzhonghuiWS?wsdl");

        Object[] objects=client.invoke("sendMsg","1234");
        System.out.println(objects[0]);
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("1234"));
    }
}
