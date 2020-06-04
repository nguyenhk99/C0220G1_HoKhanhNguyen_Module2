package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name = "idnhanvien")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "hoten")
    private String name;

    @Column(name = "ngaysinh")
    private String dayOfBirth;

    @Column(name = "socmnd")
    private String cmnd;

    @Column(name = "sodienthoai")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "nhanvien")
    private List<HopDong> hopDong;

    public List<HopDong> getHopDong() {
        return hopDong;
    }

    public void setHopDong(List<HopDong> hopDong) {
        this.hopDong = hopDong;
    }

    public NhanVien() {
    }

    public NhanVien(Integer id, String name, String dayOfBirth, String cmnd, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
