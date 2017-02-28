package com.sinosoft.mapper;

import tk.mybatis.mapper.common.Mapper;

/**
 * Created by yuanwnebo on 2017/2/28.
 */
public interface YuanwenboMapper extends Mapper<YuanwenboEntity> {
    public YuanwenboEntity getById(int id);
}
