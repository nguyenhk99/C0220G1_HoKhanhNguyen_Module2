package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@SessionAttributes("cart")
public class ProductController {

    @ModelAttribute("cart")
    public Cart cart(){
        return new Cart();
    }

    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public ModelAndView showProduct(){
        ModelAndView modelAndView = new ModelAndView("listproduct");
        List<Product> productList = productService.findAll();
        modelAndView.addObject("productList",productList);
        return modelAndView;
    }

    @RequestMapping("/product/{id}")
    public ModelAndView view(@PathVariable("id") Integer id){
        ModelAndView modelAndView = new ModelAndView("view");
        Product product = productService.findById(id);
        modelAndView.addObject("product",product);
        return modelAndView;
    }

    @RequestMapping("/addproduct/{id}")
    public String add(@PathVariable("id") Integer id,@ModelAttribute("cart") Cart cart){
       cart.addProduct(productService.findById(id));
       cart.upTotalPrice(productService.findById(id).getPrice());
       return  "redirect:/";
    }

    @RequestMapping("/cart")
    public ModelAndView showCart(@ModelAttribute("cart") Cart cart){
        ModelAndView modelAndView = new ModelAndView("cart");
        return modelAndView;
    }

    @RequestMapping("/buy")
    public String buy(@ModelAttribute("cart") Cart cart){
        cart.setTotalPrice(0);
        cart.deleteAll();
        return "redirect:/";
    }

    @RequestMapping("/upproduct/{id}")
    public String addProduct(@PathVariable("id") String id,@ModelAttribute("cart") Cart cart){
        cart.getProductMap().get(id).upCount();
        cart.upTotalPrice(cart.getProductMap().get(id).getPrice());
        return "/cart";
    }

    @RequestMapping("/downproduct/{id}")
    public String downProduct(@PathVariable("id") String id,@ModelAttribute("cart") Cart cart) {
        if (cart.getProductMap().get(id).getCount() == 1) {
            cart.downTotalPrice(cart.getProductMap().get(id).getPrice());
            cart.deleteProduct(id);
        } else {
            cart.getProductMap().get(id).downCount();
            cart.downTotalPrice(cart.getProductMap().get(id).getPrice());
        }
        return "/cart";
    }

}
