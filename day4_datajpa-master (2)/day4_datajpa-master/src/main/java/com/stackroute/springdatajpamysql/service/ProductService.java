package com.stackroute.springdatajpamysql.service;

import com.stackroute.springdatajpamysql.entity.Product;

import java.util.List;

//Create service interface here
public interface ProductService {
    //Add abstract methods here

    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(long id);

    String deleteProduct(Long productId);

    Product updateProduct(Product product, long productId);
}
