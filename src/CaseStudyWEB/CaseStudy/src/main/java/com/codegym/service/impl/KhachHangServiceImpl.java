package com.codegym.service.impl;

import com.codegym.model.KhachHang;
import com.codegym.repository.KhachHangRepository;
import com.codegym.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    KhachHangRepository khachHangRepository;

    @Override
    public Page<KhachHang> findAll(Pageable pageable) {
        return khachHangRepository.findAll(pageable);
    }

    @Override
    public void save(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang findById(Integer id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    @Override
    public Page<KhachHang> findByNameContaining(Pageable pageable, String name) {
        return khachHangRepository.findByNameContaining(name,pageable);
    }

    @Override
    public void remove(Integer id) {
        khachHangRepository.delete(khachHangRepository.findById(id).orElse(null));
    }

}
