package com.codegym.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Lob
    private String img;
    @Lob
    private String name;

    private Integer price;
    private int count =0;

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void upCount() {
        this.count++;
    }

    public void downCount() {
        this.count--;
    }

    public Product(Integer id, String img, String name, Integer price) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product() {
    }


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product[id=%d, name='%s', img='%s', price='%s']", id, img, name,price);
    }
}
