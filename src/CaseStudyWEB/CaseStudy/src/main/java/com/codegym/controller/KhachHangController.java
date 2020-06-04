package com.codegym.controller;

import com.codegym.model.KhachHang;
import com.codegym.service.KhachHangService;
import com.codegym.service.LoaiKhachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class KhachHangController {
    @Autowired
    KhachHangService khachHangService;
    @Autowired
    LoaiKhachService loaiKhachService;

    @RequestMapping("/index")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @GetMapping("/customer")
    public ModelAndView showCustomer(Pageable pageable,@RequestParam("search") Optional<String> search) {
        ModelAndView modelAndView = new ModelAndView("customer/customerlist");
        Pageable pageable1SortByBlogId = PageRequest.of(pageable.getPageNumber(), 3, Sort.by("idCustomer").descending());
        String key = null;
        if(search.isPresent()){
            key = search.get();
            Page<KhachHang> khachHangs = khachHangService.findByNameContaining(pageable1SortByBlogId, key);
            modelAndView.addObject("customer",khachHangs);
        }else {
            Page<KhachHang> khachHangs = khachHangService.findAll(pageable1SortByBlogId);
            modelAndView.addObject("customer", khachHangs);
        }
        return modelAndView;
    }


    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView modelAndView = new ModelAndView("customer/addcustomer");
        modelAndView.addObject("khachhang", new KhachHang());
        modelAndView.addObject("loaikhach",loaiKhachService.findAll());
        return modelAndView;
    }

    @PostMapping("/customer/create")
    public ModelAndView createCustomer(@Valid @ModelAttribute("khachhang") KhachHang khachHang, BindingResult bindingResult,Pageable pageabe) {

        if(bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("customer/addcustomer");
            modelAndView.addObject("loaikhach",loaiKhachService.findAll());
            return modelAndView;
        }else {
            khachHangService.save(khachHang);

            return new ModelAndView("redirect:/customer");
        }
    }

    @GetMapping("customer/edit/{id}")
    public ModelAndView editCustomer(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("customer/editcustomer");
        KhachHang khachHang = khachHangService.findById(id);
        modelAndView.addObject("customer",khachHang);
        modelAndView.addObject("loaikhach",loaiKhachService.findAll());
        return modelAndView;
    }

    @PostMapping("/customer/edit")
    public ModelAndView editCustomer(@Valid @ModelAttribute("customer") KhachHang khachHang,BindingResult bindingResult,Pageable pageable){
        if(bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("customer/editcustomer");
            modelAndView.addObject("loaikhach",loaiKhachService.findAll());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("redirect:/customer");
            khachHangService.save(khachHang);
            return modelAndView;
        }
    }

    @RequestMapping("customer/delete/{id}")
    public ModelAndView deleteCustomer11(@PathVariable Integer id,Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("customer/customerlist");
        Pageable pageable1SortByBlogId = PageRequest.of(pageable.getPageNumber(), 3, Sort.by("idCustomer").descending());
        modelAndView.addObject("message","Are You Sure?");
        modelAndView.addObject("customer1",khachHangService.findById(id));
        modelAndView.addObject("customer",khachHangService.findAll(pageable1SortByBlogId));
        return modelAndView;
    }
    @RequestMapping("customer/delete")
    public ModelAndView deleteCustomer(Pageable pageable,@ModelAttribute("customer1") KhachHang khachHang){
        khachHangService.remove(khachHang.getIdCustomer());
        ModelAndView modelAndView = new ModelAndView("redirect:/customer");
        return modelAndView;
    }
}
