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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sun.util.calendar.BaseCalendar;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @Autowired
    CateGoryService cateGoryService;

    @GetMapping("/")
    public String goToDefault(){
        return "redirect:/blog";
    }
//
//    @PostMapping("/blog/search")
//    public ModelAndView searchBlog(@RequestParam String search , @PageableDefault(size = 5) Pageable pageable){
//        ModelAndView modelAndView = new ModelAndView("/blog/search");
//        Page<Blog> blogs = blogService.findByTittle(search,pageable);
//        modelAndView.addObject("search",search);
//        modelAndView.addObject("blog",blogs);
//        return modelAndView;
//    }

    @GetMapping("/blog")
    public ModelAndView showAllBlog( Pageable pageable,@RequestParam("search") Optional<String> search){
        ModelAndView modelAndView = new ModelAndView("/blog/default");
        Pageable pageable1SortByBlogId  = PageRequest.of(pageable.getPageNumber(),5, Sort.by("date").descending());
        String key = null;
        if(search.isPresent()) {
            key = search.get();
          Page<Blog> blogs = blogService.findByTittle(key,pageable1SortByBlogId);
          modelAndView.addObject("blog",blogs);
          modelAndView.addObject("cateGoryList",cateGoryService.findAll());
        }else {
            Page<Blog> blogs = blogService.findAll(pageable1SortByBlogId);
            modelAndView.addObject("cateGoryList", cateGoryService.findAll());
            modelAndView.addObject("blog", blogs);
        }
        return modelAndView;
    }
//    @GetMapping("/create-category")
//    public ModelAndView createCategory(){
//        ModelAndView modelAndView = new ModelAndView("/blog/create");
//        modelAndView.addObject("blog", new Blog());
//        return modelAndView;
//    }
    @GetMapping("/blog/category/{id}")
    public ModelAndView showForCateGory(@PageableDefault(size = 5) Pageable pageable,@PathVariable("id") Integer id){
        ModelAndView modelAndView = new ModelAndView("/blog/default");
        Page<Blog> blogs = blogService.findByCateGory_Id(id,pageable);
        modelAndView.addObject("cateGoryList", cateGoryService.findAll());
        modelAndView.addObject("blog",blogs);
        return modelAndView;
    }

    @GetMapping("/blog/create")
    public ModelAndView createBlog(){
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("cateGoryList", cateGoryService.findAll());
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/blog/create")
    public ModelAndView createBlog(@ModelAttribute("blog") Blog blog){
        LocalDateTime now = LocalDateTime.now();
        blog.setDate(now);
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("cateGoryList", cateGoryService.findAll());
        modelAndView.addObject("message", "Create Blog successfully");
        return modelAndView;
    }

    @GetMapping("/blog/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id){
        Blog blog = blogService.findByID(id);
            ModelAndView modelAndView = new ModelAndView("/blog/edit");
            modelAndView.addObject("blog", blog);
            return modelAndView;
    }

    @PostMapping("/blog/edit")
    public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Blog updated successfully");
        return modelAndView;
    }

    @GetMapping("/blog/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id){
        Blog blog = blogService.findByID(id);
            ModelAndView modelAndView = new ModelAndView("/blog/delete");
            modelAndView.addObject("blog", blog);
            return modelAndView;
    }

    @PostMapping("/blog/delete")
    public String deleteBlog(@ModelAttribute("blog") Blog blog){
        blogService.remove(blog.getId());
        return "redirect:/blog";
    }
//    @PostMapping("/blog/delete")
//    public ModelAndView deleteBlog(@ModelAttribute("blog") Blog blog,Pageable pageable){
//        blogService.remove(blog.getId());
//        ModelAndView modelAndView = new ModelAndView("/blog/default");
//        Page<Blog> blogs = blogService.findAll(pageable);
//        modelAndView.addObject("blog",blogs);
//        return modelAndView;
//    }
    @GetMapping("/blog/view/{id}")
    public ModelAndView viewBlog(@PathVariable Integer id){
        Blog blog = blogService.findByID(id);
            ModelAndView modelAndView = new ModelAndView("/blog/view");
            modelAndView.addObject("blog", blog);
            return modelAndView;
    }
}
