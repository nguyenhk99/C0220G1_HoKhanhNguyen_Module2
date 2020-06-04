package com.codegym.model;

import java.util.HashMap;

import java.util.Map;


public class Cart {
   Map<String,Product> productMap = new HashMap<>();
   private Integer totalPrice = 0;

    public Cart() {
    }

    public Cart(Map<String, Product> productMap, Integer totalPrice) {
        this.productMap = productMap;
        this.totalPrice = totalPrice;

    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void upTotalPrice(Integer totalPrice) {
        this.totalPrice += totalPrice;
    }

    public void downTotalPrice(Integer totalPrice) {
        this.totalPrice -= totalPrice;
    }
    public void addProduct(Product product){
        boolean check = true;
        for (Map.Entry<String,Product> entry : productMap.entrySet()){
            if(entry.getValue().equals(productMap.get(product.getName()))){
                productMap.get(product.getName()).upCount();
                check=false;
            }
        }
        if(check==true){
            productMap.put(product.getName(),product);
            productMap.get(product.getName()).upCount();
        }
    }

   public void deleteProduct(String name){
       productMap.remove(name);
   }

    public Map<String, Product> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<String, Product> productMap) {
        this.productMap = productMap;
    }

    public void deleteAll(){
       productMap.clear();
    }
}
