package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Table(name = "hopdongchitiet")
public class HopDongChiTiet {
    @Id
    @Column(name = "idhopdongchitiet")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="soluong")
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "idhopdong")
    private HopDong hopDong;

    @ManyToOne
    @JoinColumn(name = "iddichvudikem",nullable = false)
    private DichVuDiKem dichvudikem;

    public HopDongChiTiet(Integer id, HopDong hopDong, DichVuDiKem dichvudikem, Integer count) {
        this.id = id;
        this.hopDong = hopDong;
        this.dichvudikem = dichvudikem;
        this.count = count;
    }

    public HopDongChiTiet() {
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DichVuDiKem getDichvudikem() {
        return dichvudikem;
    }

    public void setDichvudikem(DichVuDiKem dichvudikem) {
        this.dichvudikem = dichvudikem;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
