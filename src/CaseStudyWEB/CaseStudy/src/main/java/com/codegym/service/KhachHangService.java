package com.codegym.service;

import com.codegym.model.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface KhachHangService {
    Page<KhachHang> findAll(Pageable pageable);

    void save(KhachHang khachHang);

    void remove(Integer id);

    KhachHang findById(Integer id);

//    select * from Khachhang where name like "%name%"
    Page<KhachHang> findByNameContaining(Pageable pageable,String name);
}
