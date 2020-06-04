package com.codegym.service.Impl;

import com.codegym.model.Blog;
import com.codegym.repository.BlogRepository;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.OneToOne;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public void addNewBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findByID(Integer id) {
        return blogRepository.findById(id).orElse(null);
    }


    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Integer id) {
        blogRepository.delete(blogRepository.findById(id).orElse(null));
    }

    @Override
    public Page<Blog> findByCateGory_Id(Integer id,Pageable pageable){
        return blogRepository.findByCateGory_Id(id,pageable);
    }

    @Override
    public Page<Blog> findByTittle(String str , Pageable pageable) {
        return blogRepository.findByTittleContaining(str, pageable);
    }
}
