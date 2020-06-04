package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kieuthue")
public class KieuThue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idkieuthue")
    private Integer id;

    @Column(name = "tenkieuthue")
    private String nameRent;

    @Column(name = "gia")
    private String price;

    @OneToMany(mappedBy = "kieuthue")
    private List<DichVu> dichVu;

    public KieuThue() {
    }

    public List<DichVu> getDichVu() {
        return dichVu;
    }

    public void setDichVu(List<DichVu> dichVu) {
        this.dichVu = dichVu;
    }

    public KieuThue(Integer id, String nameRent, String price) {
        this.id = id;
        this.nameRent = nameRent;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameRent() {
        return nameRent;
    }

    public void setNameRent(String nameRent) {
        this.nameRent = nameRent;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
