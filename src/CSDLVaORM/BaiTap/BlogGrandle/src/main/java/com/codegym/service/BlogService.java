package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;

public interface BlogService {
    void addNewBlog(Blog blog);

    List<Blog> findAll();

    Blog findByID(int id);

    void update(Blog blog);

    void delete(int id);
}
