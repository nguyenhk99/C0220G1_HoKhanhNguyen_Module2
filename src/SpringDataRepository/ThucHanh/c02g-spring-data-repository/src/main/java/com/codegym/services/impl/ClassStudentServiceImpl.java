package com.codegym.services.impl;

import com.codegym.models.ClassStudent;
import com.codegym.repositorys.ClassStudentRepository;
import com.codegym.services.ClassStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassStudentServiceImpl implements ClassStudentService {
    @Autowired
    ClassStudentRepository classStudentRepository;

    @Override
    public List<ClassStudent> findAll() {
        return classStudentRepository.findAll();
    }

}
