package com.shyam.design.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.design.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
