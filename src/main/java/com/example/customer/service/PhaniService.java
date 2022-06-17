package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repository.PhaniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhaniService {
    @Autowired
    private PhaniRepository repository;
    public void create(Customer c)
    {
        repository.save(c);
    }
    public List<Customer> getAll()
    {
        return repository.findAll();
    }
    public void update(Customer c)
    {
        repository.save(c);
    }
    public void deleteById(int id)
    {
        repository.deleteById(id);
    }
}
