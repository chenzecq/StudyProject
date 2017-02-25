package com.sinosoft.mapper;

import javax.persistence.*;

/**
 * Created by yangming on 2017/2/25.
 */
@Table(name = "Yangming")
public class YangmingEntity {

    @Id
    private Integer id;
    @Column(table = "col1")
    private String col1;
    @Column(table = "col2")
    private String col2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }
}
