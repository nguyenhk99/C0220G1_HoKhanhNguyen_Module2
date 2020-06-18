package com.codegym.service;

import com.codegym.model.ProductType;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductTypeService {
    List<ProductType> findAll();
}
