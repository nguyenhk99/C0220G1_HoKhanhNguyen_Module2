//package com.codegym.service.impl;
//
//import com.codegym.model.Cart;
//import com.codegym.model.Product;
//import com.codegym.repository.CartRepository;
//import com.codegym.service.CartService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CartServiceImpl extends Cart implements CartService {
//    @Autowired
//    CartRepository cartRepository;
//
//    @Override
//    public List<Cart> findAll() {
//        return cartRepository.findAll();
//    }
//
//    public void addProduct(Cart cart){
//        cartRepository.save(cart);
//    }
//}
