package com.codegym.service;

import com.codegym.model.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NhanVienService {
    Page<NhanVien> findAll(Pageable pageable);
}
