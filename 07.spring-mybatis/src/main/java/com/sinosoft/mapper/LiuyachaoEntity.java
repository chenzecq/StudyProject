package com.sinosoft.mapper;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lyc on 2017/2/26.
 */
@Table(name = "Liuyachao")
public class LiuyachaoEntity {
    @Id
    private Integer id;
    @Column(table = "col1")
    private String col1;
    @Column(table = "col2")
    private String col2;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

    public Integer getId() {

        return id;
    }

    public String getCol1() {
        return col1;
    }

    public String getCol2() {
        return col2;
    }
}
