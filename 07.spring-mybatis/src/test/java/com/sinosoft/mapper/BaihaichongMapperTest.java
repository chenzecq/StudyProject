package com.sinosoft.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.ArrayList;

/**
 * Created by baihc on 2017/2/27.
 */
@ContextConfiguration(
        locations = {"classpath:spring/database-context.xml",
                "classpath:spring/spring-mybatis.xml"}
)
public class BaihaichongMapperTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    BaihaichongService baihaichongService;

    @Test
    public void testMapper() {
        BaihaichongEntity baihaichongEntity = new BaihaichongEntity();
        //baihaichongEntity.setId(2);
        //baihaichongEntity.setCol1("bai1");
        //baihaichongEntity.setCol2("male");
        //baihaichongService.insert(baihaichongEntity);
        //baihaichongService.delete(baihaichongEntity);
        //System.out.println(baihaichongService.selectByPrimaryKey(1));
        //baihaichongEntity=baihaichongService.getById(baihaichongEntity);
        //System.out.println(baihaichongEntity);

        ArrayList lists=new ArrayList();
        lists.add(1);
        lists.add(2);
        System.out.println(baihaichongService.getForeach(lists));

        //List<BaihaichongEntity> list=baihaichongService.getChoose(baihaichongEntity);
        //System.out.println(list);
    }
}
