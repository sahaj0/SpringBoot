package com.stackroute.springdatajpamysql.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Product {
    //Add Product entity fields, constructors and getters/setters here
    @Id
    private Long product_id;
    private String product_name;
    private  Double product_price;

    public Product(Long product_id, String product_name, Double product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    public  Product(){

    }


}
