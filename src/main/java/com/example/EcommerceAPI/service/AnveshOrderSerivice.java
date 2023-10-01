package com.example.EcommerceAPI.service;

import com.example.EcommerceAPI.model.AnveshOrder;
import com.example.EcommerceAPI.repo.AnveshOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AnveshOrderSerivice {

    @Autowired
    AnveshOrderRepo anishOrderRepo;

    public AnveshOrder createOrder(AnveshOrder order) {
        return anishOrderRepo.save(order);
    }

    public AnveshOrder getOrderById(Integer orderId) {
        return anishOrderRepo.findById(orderId).orElseThrow(() ->
                new NoSuchElementException("Order not found"));
    }
}
