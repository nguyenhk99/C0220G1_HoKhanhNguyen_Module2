package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
        Page<Customer> findByNameContaining(String name, Pageable pageable);
}
