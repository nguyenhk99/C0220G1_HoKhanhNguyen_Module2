package com.codegym.service.impl;

import com.codegym.model.KieuThue;
import com.codegym.repository.KieuThueRepository;
import com.codegym.service.KieuThueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KieuThueServiceImpl implements KieuThueService {
    @Autowired
    KieuThueRepository kieuThueRepository;
    @Override
    public List<KieuThue> findAll() {
        return kieuThueRepository.findAll();
    }
}
