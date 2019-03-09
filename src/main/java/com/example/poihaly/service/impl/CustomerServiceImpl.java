package com.example.poihaly.service.impl;


import com.example.poihaly.dao.CustomerDAO;
import com.example.poihaly.entity.Customer;
import com.example.poihaly.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDAO customerDAO;

    @Override
    public void save(Customer customer) {
        customerDAO.save(customer);

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return customerDAO.findByUsername(username);
    }
}