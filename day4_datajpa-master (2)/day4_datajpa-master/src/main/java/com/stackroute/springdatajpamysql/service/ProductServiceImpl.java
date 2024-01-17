package com.stackroute.springdatajpamysql.service;


import com.stackroute.springdatajpamysql.entity.Product;
import com.stackroute.springdatajpamysql.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//Implement ProductService here
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    //Override all the methods here

    @Override
    public Product getProductById(long id) {
        Optional<Product> check=productRepo.findById(id);
        return check.orElseThrow(null);
    }

    @Override
    public String deleteProduct(Long productId) {

        if(productId!=null){
            productRepo.deleteById(productId);
      //    productRepo.deleteById(check.get().getProductId());

            return "Product Deleted";
        }
            return "Product not found";

    }

    @Override
    public Product updateProduct(Product product,long productId) {
        Optional<Product> existing= productRepo.findById(productId);

        if(existing.isPresent()){
            Product p=existing.get();
//            p.setProduct_id(product.getProduct_id());
            p.setProduct_name(product.getProduct_name());
            p.setProduct_price(product.getProduct_price());
            productRepo.save(p);
            return product;
        }
        return null;
    }


}
