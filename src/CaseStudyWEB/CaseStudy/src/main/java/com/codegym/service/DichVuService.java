package com.codegym.service;

import com.codegym.model.DichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DichVuService {
    Page<DichVu> findAll(Pageable pageable);

    void save(DichVu dichVu);

    Page<DichVu> findByNameContaining(String name,Pageable pageable);

    DichVu findById(Integer id);

    void remove(Integer id);

    List<DichVu> findAll();
}
