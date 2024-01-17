package com.stackroute.springdatajpamysql.controller;

import com.stackroute.springdatajpamysql.entity.Product;
import com.stackroute.springdatajpamysql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    // Add controllers here for CRUD operations on Product entity.

    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        Product saved=productService.saveProduct(product);
        if(saved!=null){

            return new ResponseEntity<>(saved, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> productList=productService.getAllProducts();

        if(!productList.isEmpty()){
            return new ResponseEntity<>(productList,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("product/{productId}")
    public ResponseEntity<?> getProductById(@PathVariable("productId") long productId) {

        Product product=  productService.getProductById(productId);
        if(product!=null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        return new ResponseEntity<>("Product not found ",HttpStatus.NOT_FOUND);

    }
    @DeleteMapping("product/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable("productId") Long productId) {
        String deleteMessage=productService.deleteProduct(productId);
        if("Product Deleted".equals(deleteMessage)) {
            return new ResponseEntity<>(deleteMessage, HttpStatus.OK);
        }


        return new ResponseEntity<>(deleteMessage, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @PutMapping("products/{productId}")
    public ResponseEntity<?> updateProduct(@RequestBody Product product,@PathVariable long productId) {
        Product product1= productService.updateProduct(product,productId);

        return new ResponseEntity<>(product1,HttpStatus.OK);
    }
}
