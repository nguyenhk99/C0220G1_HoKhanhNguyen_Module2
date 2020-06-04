package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "dichvu")
public class DichVu {

    @Id
    @Column(name="iddichvu")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idService;

    @Column(name="tendichvu")
    @NotEmpty
    private String name;

    @Column(name="dientich")
    @Min(0)
    private String area;

    @Column(name="sotang")
    @Min(0)
    private String numberOfFloor;

    @Column(name="songuoitoida")
    @Min(0)
    private String maxOfPeople;

    @Column(name="chiphithue")
    @Min(0)
    private String cost;

    @Column(name="trangthai")
    private String status;

    @ManyToOne
    @JoinColumn(name = "idkieuthue",nullable=false)
    private KieuThue kieuthue;

    public DichVu() {
    }

    public DichVu(Integer idService, String name, String area, String numberOfFloor, String maxOfPeople, String cost, String status) {
        this.idService = idService;
        this.name = name;
        this.area = area;
        this.numberOfFloor = numberOfFloor;
        this.maxOfPeople = maxOfPeople;
        this.cost = cost;
        this.status = status;
    }

    public Integer getIdService() {
        return idService;
    }

    public void setIdService(Integer idService) {
        this.idService = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getMaxOfPeople() {
        return maxOfPeople;
    }

    public void setMaxOfPeople(String maxOfPeople) {
        this.maxOfPeople = maxOfPeople;
    }

    public String getCost() {
        return cost;
    }

    public KieuThue getKieuthue() {
        return kieuthue;
    }

    public void setKieuthue(KieuThue kieuthue) {
        this.kieuthue = kieuthue;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
