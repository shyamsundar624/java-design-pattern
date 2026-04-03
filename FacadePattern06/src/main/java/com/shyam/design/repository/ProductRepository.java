package com.shyam.design.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.design.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
