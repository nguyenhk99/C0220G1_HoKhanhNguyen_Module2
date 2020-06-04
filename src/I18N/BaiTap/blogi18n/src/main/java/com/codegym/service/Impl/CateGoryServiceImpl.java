package com.codegym.service.Impl;

import com.codegym.model.CateGory;
import com.codegym.repository.CateGoryRepository;
import com.codegym.service.CateGoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateGoryServiceImpl implements CateGoryService {
    @Autowired
    CateGoryRepository cateGoryRepository;

    @Override
    public List<CateGory> findAll() {
        return cateGoryRepository.findAll();
    }


}
