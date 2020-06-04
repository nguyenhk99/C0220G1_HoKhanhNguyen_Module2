package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import com.codegym.service.CateGoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
public class BlogRestfulController {
    @Autowired
    BlogService blogService;

    @Autowired
    CateGoryService cateGoryService;

    @GetMapping("/getAllListStudents/")
//    @RequestMapping(value = "/getAllListStudents", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> getAllListBlog() {
        List<Blog> studentList = blogService.findAll();

        return new ResponseEntity<List<Blog>>(studentList, HttpStatus.OK);
    }

}
