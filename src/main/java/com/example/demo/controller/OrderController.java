package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody Customer request) throws JsonProcessingException {
        
        System.out.println(request.getId());
        System.out.println(request.getEmail());
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(request);
        System.out.println(json);
        customerRepository.save(request);

        return "customerRepository.save(request)";
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }
}
