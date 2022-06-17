package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.service.PhaniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhaniController {
    @Autowired
    private PhaniService service;
    @PostMapping("/create")
    public void create(@RequestBody Customer c)
    {
        service.create(c);
    }
    @GetMapping("/getAll")
    public List<Customer> getAll()
    {
        return service.getAll();
    }
    @PutMapping("/update")
    public void update(@RequestBody Customer c)
    {
        service.update(c);
    }
    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable int id)
    {
        service.deleteById(id);
    }
}
