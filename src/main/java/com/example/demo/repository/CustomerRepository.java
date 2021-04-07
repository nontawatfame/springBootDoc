package com.example.demo.repository;

import java.util.List;

import com.example.demo.dto.OrderResponse;
import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
    @Query("SELECT new com.example.demo.dto.OrderResponse(c.name, p.productName, c.id) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();

    @Query("SELECT u FROM Customer u WHERE u.id = 1")
    public List<Customer> findAllActiveUsers();
}
