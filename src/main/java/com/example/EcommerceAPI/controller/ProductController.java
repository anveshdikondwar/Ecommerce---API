package com.example.EcommerceAPI.controller;

import com.example.EcommerceAPI.model.Product;
import com.example.EcommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }
    @GetMapping("/productById")
    public  List<Product> getProductsByCategory(@RequestParam String category) {
        return productService.getProductsByCategory(category);
    }
    @DeleteMapping("/products/{productId}")
    public void deleteProductById(@PathVariable Integer productId){
        productService.deleteProductById(productId);
    }
}
