package com.stackroute.customresponse.controller;
import java.util.List;

import com.stackroute.customresponse.exception.ResourceNotFoundException;
import com.stackroute.customresponse.model.Product;
import com.stackroute.customresponse.response.ResponseHandler;
import com.stackroute.customresponse.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    //use try catch and return ResponseHandler with "Successfully retrieved data!" message
    @GetMapping("/products")
    public ResponseEntity<Object> getAllProduct() {
        try {

            List<Product> productList = productService.getAllProduct();
            if (productList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(productList, HttpStatus.OK);

        } catch (Exception e) {
            return  new ResponseEntity<>(new ResourceNotFoundException("Successfully retrieved data!"), HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    //use try catch and return ResponseHandler with "Successfully retrieved data!" message
    @GetMapping("/products/{id}")
    public ResponseEntity <Object> getProductById(@PathVariable long id) {
        try{
            Product product=  productService.getProductById(id);
            if(product!=null) {
                return new ResponseEntity<>("Successfully retrieved data!", HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
        catch (Exception e){

            return  new ResponseEntity<>(new ResourceNotFoundException("Something went wrong"), HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    //use try catch and return ResponseHandler with "Successfully added data!" message
    @PostMapping("/products")
    public ResponseEntity <Object> createProduct(@RequestBody Product product) {


        try{
                 productService.createProduct(product);
                return new ResponseEntity<>("Successfully added data!", HttpStatus.OK);

        }catch (Exception e){

            return  new ResponseEntity<>(new ResourceNotFoundException("Something went wrong"),      HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    //use try catch and return ResponseHandler with "Deleted!" message
    @DeleteMapping("/products/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable long id) {
        try {
            Product product=  productService.getProductById(id);
            if(product!=null) {
                return new ResponseEntity<>("Deleted!", HttpStatus.OK);
            }
            return new ResponseEntity<>("Product not found ",HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(new ResourceNotFoundException("Something went wrong"), HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    }
