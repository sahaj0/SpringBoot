package com.stackroute.springdatajpamysql.repository;


import com.stackroute.springdatajpamysql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Create ProductRepo interface extending JpaRepository
@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
}
