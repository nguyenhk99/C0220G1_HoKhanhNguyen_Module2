package com.codegym.service;

import com.codegym.model.HopDongChiTiet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface HopDongChiTietService {
    Page<HopDongChiTiet> findAll(Pageable pageable);

    void save(HopDongChiTiet hopDongChiTiet);
}
