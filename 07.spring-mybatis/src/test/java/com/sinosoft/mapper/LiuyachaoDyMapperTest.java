package com.sinosoft.mapper;

import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by lyc on 2017/2/26.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/database-context.xml",
                "classpath:/spring/spring-mybatis.xml"
        }
)
public class LiuyachaoDyMapperTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private LiuyachaoDyService liuyachaoDyService;
@Ignore
@org.junit.Test
    public void test(){
        String aa= liuyachaoDyService.getCol2(4,null,null);
    System.out.println(aa);
    }
}
