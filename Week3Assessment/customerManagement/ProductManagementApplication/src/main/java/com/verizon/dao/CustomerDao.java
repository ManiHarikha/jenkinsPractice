package com.verizon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

    Customer findByEmail(String email);
}
