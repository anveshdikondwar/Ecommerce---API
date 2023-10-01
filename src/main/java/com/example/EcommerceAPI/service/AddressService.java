package com.example.EcommerceAPI.service;

import com.example.EcommerceAPI.model.Address;
import com.example.EcommerceAPI.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }

}
