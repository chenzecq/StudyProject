package com.sinosoft.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.PostConstruct;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by yangming on 2017/2/25.
 */
public class CommonService<T extends Mapper, E> implements Mapper<E> {
    @Autowired
    private SqlSession sqlSession;

    protected Class<T> entityClass;

    protected Mapper<E> mapper;

    protected Class getEntityClass() {
        if (entityClass == null) {
            entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        }
        return entityClass;
    }


//    @PostConstruct
    private Mapper<E> getMapper() {
        if (mapper == null) {
            mapper = (Mapper<E>) sqlSession.getMapper(getEntityClass());
        }

        return mapper;
    }

    @Transactional
    public int deleteByPrimaryKey(Object key) {
        return getMapper().deleteByPrimaryKey(key);
    }

    @Transactional
    public int delete(E record) {
        return getMapper().delete(record);
    }

    @Transactional
    public int insert(E record) {
        return getMapper().insert(record);
    }

    @Transactional
    public int insertSelective(E record) {
        return getMapper().insertSelective(record);
    }

    @Transactional
    public boolean existsWithPrimaryKey(Object key) {
        return getMapper().existsWithPrimaryKey(key);
    }

    @Transactional
    public List<E> selectAll() {
        return getMapper().selectAll();
    }

    @Transactional
    public E selectByPrimaryKey(Object key) {
        return getMapper().selectByPrimaryKey(key);
    }

    @Transactional
    public int selectCount(E record) {
        return getMapper().selectCount(record);
    }

    @Transactional
    public List<E> select(E record) {
        return getMapper().select(record);
    }

    @Transactional
    public E selectOne(E record) {
        return getMapper().selectOne(record);
    }

    @Transactional
    public int updateByPrimaryKey(E record) {
        return getMapper().updateByPrimaryKey(record);
    }

    @Transactional
    public int updateByPrimaryKeySelective(E record) {
        return getMapper().updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByExample(Object example) {
        return getMapper().deleteByExample(example);
    }

    @Transactional
    public List<E> selectByExample(Object example) {
        return getMapper().selectByExample(example);
    }

    @Transactional
    public int selectCountByExample(Object example) {
        return getMapper().selectCountByExample(example);
    }

    @Transactional
    public int updateByExample(@Param("record") E record, @Param("example") Object example) {
        return getMapper().updateByExample(record, example);
    }

    @Transactional
    public int updateByExampleSelective(@Param("record") E record, @Param("example") Object example) {
        return getMapper().updateByExampleSelective(record, example);
    }

    @Transactional
    public List<E> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        return getMapper().selectByExampleAndRowBounds(example, rowBounds);
    }

    @Transactional
    public List<E> selectByRowBounds(E record, RowBounds rowBounds) {
        return getMapper().selectByRowBounds(record, rowBounds);
    }
}
