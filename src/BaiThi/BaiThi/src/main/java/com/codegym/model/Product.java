package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "idproduct")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProduct;

    @Column(name = "nameproduct")
    @Size(min = 5,max = 50)
    private String nameProduct;

    @Column(name = "price")
    @Min(1)
    @NotEmpty
    private String price;

    @Column(name = "amount")
    @Min(1)
    @NotEmpty
    private String amount;

    @Column(name = "daycreate")
    private String dayCreate;

    @Column(name = "text")
    @Size(min = 10)
    private String text;

    @ManyToOne
    @JoinColumn(name = "idtype",nullable = false)
    private ProductType productType;

    public Product() {
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDayCreate() {
        return dayCreate;
    }

    public void setDayCreate(String dayCreate) {
        this.dayCreate = dayCreate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
