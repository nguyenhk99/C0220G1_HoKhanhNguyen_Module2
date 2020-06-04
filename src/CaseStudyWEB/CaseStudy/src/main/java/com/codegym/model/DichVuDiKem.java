package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dichvudikem")
public class DichVuDiKem {
    @Id
    @Column(name = "iddichvudikem")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAccompaniedService;

    @Column(name = "tendichvudikem")
    private String nameAccompaniedService;

    @Column(name = "gia")
    private String price;

    @Column(name = "donvi")
    private String count;

    @Column(name = "trangthaikhadung")
    private String status;

    @OneToMany(mappedBy = "dichvudikem")
    private List<HopDongChiTiet> hopdongchitiet;

    public DichVuDiKem() {
    }

    public DichVuDiKem(Integer idAccompaniedService, String nameAccompaniedService, String price, String count, String status) {
        this.idAccompaniedService = idAccompaniedService;
        this.nameAccompaniedService = nameAccompaniedService;
        this.price = price;
        this.count = count;
        this.status = status;
    }

    public Integer getIdAccompaniedService() {
        return idAccompaniedService;
    }

    public void setIdAccompaniedService(Integer idAccompaniedService) {
        this.idAccompaniedService = idAccompaniedService;
    }

    public String getNameAccompaniedService() {
        return nameAccompaniedService;
    }

    public void setNameAccompaniedService(String nameAccompaniedService) {
        this.nameAccompaniedService = nameAccompaniedService;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<HopDongChiTiet> getHopdongchitiet() {
        return hopdongchitiet;
    }

    public void setHopdongchitiet(List<HopDongChiTiet> hopdongchitiet) {
        this.hopdongchitiet = hopdongchitiet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
