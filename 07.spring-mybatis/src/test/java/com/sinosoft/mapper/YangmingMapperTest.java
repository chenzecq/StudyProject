package com.sinosoft.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.*;

/**
 * Created by yangming on 2017/2/25.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/database-context.xml",
                "classpath:/spring/spring-mybatis.xml"
        }
)
public class YangmingMapperTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private YangmingService yangmingService;


    @Test
    public void testMapper(){
        YangmingEntity yangmingEntity = new YangmingEntity();
        yangmingEntity.setId(1);
        yangmingService.insert(yangmingEntity);
        yangmingService.delete(yangmingEntity);
    }
}