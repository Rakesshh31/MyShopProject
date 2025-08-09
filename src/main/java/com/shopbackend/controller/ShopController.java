package com.shopbackend.controller;

import com.shopbackend.model.order;
import com.shopbackend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/shop")
public class ShopController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/order")
    public ResponseEntity<String> placeOrder(@RequestBody String orderDetails) {
        order order = new order(orderDetails);
        orderRepository.save(order);
        return new ResponseEntity<>("Order placed successfully: " + orderDetails, HttpStatus.OK);
    }

    @GetMapping("/photos")
    public String[] getShopPhotos() {
        return new String[]{"/images/pic1.jpg", "/images/pic2.jpg"};
    }

}
