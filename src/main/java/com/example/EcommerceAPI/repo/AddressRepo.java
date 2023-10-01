package com.example.EcommerceAPI.repo;

import com.example.EcommerceAPI.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
