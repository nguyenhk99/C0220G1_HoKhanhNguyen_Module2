package com.codegym.service.impl;

import com.codegym.model.DichVu;
import com.codegym.repository.DichVuRepository;
import com.codegym.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DichVuServiceImpl implements DichVuService {
    @Autowired
    DichVuRepository dichVuRepository;
    @Override
    public Page<DichVu> findAll(Pageable pageable) {
        return dichVuRepository.findAll(pageable);
    }

    @Override
    public void save(DichVu dichVu) {
        dichVuRepository.save(dichVu);
    }

    @Override
    public Page<DichVu> findByNameContaining(String name, Pageable pageable) {
        return dichVuRepository.findByNameContaining(name,pageable);
    }

    @Override
    public DichVu findById(Integer id) {
        return dichVuRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Integer id) {
        dichVuRepository.delete(dichVuRepository.findById(id).orElse(null));
    }

    @Override
    public List<DichVu> findAll() {
        return dichVuRepository.findAll();
    }
}
