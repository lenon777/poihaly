package com.example.poihaly.dao;

import com.example.poihaly.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerDAO extends JpaRepository<Customer,Integer> {
    Customer findByUsername(String username);
    Customer findByEmail(String email);
    List<Customer> findAllByUsername(String username);
}
