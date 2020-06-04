package com.codegym.repository;

import com.codegym.model.Blog;

import java.util.List;

public interface BlogRepository {
    List<com.codegym.model.Blog> findAll();

    Blog findById(int id);

    void update(Blog model);

    void remove(int id);
}
