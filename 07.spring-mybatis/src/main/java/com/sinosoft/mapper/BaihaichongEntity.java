package com.sinosoft.mapper;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by baihc on 2017/2/27.
 */
@Table(name = "baihaichong")
public class BaihaichongEntity {
    @Id
    private Integer id;
    @Column(name = "col1")
    private String col1;
    @Column(name = "col2")
    private String col2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    @Override
    public String toString() {
        return "BaihaichongEntity{" +
                "id=" + id +
                ", col1='" + col1 + '\'' +
                ", col2='" + col2 + '\'' +
                '}';
    }
}
