package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {

    Page<Blog> findAll(Pageable pageable);

    Blog findByID(Integer id);

    void save(Blog blog);

    void remove(Integer id);

    Page<Blog> findByCateGory_Id(Integer id,Pageable pageable);

    Page<Blog> findByTittle(String str,Pageable pageable);
}
