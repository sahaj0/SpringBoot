package com.stackroute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Service indicates annotated class is a service which hold business logic in the Service layer
 */

@Service
public class OrderService {

    /**
     * declare a userService variable as private final
     */

    private  final UserService userService;
    /**
     * Autowire the UserService bean using constructor-based injection
     * use @Lazy annotation to load the UserService bean lazily
     */
    @Autowired
    @Lazy
    public  OrderService(UserService userService){
        this.userService=userService;
    }


    /**
     * Retrieves a list of orders, and return the list
     */
    public List<String> getOrders() {
        // Simulate fetching orders
        List<String> orderList = new ArrayList<>();
        orderList.add("Order1");
        orderList.add("Order2");
        return orderList;
    }

    /**
     * Retrieves the user associated with an order and returns a formatted string with the user details.
     */
    public String getOrderUser() {
        // return String with user details as Ordered user: userService.getUserDetails();
        return "Ordered user: "+ userService.getUserDetails();
    }
}