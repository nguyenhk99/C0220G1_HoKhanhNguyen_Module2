package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cateGory")
public class CateGory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nameCateGory;

    @OneToMany
    private List<Blog> blog;

    public CateGory() {
    }

    public List<Blog> getBlog() {
        return blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCateGory() {
        return nameCateGory;
    }

    public void setNameCateGory(String nameCateGory) {
        this.nameCateGory = nameCateGory;
    }

    public CateGory(Integer id, String nameCateGory) {
        this.id = id;
        this.nameCateGory = nameCateGory;
    }

    @Override
    public String toString() {
        return String.format("CateGory[id=%d, name='%s']", id, nameCateGory);
    }

}
