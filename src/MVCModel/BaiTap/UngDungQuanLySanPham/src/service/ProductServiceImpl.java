package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> product;

    static {
        product = new HashMap<>();
        product.put(1, new Product(1,"DienThoai","50000"));
        product.put(2, new Product(2,"MayTinh","100000"));
        product.put(3, new Product(3,"Laptop","200000"));
        product.put(4, new Product(4,"Giay","20000"));
        product.put(5, new Product(5,"Dep","30000"));
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
