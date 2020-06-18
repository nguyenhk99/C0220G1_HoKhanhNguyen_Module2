package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    ProductTypeService productTypeService;

    @RequestMapping("/")
    public String list() {
        return "redirect:/product";
    }

    @RequestMapping("/product")
    public ModelAndView productList( @RequestParam("search") Optional<String> search) {
        ModelAndView modelAndView = new ModelAndView("listproduct");
        String key = null;
        if (search.isPresent()) {
            key = search.get();
            List<Product> products = productService.findByName(key);
            modelAndView.addObject("product", products);
        } else {
            modelAndView.addObject("product", productService.findAll());
        }
        return modelAndView;
    }

    @GetMapping("/product/add")
    public ModelAndView addNewproduct() {
        ModelAndView modelAndView = new ModelAndView("addproduct");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("producttype", productTypeService.findAll());
        return modelAndView;
    }

    @PostMapping("/product/add")
    public ModelAndView addNewproduct(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("addproduct");
            modelAndView.addObject("producttype", productTypeService.findAll());
            return modelAndView;
        } else {
            product.setDayCreate(new Date().toString());
            productService.save(product);
            return new ModelAndView("redirect:/product");
        }
    }

    @GetMapping("product/edit/{id}")
    public ModelAndView editproduct(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("editproduct");
        Product product = productService.findById(id);
        modelAndView.addObject("product", product);
        modelAndView.addObject("producttype", productTypeService.findAll());
        return modelAndView;
    }

    @PostMapping("/product/edit")
    public ModelAndView editproduct(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("editproduct");
            modelAndView.addObject("producttype", productTypeService.findAll());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("redirect:/product");
            productService.save(product);
            return modelAndView;
        }
    }

    //
    @RequestMapping("/product/delete/{id}")
    public ModelAndView deleteproduct11(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("deleteproduct");
        modelAndView.addObject("message", "Are You Sure?");
        modelAndView.addObject("product", productService.findById(id));
        return modelAndView;
    }

    @RequestMapping("/product/delete")
    public ModelAndView deleteproduct(@ModelAttribute("product") Product product) {
        productService.remove(product.getIdProduct());
        ModelAndView modelAndView = new ModelAndView("redirect:/product");
        return modelAndView;
    }
}
