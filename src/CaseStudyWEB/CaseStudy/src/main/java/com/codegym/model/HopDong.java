package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "hopdong")
public class HopDong {
    @Id
    @Column(name="idhopdong")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idContract;

    @Column(name="ngaylamhopdong")
    @Pattern(regexp = "^\\d{4}[\\/\\-](0?[1-9]|1[012])[\\/\\-](0?[1-9]|[12][0-9]|3[01])$",message = "Date Format: YYYY/MM/DD")
    private String dateStart;

    @Column(name="ngayketthuc")
    @Pattern(regexp = "^\\d{4}[\\/\\-](0?[1-9]|1[012])[\\/\\-](0?[1-9]|[12][0-9]|3[01])$",message = "Date Format: YYYY/MM/DD")
    private String dateEnd;

    @Column(name="tiendatcoc")
    @Min(0)
    private String deposits;

    @Column(name="tongtien")
    @Min(0)
    private String totalPrice;

    @ManyToOne
    @JoinColumn(name = "idnhanvien",nullable = false)
    private NhanVien nhanvien;

    @ManyToOne
    @JoinColumn(name = "iddichvu",nullable = false)
    private DichVu dichvu;

    @OneToMany(mappedBy = "hopDong")
    private List<HopDongChiTiet> hopDongChiTiet;

    @ManyToOne
    @JoinColumn(name = "idkhachhang",nullable = false)
    private KhachHang khachhang;

    public HopDong() {
    }


    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDeposits() {
        return deposits;
    }

    public void setDeposits(String deposits) {
        this.deposits = deposits;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<HopDongChiTiet> getHopDongChiTiet() {
        return hopDongChiTiet;
    }

    public void setHopDongChiTiet(List<HopDongChiTiet> hopDongChiTiet) {
        this.hopDongChiTiet = hopDongChiTiet;
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public NhanVien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
    }

    public DichVu getDichvu() {
        return dichvu;
    }

    public void setDichvu(DichVu dichvu) {
        this.dichvu = dichvu;
    }

}
