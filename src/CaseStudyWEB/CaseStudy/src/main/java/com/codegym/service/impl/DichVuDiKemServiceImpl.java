package com.codegym.service.impl;

import com.codegym.model.DichVuDiKem;
import com.codegym.repository.DichVuDiKemRepository;
import com.codegym.service.DichVuDiKemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DichVuDiKemServiceImpl implements DichVuDiKemService {
    @Autowired
    DichVuDiKemRepository dichVuDiKemRepository;
    @Override
    public Page<DichVuDiKem> findAll(Pageable pageable) {
        return dichVuDiKemRepository.findAll(pageable);
    }
}
