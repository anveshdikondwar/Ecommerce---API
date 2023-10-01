package com.example.EcommerceAPI.controller;

import com.example.EcommerceAPI.model.AnveshOrder;
import com.example.EcommerceAPI.service.AnveshOrderSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class AnveshOrderController {

    @Autowired
    AnveshOrderSerivice anishOrderService;

    @PostMapping
    public AnveshOrder createOrder(@RequestBody AnveshOrder order) {
        return anishOrderService.createOrder(order);
    }

    @GetMapping("/{orderId}")
    public  AnveshOrder getOrderById(@PathVariable Integer orderId){
        return anishOrderService.getOrderById(orderId);
    }
}
