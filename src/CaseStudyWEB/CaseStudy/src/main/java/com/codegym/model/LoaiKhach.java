package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loaikhach")
public class LoaiKhach {
    @Id
    @Column(name = "idloaikhach")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tenloaikhach")
    private String name;

    @OneToMany(mappedBy = "loaikhach")
    private List<KhachHang> khachHang;

    public LoaiKhach() {
    }

    public LoaiKhach(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<KhachHang> getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(List<KhachHang> khachHang) {
        this.khachHang = khachHang;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
