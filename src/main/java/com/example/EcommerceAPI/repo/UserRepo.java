package com.example.EcommerceAPI.repo;

import com.example.EcommerceAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
