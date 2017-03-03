package com.sinosoft.mapper;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by baihc on 2017/2/28.
 */
public interface BaihaichongMapper extends Mapper<BaihaichongEntity> {

    public BaihaichongEntity getById(BaihaichongEntity entity);
    public List<BaihaichongEntity> getChoose(BaihaichongEntity entity);
    public List<BaihaichongEntity> getForeach(List lists);
}
