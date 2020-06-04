package com.codegym.service.impl;

import com.codegym.model.LoaiKhach;
import com.codegym.repository.LoaiKhachRepository;
import com.codegym.service.LoaiKhachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiKhachServiceImpl implements LoaiKhachService {
@Autowired
    LoaiKhachRepository loaiKhachRepository;
    @Override
    public List<LoaiKhach> findAll() {
        return loaiKhachRepository.findAll();
    }
}
