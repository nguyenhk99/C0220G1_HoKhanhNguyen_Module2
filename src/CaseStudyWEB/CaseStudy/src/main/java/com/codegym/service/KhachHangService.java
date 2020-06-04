package com.codegym.service;

import com.codegym.model.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface KhachHangService {
    Page<KhachHang> findAll(Pageable pageable);

    void save(KhachHang khachHang);

    void remove(Integer id);

    KhachHang findById(Integer id);

    Page<KhachHang> findByNameContaining(Pageable pageable,String name);
}
