package com.sinosoft.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Before;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.apache.cxf.message.Message.ENDPOINT_ADDRESS;
import static org.junit.Assert.*;

/**
 * Created by yangming on 2017/2/10.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-ws.xml"
        })
@WebAppConfiguration
public class YangmingWSImplTest extends AbstractJUnit4SpringContextTests {
    @org.junit.Test
    public void sendMsg() throws Exception {
//        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
//        Client client = dynamicClient.createClient("http://localhost:8080/soap/YangmingWS?wsdl");
    }


    @Before
    public void init() {
//        JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
//        sf.setResourceClasses(MyJaxrsResource.class);
//
//        List<Object> providers = new ArrayList<Object>();
//        // add custom providers if any
//        sf.setProviders(providers);
//
//        sf.setResourceProvider(MyJaxrsResource.class,
//        new SingletonResourceProvider(new MyJaxrsResource(), true));
//        sf.setAddress(ENDPOINT_ADDRESS);
//
//        server = sf.create();
    }
}