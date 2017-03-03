package com.sinosoft.mapper;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by baihc on 2017/2/28.
 */
@Service
public class BaihaichongService extends CommonService<BaihaichongMapper,BaihaichongEntity> {

    @Transactional
    public BaihaichongEntity getById(BaihaichongEntity entity){
        return  getMapper().getById(entity);
    }
    @Transactional
    public List<BaihaichongEntity> getChoose(BaihaichongEntity entity){
        return getMapper().getChoose(entity);
    }
    @Transactional
    public List<BaihaichongEntity> getForeach(List lists){
        return getMapper().getForeach(lists);
    }
}
