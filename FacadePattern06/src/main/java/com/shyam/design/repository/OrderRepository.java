package com.shyam.design.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.design.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
