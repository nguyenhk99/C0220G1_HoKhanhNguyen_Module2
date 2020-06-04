package com.codegym.service.impl;

import com.codegym.model.HopDongChiTiet;
import com.codegym.repository.HopDongChiTietRepository;
import com.codegym.service.HopDongChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class HopDongChiTietServiceImpl implements HopDongChiTietService {
    @Autowired
    HopDongChiTietRepository hopDongChiTietRepository;

    @Override
    public Page<HopDongChiTiet> findAll(Pageable pageable) {
        return hopDongChiTietRepository.findAll(pageable);
    }

    @Override
    public void save(HopDongChiTiet hopDongChiTiet) {
        hopDongChiTietRepository.save(hopDongChiTiet);
    }
}
