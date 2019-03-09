package com.example.poihaly.service;

import com.example.poihaly.entity.Customer;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface CustomerService extends UserDetailsService {
    void save(Customer customer);
}