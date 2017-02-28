package com.sinosoft.mapper;

import org.springframework.stereotype.Service;

/**
 * Created by lyc on 2017/2/26.
 */
@Service
public class LiuyachaoService extends CommonService<LiuyachaoMapper,LiuyachaoEntity> {

    public LiuyachaoEntity getCol2(int id,String col1,String col2) {
        LiuyachaoEntity lyc=new LiuyachaoEntity();
        lyc.setCol1(col1);
        lyc.setCol2(col2);
        lyc.setId(id);
        return getMapper().selectgetclo2(lyc);
    }
}
