package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public void addNewBlog(Blog blog) {
        blogRepository.update(blog);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findByID(int id) {
        return blogRepository.findById(id);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.update(blog);
    }

    @Override
    public void delete(int id) {
        blogRepository.remove(id);
    }
}
