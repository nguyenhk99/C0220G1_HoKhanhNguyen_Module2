package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository customerRepository;

    @Override
    public List<Product> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteAll() {
        customerRepository.deleteAll();
    }

    @Override
    public void deleteById(Integer id) {
        customerRepository.delete(customerRepository.findById(id).orElse(null));
    }

    public void save(Product customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Product> findByName(String name) {
        return customerRepository.findByNameProductContaining(name);
    }

    @Override
    public Product findById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Integer id) {
        customerRepository.delete(customerRepository.findById(id).orElse(null));
    }
}
