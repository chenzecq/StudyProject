package com.sinosoft.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.testutil.common.AbstractBusTestServerBase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.xml.ws.Endpoint;

import static org.apache.cxf.testutil.common.AbstractClientServerTestBase.launchServer;
import static org.junit.Assert.assertTrue;

/**
 * Created by Baihaichong on 2017/2/11.
 */
@ContextConfiguration(
        locations = {"classpath:spring/spring-context.xml"}
)
@WebAppConfiguration
public class BaihaichongWSImplTest extends AbstractJUnit4SpringContextTests {
    public static class SimpleServer extends AbstractBusTestServerBase {

        @Override
        protected void run() {
            Object object = new BaihaichongWSImpl();
            String address = "http://localhost:" + 8080 + "/soap/BaihaichongWS";
            Endpoint.publish(address,object);//发布服务
        }

        public static void main(String[] args) {//启动ws服务
            try{
                SimpleServer s=new SimpleServer();
                s.start();
            }catch (Exception e){
                e.printStackTrace();;
                System.exit(-1);
            }finally{
                System.out.println("done!");
            }

        }
    }

    @Test
    public void sendMsg() throws Exception {
        JaxWsDynamicClientFactory factory=JaxWsDynamicClientFactory.newInstance();
        Client client=factory.createClient("http://localhost:8080/soap/BaihaichongWS?wsdl");
        Object[] objects=client.invoke("sendMsg","123");//客户端调用服务端的sendMsg方法
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("123"));
    }
    @Before
    public void init(){
        launchServer(SimpleServer.class, true);
    }//启动ws服务


}
