package com.codegym.model;

import org.hibernate.annotations.Columns;
import org.springframework.format.datetime.standard.DateTimeContext;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.Date;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String tittle;

    @Column(name = "text", length = 4000)
    private String text;

    private LocalDateTime date;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }



    @OneToOne
    private CateGory cateGory;

    public CateGory getCateGory() {
        return cateGory;
    }

    public void setCateGory(CateGory cateGory) {
        this.cateGory = cateGory;
    }

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
