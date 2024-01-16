package com.stackroute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Service indicates annotated class is a service which hold business logic in the Service layer
 */
@Service
public class UserService {
    private String userName="John Doe";
    /**
     * declare a orderService variable as private final
     */


    /**
     * Autowire the OrderService bean using constructor-based injection
     */
     private  final OrderService orderService;

    @Autowired
    public  UserService(OrderService orderService){
        this.orderService=orderService;
    }

    /**
     return user details
     */
    public String getUserDetails() {
        // Simulate fetching user details
        System.out.println(this.userName);
        return this.userName;
    }

    /**
     * return the user's order details.
     */
    public String getUserOrders() {
        // return String with user details as User orders: orderService.getOrders()
        List<String> order= orderService.getOrders();
        return "User orders: " + order.toString();
    }
}
