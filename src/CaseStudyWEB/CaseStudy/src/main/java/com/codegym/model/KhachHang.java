package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name="khachhang")
public class KhachHang {

    @Id
    @Column(name="idkhachhang")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCustomer;

    @Column(name="hoten")
    @NotEmpty(message = "Please Enter Correct Your Name")
    private String name;

    @Column(name="ngaysinh")
    @Pattern(regexp = "^\\d{4}[\\/\\-](0?[1-9]|1[012])[\\/\\-](0?[1-9]|[12][0-9]|3[01])$",message = "Date Format: YYYY/MM/DD")
    private String dayOfBirth;

    @Column(name="gioitinh")
    @Pattern(regexp = "^(Male)|(Female)$",message = "Please Choose Male Or Female")
    private String gender;

    @Column(name="socmnd")
    @Pattern(regexp = "^(\\d{9})|((\\d{12}))",message= "Please Enter Correct CMND")
    private String cmnd;

    @Column(name="sodienthoai")
    @Pattern(regexp = "^(090[\\d]{7})|(091[\\d]{7})",message="Please Enter Correct Phone Number")
    private String phoneNumber;

    @Column(name="email")
    @Pattern(regexp = "^([a-zA-Z0-9_\\.]+)@([a-zA-Z0-9_\\.]+)\\.([a-zA-Z]{2,5})$",message = "Email Format: dsa@dsa.dsa")
    private String email;

    @Column(name="diachi")
    @NotEmpty(message = "Address Format: Aaaaaaa" )
    private String address;

    @OneToMany(mappedBy = "khachhang")
    private List<HopDong> hopdong;

    @ManyToOne
    @JoinColumn(name = "idloaikhach",nullable = false)
    private LoaiKhach loaikhach;


    public KhachHang() {
    }

    public KhachHang(Integer idCustomer, String name, String dayOfBirth, String gender, String cmnd, String phoneNumber, String email, String address) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public LoaiKhach getLoaikhach() {
        return loaikhach;
    }

    public void setLoaikhach(LoaiKhach loaikhach) {
        this.loaikhach = loaikhach;
    }

    public List<HopDong> getHopdong() {
        return hopdong;
    }

    public void setHopdong(List<HopDong> hopdong) {
        this.hopdong = hopdong;
    }
}
