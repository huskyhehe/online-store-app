package com.huskyhehe.onlinestorebackend.service;

import com.huskyhehe.onlinestorebackend.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();

}
