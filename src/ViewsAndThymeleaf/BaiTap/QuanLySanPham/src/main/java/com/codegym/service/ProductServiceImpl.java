package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> product;
    static {
        int a = (int)(Math.random()*10000);
        int b = (int)(Math.random()*10000);
        int c = (int)(Math.random()*10000);
        int d = (int)(Math.random()*10000);
        int e = (int)(Math.random()*10000);
        product = new HashMap<>();
        product.put(a, new Product(a,"Điện Thoại","50000"));
        product.put(b, new Product(b,"Máy Tính","100000"));
        product.put(c, new Product(c,"Laptop","200000"));
        product.put(d, new Product(d,"Giày","20000"));
        product.put(e, new Product(e,"Dép","30000"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(product.values());
    }

    @Override
    public void save(Product products) {
        product.put(products.getIdProduct(), products);
    }

    @Override
    public Product findById(int id) {
        return product.get(id);
    }

    @Override
    public void update(int id, Product products) {
        product.put(id, products);
    }

    @Override
    public void remove(int id) {
        product.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = new ArrayList<>();
        for (int id: product.keySet()) {
            if(name.equals(product.get(id).getName())){
                products.add(product.get(id));
            }
        }
        return products;
    }

}
