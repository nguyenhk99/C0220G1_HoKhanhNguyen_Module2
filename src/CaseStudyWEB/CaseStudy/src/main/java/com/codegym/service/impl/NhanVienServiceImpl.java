package com.codegym.service.impl;

import com.codegym.model.NhanVien;
import com.codegym.repository.NhanVienRepository;
import com.codegym.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    @Autowired
    NhanVienRepository nhanVienRepository;
    @Override
    public Page<NhanVien> findAll(Pageable pageable) {
        return nhanVienRepository.findAll(pageable);
    }
}
