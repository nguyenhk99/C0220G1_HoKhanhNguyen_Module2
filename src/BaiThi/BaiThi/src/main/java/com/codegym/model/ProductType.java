package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "producttype")
public class ProductType {
    @Id
    @Column(name="idproduct")
    private Integer id;

    @Column(name = "nametype")
    private String nameType;

    @OneToMany(mappedBy = "productType")
    private List<Product> product;

    public ProductType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

}
