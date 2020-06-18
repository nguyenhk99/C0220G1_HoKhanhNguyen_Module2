package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void deleteAll();

    void deleteById(Integer id);

    public void save(Product customer);

    List<Product> findByName(String name);

    Product findById(Integer id);

    void remove(Integer id);

//    Page<Customer> findByNameContainingOrAndCustomerAddress_Address(String name,Pageable pageable);
}
