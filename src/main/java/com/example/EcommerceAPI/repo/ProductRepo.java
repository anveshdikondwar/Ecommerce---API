package com.example.EcommerceAPI.repo;

import com.example.EcommerceAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {

    List<Product> findByCategory(String category);
}
