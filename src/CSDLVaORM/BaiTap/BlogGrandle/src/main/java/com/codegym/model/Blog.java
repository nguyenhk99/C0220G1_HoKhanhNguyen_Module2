package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String text;
    private String tittle;

    public Blog() {
    }

    public Blog(Integer id, String tittle, String text) {
        this.id = id;
        this.text = text;
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, tittle='%s', text='%s']", id, tittle, text);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}
